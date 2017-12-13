package org.sahil.Threads;

public class YieldDemo extends Thread
{
	
	@Override
	public void run() {

	
		for (int i = 0; i < 10; i++) {
			
			System.out.println("child thread is runnig,,,,,,,");
			Thread.yield(); // here for every loop child thread is saying to jvm give chance to main thread .....
			//yield() used by thread which requires more time of Telephone Booth
		}
	}
}
