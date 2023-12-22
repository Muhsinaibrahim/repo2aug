package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayalertbox {
	ChromeDriver driver;
	String baseurl="file:///C:/Users/Lenovo/Desktop/display.html";
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get(baseurl);
	}

	@Test
	public void alerttest()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
	String alertext=a.getText();
	if (alertext.equals("Hello iam an alertbox"))
			{
		System.out.println("pass");
			}
	else
	{
		System.out.println("fail");
	}
		a.accept();
		//a.dismiss();//to cancel alert
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("ghk");
		
	}
}
