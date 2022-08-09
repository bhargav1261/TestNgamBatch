package pack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {

	
	@Test
	
	void m1() 
	{
		System.out.println("This is m1 method from Testcase1");
		
	}
	@Test
	void m2()
	{
		System.out.println("This is m2 method from Testcase1");
		
	}
	
	@BeforeTest
	
	void mm()
	{
		System.out.println("This is mm");
	}
}
