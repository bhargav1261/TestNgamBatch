package Day21;

import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority=10)
void login()
{
	System.out.println("This is login");
}
	@Test(priority=30)
 void logout()
 {
	System.out.println("This is Logout" );
	
	}
	@Test(priority=5)
	void openURL() 
	{
		System.out.println("This is open URL");
	}
}
