package Practice.Success.POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Practice.Success.Base;

public class LandingPage extends Base {
	
	public LandingPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'Contacts')])")
	WebElement homeBtn;
	
	@FindBy(xpath="(//ul)[15]/li")
	List <WebElement> rows;
	
	@FindBy(xpath="//ul/li[1]")
	List <WebElement> column;
	
	public Boolean homeLink() throws InterruptedException
	{
		switchToFrame("mainpanel");
		 Boolean flag=homeBtn.isEnabled();
		// driver.switchTo().defaultContent();
		 return flag;
	}
	
	public int NoOfRows()
	{
		switchToFrame("mainpanel");
		int rowSize=rows.size();
		return rowSize;
	}
	public int NoOfColumns()
	{		switchToFrame("mainpanel");
		int columnSize=column.size();
		return columnSize;
	}
	public String getTitle()
	{
		return driver.getTitle();
	}

}
