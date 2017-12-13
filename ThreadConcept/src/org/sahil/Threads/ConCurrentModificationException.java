package org.sahil.Threads;

import java.util.ArrayList;
import java.util.Iterator;
/*
public class ConCurrentModificationException extends Thread 
{
	 static ArrayList<String> a1  =new ArrayList<String>();
	
	@Override
	public void run() 
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e){}
		
		System.out.println("Child Thread trying to Update the List object");
		a1.add("E");
	}
	
	public void m1()
	{
		System.out.println("inside m1 method");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		
		Thread t1 = new Thread(new ConCurrentModificationException());		
		t1.start();
		
		Iterator itr = a1.iterator();
		while (itr.hasNext()) 
		{
			String object = (String) itr.next();
			System.out.println("Main Thread iterating the object and the current object is :"+object);
				Thread.sleep(3000);
		}
		System.out.println(a1);
     }
}
*/

import java.util.ArrayList;
import java.util.Iterator;

public class ConCurrentModificationException {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		Iterator itr = a1.iterator();
		while (itr.hasNext()) {
			String object = (String) itr.next();
			System.out.println("Main Thread iterating the object and the current obj:" + object);
			a1.add("E");
		}
		System.out.println("outside loop :" + a1);
	}
}
