package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadsel {
	
	
	
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/upload/";
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get(baseurl);
	}
	
	
	@Test
	public void test()
	
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\Lenovo\\Desktop\\software testing");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
	}
	
	
	
	
	
	
	

}
