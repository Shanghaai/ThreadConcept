package org.sahil.Threads;

public class ThreadA
{
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		
		/*try {//here main Thread is sleeping for 2 sec with in that much of time is can execute 1 cr for loops
			 //Thread.sleep(0,1); is also fine
			System.out.println("Main thread is sleeping....");
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		*/
		
		//b.join();
        synchronized (b) 
        {
        	System.out.println("Main Thread trying to call wait() method");
		    b.wait();//caouse m expecting some updation 
       }	
		System.out.println(b.total);
	}
}
