package org.sahil.Threads;

public class ReservationExampleMain 
{
	public static void main(String[] args) 
	{
		//tell that one berth is needed
       ReservationExample r1 = new ReservationExample(1);
	   Thread t1 = new Thread(r1);
	   Thread t2 = new Thread(r1);
	   Thread t3 = new Thread(r1);
	   
	   t1.setName("Mohd Sahil");  //Sahil's Thread
       t2.setName("Mohd Wasim"); //Wasim Thread
       t3.setName("Mohd Sameem");//sameem Thread
       
       t1.start(); //two thread acting on a single object
       t2.start();
       t3.start();
      String o = r1.getClass().getName();
      System.out.println("class name is : "+o);
    } 
}

