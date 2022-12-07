package testngdiscussion;

import org.testng.annotations.Test;

public class TimeOutKeyword {
	
	@Test(timeOut = 2000)
	public void testCase() throws InterruptedException
	{
		System.out.println("Time out test case");
		
		Thread.sleep(3000);		
	}

}
