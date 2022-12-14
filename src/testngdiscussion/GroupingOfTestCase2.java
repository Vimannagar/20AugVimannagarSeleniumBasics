package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase2 {
	@Test(groups = "sanity")
	public void updateProfile()
	{
		System.out.println("update profile test case");
	}
	
	@Test(groups = "functional")
	public void deleteProfile()
	{
		System.out.println("delete profile test case");
	}
	
	
	@Test(groups = "sanity")
	public void addImage()
	{
		System.out.println("Adding image test case");
	}
	
	

}
