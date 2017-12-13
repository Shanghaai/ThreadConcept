package org.sahil.Threads;

public class SingleTaskingMain 
{
	public static void main(String[] args)
    {
	  SingleTaskingDemo s1 = new SingleTaskingDemo();
	  Thread t1  = new Thread(s1);
	  t1.start();
   }
}
