package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		//edge-EdgeDriver()
		ChromeDriver driver=new ChromeDriver();//to launch browser
		driver.get("https://www.google.com");//to open a site
		String expectedtitle="Google";
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
