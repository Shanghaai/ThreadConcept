package org.sahil.Threads;

//Thread synchronization - two thread acting on a single object(berth)
public class ReservationExample implements Runnable
{
	//let the available berths are 1
	int Available  = 8;
	int wanted;
	
	//accept wanted berth at run time
	ReservationExample(int wanted)
	{
		this.wanted = wanted;
	}
	
	public void run()
	{
		synchronized(this)
		{
			//if available berths are more than wanted
			if(Available>=wanted)
			{
				//get the name of the passenger
				String name = Thread.currentThread().getName();
				//allot one seat for him
				System.out.println(wanted + " berth reserved for " +name);
				try 
				{
					Thread.sleep(1000);
					Available = Available - wanted;
					//display available berth 
					System.out.println("Total available berth are : "+Available);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("One Thread execution is successful");
				}
			}
			else
			{//if available berth are less
			  System.out.println("Sorry no berth are available");
			}
		}
	}
}
