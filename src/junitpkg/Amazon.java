package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	String baseurl="https://www.amazon.in";
	@Before
	public void setup() throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	Thread.sleep(100000);
		
	}
	@Test
	public void amazontest()
	{
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbutton.sendKeys("mobiles");
		searchbutton.submit();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-cart-count']")).click();
		
	}
}
	
