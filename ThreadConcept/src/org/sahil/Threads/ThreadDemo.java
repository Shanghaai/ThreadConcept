package org.sahil.Threads;

public class ThreadDemo extends Thread
{
	@Override
	public void run() 
	{

		System.out.println(Thread.currentThread().getName());
	}
}