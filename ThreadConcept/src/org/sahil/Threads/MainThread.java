package org.sahil.Threads;

public class MainThread implements Runnable{
	public static void main(String[] args) {
		MainThread m = new MainThread();
		Thread t  = new Thread();
		System.out.println(t.currentThread());
		
		System.out.println(t.NORM_PRIORITY);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
