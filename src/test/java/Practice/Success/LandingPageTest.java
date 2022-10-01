package Practice.Success;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Practice.Success.POM.LandingPage;
import Practice.Success.POM.LoginPage;

public class LandingPageTest extends Base{
	LandingPage lp;
	LoginPage login;
	
	public LandingPageTest()
	{
		super();
		
	}
	
	@BeforeMethod()
	public void setup() throws InterruptedException
	{
		initializeDriver();
		login=new LoginPage();
		lp=login.validateLogin("Anurag210921","Anurag@210921");
		
	}
	@AfterMethod()
	public void destroy()
	{
		driver.close();
		
	}

	@Test(priority=1)
	public void validateHomeButtonLink() throws InterruptedException
	{
		Boolean flag=lp.homeLink();
		Assert.assertTrue(flag,"WTFFFF");
		
	}
	@Test(priority=2)
	public void getNoOfRows()
	{
		
		int row=lp.NoOfRows();
		System.out.println(row);
	}
	@Test(priority=3)
	public void getNoOfColumns()
	{
		
		int column=lp.NoOfColumns();
		System.out.println(column);
	}
}
