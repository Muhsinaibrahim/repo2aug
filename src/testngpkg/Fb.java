package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fb {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
@Parameters({"email","psswd"})
@Test
public void test(String email,String psswd)
{
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("pass")).sendKeys(psswd);
	driver.findElement(By.name("login")).click();	
}
	
	
	
	
	
	
}
