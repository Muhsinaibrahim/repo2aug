package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnggrouping {
	
		
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
		@Test(groups = {"smoke","sanity"})
		public void test1()
		{
		System.out.println("test 1");	
		}
		@Test(groups = "sanity")
		public void test2()
		{
		System.out.println("test 2");	
		}
		
		@Test(groups = {"sanity","regression"})
		public void test3()
		{
		System.out.println("test 3");	
		}
		
		@Test(groups="smoke")
		public void test4()
		{
		System.out.println("test 4");	
		}
		
		@Test(groups="regression")
		public void test5()
		{
		System.out.println("test 5");	
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

	
	
	
	
	
	
	

