package main;

import java.rmi.Naming;

import itf.GreetingsITF;

public class GrretingsClient 
{
	public static void main(String[] args)
	{
		try
		{
			GreetingsITF greeter = (GreetingsITF)Naming.lookup("rmi://127.0.0.1/Grettings");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
