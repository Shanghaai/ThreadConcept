package org.sahil.Threads;

class MyRunnable implements Runnable
{
	/*
	 * //defining a job for thread
	 * @see java.lang.Runnable#run()
	 */
   public void run()
   {
	   System.out.println("running run() method"); 
	   for (int i=0;i<10;i++)
	   {
		   System.out.println("childThread");
	   }
   }
}

