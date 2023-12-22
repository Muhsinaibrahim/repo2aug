package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandling {
	WebDriver driver;

	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
	}
		
		@Test
		public void test()
		{
		driver.get("http://demo.guru99.com/popup.php")	;
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent Window Title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allWindowHandles=driver.getWindowHandles();
		for (String handle : allWindowHandles)
			
		{
		if(!handle.equalsIgnoreCase(parentWindow))	{
			driver.switchTo().window(handle);
			String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
			driver.close();
			
			
		}
		driver.switchTo().window(parentWindow);
		}
		
				
			
			
			
			
		}
	
	
	
	
	
	

}
