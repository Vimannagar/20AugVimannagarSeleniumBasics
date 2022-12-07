package testngdiscussion;

import org.testng.annotations.Test;

public class InvocationCountKeyword {
	
	
	@Test(invocationCount = 5)
	public void testcase1()
	{
		System.out.println("Test case 1 is executing");
	}

}
