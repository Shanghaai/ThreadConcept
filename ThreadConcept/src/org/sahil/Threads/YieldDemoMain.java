package org.sahil.Threads;

public class YieldDemoMain {

	public static void main(String[] args) {
		
		YieldDemo t1  =new YieldDemo();
		
		t1.start();
		for (int j = 0; j < 5; j++) {
		
			System.out.println("main thread is running............");
			
		}
	}
	
	
}
