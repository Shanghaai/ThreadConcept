package org.sahil.Threads;

public class SingleTaskingDemo extends Thread
{
	public void run()
	{
		task1();
		task2();
		task3();
	}
		
	void task1()
	{
		System.out.println("task 1 complete");
	}
		
	void task2()
	{
		System.out.println("task 2 complete");
	}
		
    void task3()
    {
    	System.out.println("task 3 complete");
    }
}
