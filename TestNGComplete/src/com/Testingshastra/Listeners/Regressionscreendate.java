package com.Testingshastra.Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CustomTestListeners.TestListenerScreenDate;

@Listeners({TestListenerScreenDate.class})
public class Regressionscreendate {
	@Test
	public void m1() {
	System.out.println("My first test case");
	Assert.assertEquals("Hi", "Hi");
	}
	@Test
	public void m2() {
		System.out.println("My second test case");
		Assert.assertEquals(1, 1);
	}
	@Test
	public void m3() {
		System.out.println("My third test case");
	    Assert.assertEquals(2, 3); 
	}
	@Test
	private void m4() {
		System.out.println("My forth test case");
		Assert.assertEquals(3, 3);
	}

	}

