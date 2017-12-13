package org.sahil.Threads;

public class JoinClient {

	public static void main(String[] args) throws InterruptedException {
		JoinDemo t1 = new JoinDemo();
		
		
		t1.start();//at this point of time there will two threads here 
	 	//t1.join();//Main thread will be waiting for until child thread completes
	 	t1.join(5000);//now main thread will wait only for 5 sec
		
		for (int j = 0; j < 10; j++) {
			
			System.out.println("Main Thread running.......");
		}
		
	}
}
