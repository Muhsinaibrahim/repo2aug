package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	
WebDriver driver;
//By fbemail=By.id("email");
//By fbpassword=By.id("pass");
//By fblogin=By.name("login");
@FindBy(name="login")
WebElement loginbutton;
@FindBy(name="email")
WebElement emailField;
@FindBy(name="pass")
WebElement pswd;
	
	
public Fbloginpage(WebDriver driver)	
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void setvalues(String UN,String PWD)	
{
	//driver.findElement(fbemail).sendKeys(email);
	//driver.findElement(fbpassword).sendKeys(password);//
	emailField.sendKeys(UN);
	pswd.sendKeys(PWD);
}
public void login()	
{
	
	
//driver.findElement(fblogin).click();
	loginbutton.click();
	}
	

}
