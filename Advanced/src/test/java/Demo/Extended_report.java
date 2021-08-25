package Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Extended_report {
	static WebDriver driver;
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports("C:\\Users\\prashant_gup\\Selenium-Workspace\\extended_report\\ExtentReportResults1.html",true);
	test = report.startTest("ExtentDemo");
	}
	
	
	@Test
	public void extentReportsDemo()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	if(driver.getTitle().equals("Google"))
	{
	test.log(LogStatus.PASS, "Navigated to the specified URL");
	}
	else
	{
	test.log(LogStatus.FAIL, "Test Failed");
	}
	}
	
	@Test
	public void failed_test()
	{
		String act = "selenium - Google Searchhff";
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		String exp = driver.getTitle();
		
		if(exp.equalsIgnoreCase(act))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
		test.log(LogStatus.FAIL, "Test Failed");
		}	
	}
	
	//test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Test Failed");
//	public static void capture(WebDriver driver) throws IOException {
//	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	File Dest = new File("C:\\\\Users\\\\prashant_gup\\\\Selenium-Workspace\\\\extended_report\\\\ExtentReportfailedcreenshot.png");
//	FileHandler.copy(scrFile, Dest);
//	}

	
	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
}
