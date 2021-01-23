package application;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {

        try {
            Hello hello = (Hello) Naming.lookup("rmi://localhost:1099/BK");
            System.out.println(hello.sayHello());
        }
        catch(Exception e) {

            System.out.println("Serveur erreur :"+e);

        }}
    }

