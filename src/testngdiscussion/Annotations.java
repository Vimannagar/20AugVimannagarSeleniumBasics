package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	
	
	@Test
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Test case 2");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	
	

}
