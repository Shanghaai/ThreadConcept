package org.sahil.Threads;

public class HappyNewYear {
	
	public synchronized void wish(String name) {

	if(true) 
	{
		System.out.print("Have a very happy new year : ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		System.out.println(name);
		return;
	  }
	}
}