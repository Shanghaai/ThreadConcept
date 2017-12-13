package org.sahil.Threads;

public class ThreadDeadLock  extends Thread
{
	Object train;
	Object comp;
	
	public ThreadDeadLock(Object o1 , Object o2) {
		this.train = o1;
		this.comp = o2;
	}
	

	public void run() {
		
		synchronized (train) {
		
				System.out.println("Now Thread has a lock on train Object :"+Thread.currentThread().getName());
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
			synchronized (comp) {
				System.out.println("Thread has Loked the comp object : "+Thread.currentThread().getName());
			}
			
			//System.out.println("Now thread waiting for lock on Comp object");
		}
		
		
	}
	
}

