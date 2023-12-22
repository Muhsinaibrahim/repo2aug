package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Amazonpage;

public class Amazontest {
	
	WebDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
	}
	
	@Test
	public void amzntest()
	{
	Amazonpage am=new Amazonpage(driver);
	am.setvalues("mobilephones");
	am.phonedetails();
	am.cart();
	}
}
