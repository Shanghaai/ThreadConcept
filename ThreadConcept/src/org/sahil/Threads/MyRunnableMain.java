package org.sahil.Threads;
public class MyRunnableMain 
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyRunnable s1 = new MyRunnable(); //runnable object is like a car is ready to ride
		Thread s2 = new Thread(s1);      //so some one is required to drive this car i.e.=s2 and s1 is the car 
		                                //for thread
		s2.start();
		s2.sleep(1000);  //1000 mili sec = 1 sec
		//s2.start();    we can not invoke start method twice on same thread object will get illegleStateException
		//after t.start() we will have two thread 1.main thread 2.Child thread
		for (int i=0;i<10;i++)  
		{
			System.out.println("main thread");
		}
  }
}
//there is always a chance to get some different output