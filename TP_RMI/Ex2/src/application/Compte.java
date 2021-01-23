package application;

public interface Compte  extends java.rmi.Remote{
    public void  debiter( int compt )  throws java.rmi.RemoteException;
    public int  lireSolde( )  throws java.rmi.RemoteException;
    public void crediter( int compt )  throws java.rmi.RemoteException;
}
