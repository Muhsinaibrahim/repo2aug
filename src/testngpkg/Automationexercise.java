package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexercise {

	String baseurl="https://www.automationexercise.com";
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test(enabled=false)
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("fathima muhsina");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("muhseenak995@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"uniform-id_gender2\"]")).isSelected();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Muhsina@234");
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select day=new Select(dayelement);
		day.selectByValue("10");
		WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select month=new Select(monthelement);
		month.selectByValue("8");
		WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select year=new Select(yearelement);
		year.selectByValue("2001");
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("fathima ");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys(" muhsina");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("abcd ");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("ghbj,bhbhfg,abcd ");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("bghn,hghfyj,bghj ");
		WebElement countryelement=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select country=new Select(countryelement);
		country.selectByValue("India");
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("kearla");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("ernamkulam ");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("682028 ");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9876567897");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
	}
		@Test(priority=1)
		public void test2()
		{
			 driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
			  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("muhseenak995@gmail.com");
			
			  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[3]")).sendKeys("Muhsina@234");
			 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button")).click();
			 String expectedurl="https://automationexercise.com/";
			 String crnturl=driver.getCurrentUrl();
			 if(crnturl.equals(expectedurl))//*[@id="form"]/div/div/div[1]/div/form/input[2]
			 {
			  System.out.println("crnturl");
			 }
			 else
			 {
			  System.out.println("url is different");
			  System.out.println("actual url is"+crnturl);
			  
			  
			  
			  
			}
		}
}

	
	
	
	
	

