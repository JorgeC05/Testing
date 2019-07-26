package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase3 {

	@Test(priority=2,dependsOnMethods = "doUserregister")
	public void doLogin(){
		System.out.println("Executing login test");		
	}
	
	@Test (priority=1)
	public void doUserregister(){
		System.out.println("Executing user register test");
		Assert.fail("The user did not register ok");
	}
	
	@Test(priority=3)
	public void test3(){
		System.out.println("Executing test 3");		
	}
	
	@Test(priority=4)
	public void test4(){
		System.out.println("Executing test 4");		
	}
}
