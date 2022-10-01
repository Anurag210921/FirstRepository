package Practice.Success;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	
 public static WebDriver driver;
 public static Properties p;
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
				
		
	}
	public Base()  
	{
		
		try {
			 p= new Properties();
				FileInputStream fs;
			fs = new FileInputStream("C:\\Users\\Anurag rana\\Videos\\Eclipse\\Success\\src\\main\\java\\Practice\\Success\\property.properties ");
			
			p.load(fs);
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initializeDriver() throws InterruptedException
	{
		String browser= p.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anurag rana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://classic.crmpro.com");
		
		}
	}
	
	public void switchToFrame(String path)
	{
		driver.switchTo().frame(path);
		
	}
	
	public void getScreenshot() throws IOException 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\SQL_Assignment\\a.png"));
	}

}
