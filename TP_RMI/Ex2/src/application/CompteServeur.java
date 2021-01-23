package application;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CompteServeur {
    public static void main(String[] args) throws RemoteException {
       CompteImpl compte = new CompteImpl(100);

        try {

            LocateRegistry.createRegistry(1099);
            Naming.rebind( "rmi://localhost:1099/CompteCourant", compte);
            System.out.println("Serveur prêt");
        }
        catch (Exception e) {
            System.out.println("Serveur erreur :"+e);
        }}
    }

