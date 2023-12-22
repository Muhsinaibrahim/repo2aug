package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junittextverification {

	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		String p= driver.getPageSource();
		
	}
	@Test
	public void test()
	{
		
		String p= driver.getPageSource();
		if(p.contains("Gmail"))
		{
			System.out.println("text is present");	
		}
		else
		{
			System.out.println("not present");
		}
	}
}
