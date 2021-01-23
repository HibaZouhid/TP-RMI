package application;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello
{
    private String message;
    public HelloImpl(String s) throws RemoteException {
        super();
        message = s; }
    public String sayHello() throws RemoteException {
        return message;
    }}
