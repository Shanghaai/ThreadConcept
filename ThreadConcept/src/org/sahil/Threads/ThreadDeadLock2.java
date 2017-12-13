package org.sahil.Threads;

public class ThreadDeadLock2 extends Thread {

	Object train;
	Object comp;

	public ThreadDeadLock2(Object train, Object comp) {
		super();
		this.train = train;
		this.comp = comp;
	}

	@Override
	public void run() {

		synchronized (comp) {

			System.out.println("Now Thread has a lock on Comp Object : " + Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("Exception Occurs  : " + e.getMessage());
			}

			synchronized (train) {
				System.out.println("Succesfully Locked the Train Object" + Thread.currentThread().getName());

			}
		}

	}

	public static void main(String[] args) {

		Object train = new Object();
		Object comp = new Object();

		ThreadDeadLock lock = new ThreadDeadLock(train, comp);
		ThreadDeadLock2 lock2 = new ThreadDeadLock2(train, comp);

		Thread t1 = new Thread(lock);
		Thread t2 = new Thread(lock2);

		t1.start();
		t2.start();

	}

}
