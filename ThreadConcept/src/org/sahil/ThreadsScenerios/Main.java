package org.sahil.ThreadsScenerios;

public class Main 
{
	
	public static void main(String[] args) {
		Producer pr  =new Producer();
		Consumer c= new Consumer(pr);
		
		Thread t1 = new Thread(pr,"Producer");
		Thread t2 = new Thread(c,"Consumer");

		t2.start();
		
		
		t1.start();
		
	}
}
