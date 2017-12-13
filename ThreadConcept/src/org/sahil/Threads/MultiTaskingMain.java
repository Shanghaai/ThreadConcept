package org.sahil.Threads;

public class MultiTaskingMain 
{
  public static void main(String[] args) 
  {
	MultiTasking m1 = new MultiTasking("First Thread(men) Cutting the ticket");
	MultiTasking m2 = new MultiTasking("Second Thread(men) showing the seat");
	
	Thread th1 = new Thread(m1);
	Thread th2 = new Thread(m2);
	
	th1.setName("1");
	th2.setName("2");
	
	th1.start();
	th2.start();
   }	
}
