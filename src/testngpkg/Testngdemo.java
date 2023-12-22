package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
@BeforeTest
public void setup()
{
	System.out.println("browseropen");
}
@BeforeMethod
public void urlload()
{
System.out.println("url loading");	
}
@Test(priority=1)
public void test1()
{
System.out.println("test 1");	
}
@Test(priority=0,dependsOnMethods= {"test1"})
public void test2()
{
System.out.println("test 2");	
}
	
@AfterMethod
public void aftermthd()
{
	System.out.println("aftrmthd");
}
@AfterTest
public void aftertest()
{
	System.out.println("close browser");
}
}
