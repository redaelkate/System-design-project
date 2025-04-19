package corba;

import shared.SharedData;
import GestionLivre.*;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.*;
import org.omg.PortableServer.*;

public class ServeurBibliotheque extends BibliothequePOA {
    private ORB orb;

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    @Override
    public void insererLivre(Livre livre) {
        System.out.println("Livre inséré : " + livre.NomLivre);
    }

    @Override
    public void retirerLivre(Livre livre) {
        System.out.println("Livre retiré : " + livre.NomLivre);
    }

    @Override
    public Livre rechercherLivre(String NomLivre) {
        Livre livre = new Livre();
        livre.NomLivre = NomLivre;
        livre.AuteurLivre = SharedData.DEFAULT_AUTEUR;
        livre.ISBN = "123456789";
        livre.NumeroExemplaire = 1;
        livre.Editeur = SharedData.DEFAULT_EDITEUR;
        livre.genre = Genre.roman;
        return livre;
    }

    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);

            ServeurBibliotheque serveur = new ServeurBibliotheque();

            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.activate_object(serveur);

            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(serveur);
            Bibliotheque href = BibliothequeHelper.narrow(ref);

            NamingContextExt ncRef = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));
            NameComponent path[] = ncRef.to_name(SharedData.CORBA_SERVICE_NAME);
            ncRef.rebind(path, href);

            System.out.println("Serveur prêt et en attente...");
            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}