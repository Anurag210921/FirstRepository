package Practice.Success.ExtentReporting;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNg {

	public static ExtentReports getReportObject()
	{
	String path=(System.getProperty("user.dir")+"\\ExtentReportResults\\index.html");
	ExtentSparkReporter reporter= new ExtentSparkReporter(path);
	reporter.config().setDocumentTitle("Anurag Test Automation");
	reporter.config().setReportName("Web Automation Results");
	
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Anurag");
	return extent;
	}
}
