package com.SetDemo;

import java.util.Hashtable;

public class hashTableDemo {
	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
		ht.put(1, 10);
		ht.put(2, 20);
		ht.put("Hello", 30);
		ht.put(3.14f, 40);
		ht.put('A', 50);
		System.out.println(ht);//all elements store by its hashcode
		System.out.println(new Integer(2).hashCode());//for preint hashcode of 2
		System.out.println(new Float("3.14f").hashCode());
		System.out.println(new String("A").hashCode());
		//ht.put(new key(1), 10);default capacity is 11 
		//ht.put(new key(2), 20);
	 hashTableDemo d=new hashTableDemo();
	 System.out.println(d.hashCode());//use for to see hashcode of any object
		String h="Hello";
		System.out.println("Hashcode of h is:"+h.hashCode());
		
	}

}
