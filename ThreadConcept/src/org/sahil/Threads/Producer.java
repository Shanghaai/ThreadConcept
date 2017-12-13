package org.sahil.Threads;

public class Producer implements Runnable 
{

	//to add data we should use string buffer object
	StringBuffer sb;
	
	//dataprodover will be true when data production will over
	Producer()
	{
		sb = new StringBuffer();  //allot memory
	}
	public void run() 
	{
		synchronized(sb)
		{
			//go on appending data to string buffer object
			//getting production ready for consumer
			for(int i=1;i<=10;i++)
			{
				sb.append(i+":");
				try 
				{
					Thread.sleep(100); //time for production
					System.out.println("appending...");
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			//data production is over so notify to consumer thread
			sb.notify();
		}
	}
}
