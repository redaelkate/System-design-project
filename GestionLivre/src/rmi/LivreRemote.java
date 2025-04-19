package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LivreRemote extends Remote {
    void insererLivre(LivreDTO livre) throws RemoteException;
    void retirerLivre(LivreDTO livre) throws RemoteException;
    LivreDTO rechercherLivre(String nomLivre) throws RemoteException;
}