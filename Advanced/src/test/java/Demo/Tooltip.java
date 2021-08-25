package Demo;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tooltip {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void config() {
		 System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
	}
	
	//There are two type for handling tool tip
	
	
  //1. Handle tool tip using getAttribute function(get title value)	
  @Test
  public void f() throws InterruptedException {
		 driver.get("http://leafground.com/pages/tooltip.html");
		 driver.manage().window().maximize();
		 WebElement ele = driver.findElement(By.id("age"));
		 String tooltip =ele.getAttribute("title");
		 System.out.println("ToolTip using Title :-" +tooltip);
		 Thread.sleep(1000);
  }
  
  
  
  //2. Handle using Action class
  @Test
  public void f1() {
		 driver.get("http://demo.guru99.com/test/tooltip.html");
		 driver.manage().window().maximize();
		 String expectedTooltip = "What's new in 3.2";
		 
		 WebElement ele = driver.findElement(By.id("download_now"));
		 Actions builder = new Actions (driver);							

	        builder.clickAndHold().moveToElement(ele).build().perform(); 	
	        
	        
	        WebElement toolTipElement = driver.findElement(By.xpath("//*[@id=\"demo_content\"]/div/div/div/a"));							
	        String actualTooltip = toolTipElement.getText();			
	        
	        System.out.println("Actual Title of Tool Tip using Action class:-"+actualTooltip);							
	        if(actualTooltip.equals(expectedTooltip)) {							
	            System.out.println("Test Case Passed");					
	        }		 
		 
  }
  
  
  
  //Using javascript exicutor and action class
  @Test
  public void f2() throws InterruptedException {
      driver.get("https://www.w3schools.com/css/css_tooltip.asp");
      
      
      //Scroll down the screen to see the tooltip element
      JavascriptExecutor script = (JavascriptExecutor)driver;
      script.executeScript("window.scrollBy(0,100)", "");
      Thread.sleep(2000);
      
      //xpath of element where we will get tooltip
      WebElement element = driver.findElement(By.xpath("//div[@class='w3-quarter'][1]/div"));
      
      //xpath of tooltip
      WebElement element1 = driver.findElement(By.xpath("//div[@class='w3-quarter'][1]/div/span"));
      
      // Creating Actions class object
      Actions ac = new Actions(driver);
      ac.moveToElement(element).perform();
      
      
      //Getting tooltip text using getText() method and store into String
      String tooltipText = element1.getText();
      
      //validating tooltip using assert method
      assertEquals(tooltipText, "Tooltip text");
      System.out.println("Tootip using javascriptexicutor and action class:-"+tooltipText);

  }
  
  @Test
  public void f3() throws IOException, InterruptedException {
	  driver.get("https://www.online.citibank.co.in/");
	       
	    //xpath of element where we will get tooltip
	    WebElement element = driver.findElement(By.xpath("//a[@id='loginId']"));
	    Actions ac = new Actions(driver);
	    ac.moveToElement(element).perform();
	    Thread.sleep(1000);
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Thread.sleep(1000);
		File Destination=new File("C:\\selenium\\Screenshot\\screen1011.jpg");
		FileHandler.copy(scrFile, Destination);
		
		String tooltip = element.getAttribute("title");
		 System.out.println("ToolTip using Title with screenshot :-" +tooltip);
  }
  
  
  @AfterTest
  public void closed() {
	  driver.close();
  }
  
}
