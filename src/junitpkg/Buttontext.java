package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontext {

	
	
	
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get(baseurl);
	}

	@Test
	public void buttontexttest()
	{
	String buttontext=driver.findElement(By.xpath("//*[contains(@name,'btnchkavail')]")).getAttribute("value");
	if(buttontext.equals("Check Availability"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	}
	
}
