package day22;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisablingTestMethods {
	@Test(priority=1)
	void openURL()
	{
		System.out.println("URL opened");
		Assert.assertTrue(true);
	}
	@Test(priority=2)
	void login()
	{
		System.out.println(" login test");
		Assert.assertTrue(true);
		
	}
	@Test(priority=3,enabled=false)
	void search()
	{
		System.out.println("stil in progres............");
		
		
	}
	@Test(priority=4,enabled=false)
	void advsearch()
	{
		System.out.println("still in progress...........");
		
	}
	@Test(priority=5)
	void logout()
	{
		System.out.println(" logout test");
		Assert.assertTrue(true);
		
	}

}
