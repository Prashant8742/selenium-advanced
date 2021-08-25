package Listener.ITestListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.ITestListener.listenertest.class)	
public class TestCases {
	WebDriver driver;
  @Test
  public void Login()				
  {		
	  System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\driver\\\\chromedriver.exe");
	  driver=new ChromeDriver();
      driver.get("https://ksrtc.in/oprs-web/login/show.do");					
      driver.findElement(By.id("userName")).sendKeys("prashantg8742@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("transport123@");
	  driver.findElement(By.id("submitBtn")).click();
	  				
  }		

  // Forcefully failed this test as to verify listener.		
  @Test		
  public void TestToFail()				
  {		
      System.out.println("This method to test fail");					
      Assert.assertTrue(false);			
  }
  
  @Test //Failed Test
	public void OpenBrowser() {
	        
	        driver.get("https://www.demoqa.com");
	        String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
}
  
  
  
  @Test  //Success Test
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
  
  private int i = 1;

	@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
	public void AccountTest() {
			if(i < 2)
				Assert.assertEquals(i , i);
		i++;
	}
	
	@Test  // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}
}

