package Practice.Success;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Practice.Success.POM.LandingPage;
import Practice.Success.POM.LoginPage;

public class LoginPageTest extends Base {
	LoginPage login;
	LandingPage landingPage;
public LoginPageTest()
{
 super();	
}

@BeforeMethod
public void setUp() throws InterruptedException
{
	initializeDriver();
	login=new LoginPage();

}
	
@Test(priority=1)
public void loginPageTitleTest() throws InterruptedException
{
	
	String title= login.vaidateLoginPageTitle();
	Assert.assertEquals(title,"CRMPR - CRM software for customer relationship management, sales, and support.");
}

@Test(priority=2)
public void validateImageTest()
{
	Boolean flag=login.validateImg();
	Assert.assertTrue(flag);
}

@Test(priority=3)
public void LoginTest()
{
  landingPage=login.validateLogin("Anurag210921", "Anurag@210921");	
  
}


@AfterMethod
public void kill() throws InterruptedException
{
	driver.close();
}



}