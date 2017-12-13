package org.sahil.ThreadsScenerios;

import java.util.Scanner;

public class Prakhar extends Thread
{
	String room="";
	
	public void riskTaker()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("If there is any one in the Home?");
		String s =sc.nextLine();
		
		if(s.equalsIgnoreCase("yes"))
		{
			System.out.println("khus jao ghar bc");
		}
		else 
		{
			System.out.println("we'll try next time :) ");
		}
	}
	
}
