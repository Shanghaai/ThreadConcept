package org.sahil.Threads;

public class Consumer implements Runnable 
{
	//create producer reference to refer producer data in consumer class
	 Producer prod;

	public Consumer(Producer pro) 
	{
		this.prod = pro;
	}

	public void run() 
	{
		synchronized (prod.sb)
		{
			//wait till a notification is received from a producer Thread 
			//here there is no wastage of time even a single sec bcz of wait method
			try {
				prod.sb.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//when data production is over display the data of String Buffer
			System.out.println(prod.sb);
		}
	}
}
