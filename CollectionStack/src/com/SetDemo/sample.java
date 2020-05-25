package com.SetDemo;

import java.util.Hashtable;

public class sample {
	public static void main(String[] args) {
		Hashtable ht=new Hashtable(4);
		ht.put(15, "Avinash");//15%11 why 11 bcoz capacity is 11	 
		ht.put(10, "Satish");//10
		ht.put(21, "Amol");//21%11=10
		ht.put(25, "Sagar");//25%1=3
		System.out.println(ht);
		/*
		 * If hashcode of element is >than
		 */
		//Student s=new Student();
		
		
	}

}
