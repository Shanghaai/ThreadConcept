package org.sahil.ThreadsScenerios;

public class MyJourney {
	public static void main(String[] args) {
		Places p = new Places();
		FriendShip f = new FriendShip();
		Life l = new Life(p, f, "Prakhar", "Ankur", "Shivam Shrestha", "Shivam Kumar");
		Thread t1 = new Thread("Prakhar");
		Thread t2 = new Thread("Ankur");
		Thread t3 = new Thread("ShivamShreshtha");
		Thread t4 = new Thread("Shivam Kumar");

		t1.start();
		l.childHood();
		l.happiNess();
		l.death();
	}
}
