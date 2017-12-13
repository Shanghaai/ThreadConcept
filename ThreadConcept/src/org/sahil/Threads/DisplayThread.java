package org.sahil.Threads;

public class DisplayThread extends Thread{

	HappyNewYear d;
	String name;
	public DisplayThread(HappyNewYear d,String name) {
		this.d = d;
		this.name=name;
	}
	@Override
	public void run() {
		d.wish(name);
	}
}
