package org.sahil.Threads;

import org.sahil.Threads.*;
public class JoinDemo extends Thread{

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread running ......");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
