package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Amazonpage {

WebDriver driver;
By searchfield=By.xpath("//input[@id='twotabsearchtextbox']");
By mobilephone=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span");	
By cart=By.xpath("//*[@id=\"add-to-cart-button\"]");


 public Amazonpage(WebDriver driver)
 {
	 this.driver=driver;
 }
public void setvalues(String mobilephones)
{
	driver.findElement(searchfield).sendKeys(mobilephones);
	
}
public void phonedetails()
{
	driver.findElement(mobilephone).click();
}
public void cart()
{
	driver.findElement(cart).click();
}
}
