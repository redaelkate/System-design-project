package shared;

public class SharedData {
    // Configuration JMS (ActiveMQ)
    public static final String BROKER_URL = "tcp://localhost:61616";
    public static final String QUEUE_NAME = "GestionLivreQueue";

    // Configuration CORBA
    public static final int CORBA_PORT = 1050;
    public static final String CORBA_SERVICE_NAME = "Bibliotheque";

    // Configuration RMI
    public static final String RMI_REGISTRY_HOST = "localhost";
    public static final int RMI_REGISTRY_PORT = 1099;
    public static final String RMI_SERVICE_NAME = "LivreRemote";

    // Autres valeurs par défaut
    public static final String DEFAULT_EDITEUR = "Éditeur inconnu";
    public static final String DEFAULT_AUTEUR = "Auteur inconnu";
}