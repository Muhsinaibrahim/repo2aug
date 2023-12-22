package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerthandling {
	

	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
	
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"context-menu-layer\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	}
	

}
