package jms;

import javax.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Consumer {
    public static void main(String[] args) throws JMSException {
        ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        Connection connection = factory.createConnection();
        connection.start();

        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        Queue queue = session.createQueue("GestionLivreQueue");
        MessageConsumer consumer = session.createConsumer(queue);

        Message message = consumer.receive();
        if (message instanceof ObjectMessage) {
            ObjectMessage objectMessage = (ObjectMessage) message;
            rmi.LivreDTO livre = (rmi.LivreDTO) objectMessage.getObject();
            System.out.println("Message reçu : " + livre.getNomLivre());
        }

        session.close();
        connection.close();
    }
}