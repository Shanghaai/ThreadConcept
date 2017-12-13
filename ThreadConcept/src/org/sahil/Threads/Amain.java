package org.sahil.Threads;

class Amain
{
	public static void main(String[] args) throws InterruptedException 
	{
		A a1=new A();
		A a2=new A();

		Thread thread1 = new Thread(a1);
		Thread thread2 = new Thread(a2);
		thread1.setPriority(1);
		thread1.start();
		
		Thread.sleep(5000);
		
		System.out.println("==============thread2 starts here=======");
		System.out.println(Thread.currentThread().getName()+" : back to main method : main Thread");
		System.out.println("Current Thread Priority in main(): "+Thread.currentThread().getPriority());
		System.out.println("Name in main method :"+Thread.currentThread().getName());
		a1.x1(21, 22);
	}
}