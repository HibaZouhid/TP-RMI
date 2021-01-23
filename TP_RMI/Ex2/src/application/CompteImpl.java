package application;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class CompteImpl extends UnicastRemoteObject implements Compte{

    private int montant ;

    public CompteImpl(int montant) throws RemoteException {
        this.montant = montant ;
    }

    @Override
    public void debiter(int som) throws RemoteException {
        this.montant += som;
    }

    @Override
    public int  lireSolde() throws RemoteException {
        return  this.montant;
    }

    @Override
    public void crediter(int som) throws RemoteException {
        this.montant -= som;
    }
}
