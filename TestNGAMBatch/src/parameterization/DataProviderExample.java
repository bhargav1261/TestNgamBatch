package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test(dataProvider="users") //dataProvider is parameter of @Test annotation
	void logintest(String uname,String pwd)
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
	}

	@DataProvider(name="users")// DataProvider is annotation
	String [][] logindata()
	{
		String data[][]= {{"bhargav123","niran"},{"bhargav1234","niranj"},{"bhargav12345","nir"}};
		return data;
	}
	@AfterClass
	void closeBrowser()
	{
		
	}
}
