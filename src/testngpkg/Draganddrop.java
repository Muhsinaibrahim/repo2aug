package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {


	
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get(baseurl);
	String p= driver.getPageSource();
	}
@SuppressWarnings("unlikely-arg-type")
@Test
public void test()	
{
	WebElement fivethousand=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement amount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	WebElement Bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement account=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement account2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	WebElement fivethousand2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement amount2=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	
	
	
	Actions action=new Actions(driver);
	action.dragAndDrop(fivethousand, amount).build().perform();
	action.dragAndDrop(Bank, account).build().perform();
	action.dragAndDrop(sales, account2).build().perform();
	action.dragAndDrop(fivethousand2, amount2).build().perform();
	WebElement button=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
	
	
	
}
}
	
