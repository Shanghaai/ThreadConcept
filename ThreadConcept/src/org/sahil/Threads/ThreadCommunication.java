package org.sahil.Threads;
//thread communication by wait and notify
public class ThreadCommunication 
{
	public static void main(String[] args) 
	{
		//Producer produces some data which consumer consumes
		Producer obj1 = new Producer();
		//pass production of producer i.e. object(data) to consumer
		//so that it is available to customer or consumer
		Consumer obj2 = new Consumer(obj1);
		
		//create two thread and attach to producer and consumer
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		//run the threads
		t2.start(); //consumer waits
		t1.start();//producer starts production
	}
}
