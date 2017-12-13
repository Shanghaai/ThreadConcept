package org.sahil.ThreadsScenerios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Places 
{
	public void myPlces()
	{
		Set t  = new HashSet();
		t.add("potty place");
		t.add("Pakka Talab");
		t.add("AnilKiDukaan");
		t.add("PanditJi");
		t.add("Home Alone");
		t.add("et cetra and cetra and cetra");
		System.out.println(" My fav places in Eatwah comparises  of :  ");
		Iterator itr = t.iterator();
		while (itr.hasNext()) 
		{
			Object myplaces = (Object) itr.next();
			System.out.println(myplaces);
		}
	}
}
