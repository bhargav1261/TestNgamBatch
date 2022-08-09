package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	WebDriver driver=null;
	@Parameters("browser")
	@Test(priority=1)
	public void launchbrowser(String br)
	{
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
			if(br.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Bhargav\\Desktop\\geckodriver-v0.31.0-win64//geckodriver.exe");
	               driver =new FirefoxDriver();
			}
			else 
				if(br.equals("edge"))
			{
				System.setProperty("webdriver.edge.driver","C:\\Users\\Bhargav\\Desktop\\edgedriver_win64\\msedgedriver.exe");
				 driver=new EdgeDriver();
			}
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=2)
	public void  verifyTitle()
	{
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	@Test(priority=3)
	public void registration()
	{
		Assert.assertTrue(true);
		//write code for registration form
	}
	@Test(priority=14)
	public void closeBrowser()
	{
		driver.close();
	}

}
