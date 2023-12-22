package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbcreatepage;
import page.Fbloginpage;

public class Fblogintest {

	
	
	WebDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void logintest()
	{
		Fbloginpage ob=new Fbloginpage(driver);//
		ob.setvalues("abd@gmil.com", "adad");//
		ob.login();//
		//Fbcreatepage ob1=new Fbcreatepage(driver);
		//ob1.pageclick();
		//ob1.getstarted();
	}
	
}
