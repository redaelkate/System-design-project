package jms;

import javax.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;
import shared.SharedData;
import rmi.LivreDTO;
import rmi.Genre;

public class Producer {
    public static void main(String[] args) throws JMSException {
        ConnectionFactory factory = new ActiveMQConnectionFactory(SharedData.BROKER_URL);
        Connection connection = factory.createConnection();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        Queue queue = session.createQueue(SharedData.QUEUE_NAME);
        MessageProducer producer = session.createProducer(queue);

        rmi.LivreDTO livre = new rmi.LivreDTO(
            "Le Seigneur des Anneaux",
            "J.R.R. Tolkien",
            "978-0547928227",
            1,
            SharedData.DEFAULT_EDITEUR,
            Genre.ROMAN
        );

        ObjectMessage message = session.createObjectMessage(livre);

        producer.send(message);
        System.out.println("Message envoyé : " + livre.getNomLivre());

        session.close();
        connection.close();
    }
}