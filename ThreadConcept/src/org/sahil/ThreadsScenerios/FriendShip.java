package org.sahil.ThreadsScenerios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FriendShip extends Places
{

	Map m  = new HashMap();
	
	public void jokes()
	{
		System.out.println("I seriously hate jokes made by Ankur Those were really heart :( hahahah ");
		m.put(1, "bhai Bhari Ho gaya h");
		m.put(2, "jey gaana kon sa sun rey le saale : dekh jara tu jaane mehboobi");
		m.put(3, "hainnnnnnnnnnnnnnnnnnnnnnnnnnnn sahi me");
		m.put(4, "motey saale: i actually didn't remember this joke but was awesome");
		
		Set set = m.entrySet();
		Iterator itr = set.iterator();
		
		System.err.print("Jokes that we made.......");
		while (itr.hasNext()) {
			Object jokes = (Object) itr.next();
			System.out.println(jokes);
		}
	}
}
