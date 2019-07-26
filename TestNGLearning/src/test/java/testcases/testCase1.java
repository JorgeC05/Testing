package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testCase1 {
	
	@BeforeTest
	public void createDBconnection(){
		System.out.println("Creating DB Connection");
	}
	
	@AfterTest
	public void closeDBconnection(){
		System.out.println("Closing DB Connection");
	}
	
	
	@BeforeMethod
	public void launchBrowser(){
		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.out.println("Closing Browser");
	}
	
	
	@Test(priority=2)
	public void doLogin(){
		System.out.println("Executing login test");
	}
	
	@Test (priority=1)
	public void doUserregister(){
		System.out.println("Executing user register test");
	}
}
