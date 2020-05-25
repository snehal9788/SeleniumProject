package com.StackDemo;

import java.util.Stack;

public class Demo1 {
	public static void main(String[] args) {
		Stack s=new Stack();
/* Object push(Object 0):
 * It insert an object o at top in stack
 * it return the same object which it is adding to the stack
 */
		s.push(10);
		s.push(20);
		//s.push(null);
		s.push("Hello");
		s.push(10);
		s.push(50);
		s.push(40);

System.out.println("Before pop"+s);
		Object x=s.pop();	
		System.out.println("After pop:"+s);

/*You need to convert x in wrapper class i.e.(Integer)x 
 * some times without convert it will return hashcode
 */
		System.out.println("Removed "+(Integer)x+" from the top");
		System.out.println("Removed "+x+" from the top");	

		System.out.println("Before peek"+s);
		Object y=s.peek();
		System.out.println("After peek:"+s);
		
/*int search(Object o)
 * 
 */
System.out.println("Location of 20 is:"+s.search(20)+" Offset");	
System.out.println("Location of 10 is:"+s.search(10)+" Offset");
	}

}
