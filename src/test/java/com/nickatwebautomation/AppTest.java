package com.nickatwebautomation;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest {
	@Test
	public void testlogin1() {
		App myapp = new App();
		Assert.assertEquals(1, myapp.userLogin("abd", "abd@123"));
	}
	
	public void teslogin2() {
		App myapp = new App();
		Assert.assertEquals(0, myapp.userLogin("abd", "abd123"));
	}
}
