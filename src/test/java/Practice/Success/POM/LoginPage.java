package Practice.Success.POM;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Practice.Success.Base;

public class LoginPage extends Base {
	
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath ="//input[@value='Login']" )
	WebElement lgnBtn;
	
	@FindBy(xpath ="//img[@class='img-responsive']" )
	WebElement crmImage;
	
	


public String vaidateLoginPageTitle()
{
	return driver.getTitle();

}

public Boolean validateImg()
{
	return crmImage.isDisplayed();
}

public LandingPage validateLogin(String un, String pwd) 
{
  username.sendKeys(un);
  password.sendKeys(pwd);
  lgnBtn.click();
return new LandingPage();
}

}