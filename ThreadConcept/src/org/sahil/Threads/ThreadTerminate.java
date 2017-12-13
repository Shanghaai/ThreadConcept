package org.sahil.Threads;

public class ThreadTerminate extends Thread
{
	boolean stop = false;
		public void run()
		{
			for(int i=0;i<1000000;i++)
			{
				System.out.println("inside run method of thread terminate");
			}
		}
	}
