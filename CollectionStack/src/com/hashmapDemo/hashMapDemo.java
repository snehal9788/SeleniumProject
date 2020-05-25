package com.hashmapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashMapDemo {
	public static void main(String[] args) {
		
	HashMap hm = new HashMap();
	
	hm.put(10,"Amar");
	hm.put(20,"Akbar");
	hm.put(30,"Anthony");
	hm.put(40,"Ram");
//first approach
	Set keys = hm.keySet();
	Iterator itr=keys.iterator();
    
    while(itr.hasNext()) {
      System.out.println(hm.get(itr.next()));
 }
    // second approch
    Set entries= hm.entrySet();
    Iterator itr1=entries.iterator();
    while(itr1.hasNext()) {
     Entry entry=(Entry)itr1.next();
    	System.out.println(entry.getKey()+"\t"+entry.getValue());
    }
}
}