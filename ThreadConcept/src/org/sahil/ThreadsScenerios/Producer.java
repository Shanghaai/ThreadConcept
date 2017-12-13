package org.sahil.ThreadsScenerios;

public class Producer extends Thread
{
	Producer pro;
	StringBuffer sb;
	
	public Producer() {
		sb = new StringBuffer();
	}
	public void run()
	{
		synchronized (sb) 
		{
		 
		   for(int i=0;i<5;i++)
	     	{
			   try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   System.out.println("production starts.....");
			   System.out.println(sb.append(i));
		    }
		  sb.notify();
     	}
	}
	
 }