package application;

import java.rmi.Naming;

public class Test {
    public static void main(String[] args) {
        try {

            Compte compte = (Compte) Naming.lookup("rmi://localhost:1099/CompteCourant");

            compte.crediter(800);
            compte.debiter(500);

            System.out.println(compte.lireSolde());
        }
        catch(Exception e) {System.out.println("Serveur erreur :"+e); }}
}

