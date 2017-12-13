 package org.sahil.Threads;

class A extends Thread
{	
	
	@Override
	public  void  run()

		{
			System.out.println("i am inside run method : child Thread");
			System.out.println("current Thread in run() method:"+Thread.currentThread().getPriority());
			
			/*
			try {
				Thread.sleep(2000);
				System.out.println("sleeping.........");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			System.out.println("Name : "+Thread.currentThread().getName());
			System.out.println("1111111");
			System.out.println("2222222");
			System.out.println("3333333");
		}
	
	public void x1(int x,int y)
	{
		System.out.println("x value:"+x+"y value :"+y);
	}

	
}
