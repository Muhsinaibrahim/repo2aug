package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
ChromeDriver driver;
String baseurl="https://www.google.com";
@Before
public void setUp()
{
	driver=new ChromeDriver();
 driver.get(baseurl);
}
@Test
public void googletest()
{
driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);	
}
}
