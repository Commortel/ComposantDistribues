package itf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GreetingsITF extends Remote{
	public void greetings(String m) throws RemoteException;
}
