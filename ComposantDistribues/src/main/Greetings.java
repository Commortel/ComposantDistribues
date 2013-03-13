package main;

import itf.GreetingsITF;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Greetings extends UnicastRemoteObject implements GreetingsITF{

	protected Greetings() throws RemoteException {
		super();
	}
	
	public void greetings(String m) throws RemoteException
	{
		System.out.println("Hello " + m);
	}
	
	public static void main(String[] args)
	{
		try
		{
			Greetings greetings = new Greetings();
			Naming.rebind("Greetings", greetings);
			System.out.println("Grretings source added");
		}
		catch(RemoteException | MalformedURLException re)
		{
			System.out.println("Greetings initialisation failed");
		}
	}
}
