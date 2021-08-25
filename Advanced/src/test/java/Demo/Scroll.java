package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	  driver.get("https://demoqa.com/date-picker");
	  
	  //select date
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("scroll(0,500)");
  }
  
  
}
