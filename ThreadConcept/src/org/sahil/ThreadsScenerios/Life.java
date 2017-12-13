package org.sahil.ThreadsScenerios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Life {
	Places p;
	FriendShip f;
	private String name1,name2,name3,name4;
	public Life(Places p, FriendShip f, String name1, String name2,
	String name3, String name4) {
		this.p = p;
		this.f = f;
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
	}
	public void childHood(){
		System.err.println("Best Time In AnyOnce life ! and they made it so much more Interesting :  "+name1);
		System.out.println("i was lucky to have you all man"+name2);
		System.out.println(name3+" : "+name4);
	}
	public void happiNess(){
		System.err.println("Happiness : Not everyOne will get it ! Hence No Gurrrantee here");
		p.myPlces();
		f.jokes();
	}
	public void death(){
		System.err.println(" Death : now i dont want to say anything...its fine now :)");
	}
}
