package Practice.Success;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendStandalone {
	ExtentReports extent;
	ExtentSparkReporter reporter;
	
	
	
	@Test
	public void login()
	{
		extent.createTest("Initial Demo");
		System.out.println("Chunni Babu");
		extent.flush();
	}
	@BeforeTest
	public void report()
	{
		String path=System.getProperty("user.dir"+"\\ExtentReportResults\\index.html");
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Anurag Test Automation");
		reporter.config().setReportName("Web Automation Results");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Anurag");
	}

	
	
}
