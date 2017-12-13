package org.sahil.Threads;

public class MultiTasking implements Runnable {
	private String str;

	MultiTasking(String str) {
		this.str = str;
	}

	public void run() {
		synchronized (this) {
			for (int i = 1; i < 10; i++) {
				System.out.println(str + " :" + Thread.currentThread().getName());

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
