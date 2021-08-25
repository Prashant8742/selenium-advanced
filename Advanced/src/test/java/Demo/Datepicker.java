package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datepicker {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	  driver.get("https://demoqa.com/date-picker");
	  
	  //select date
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("document.getElementById('datePickerMonthYearInput').value='23/08/2021'");
	  
	  //select date and time
	  js.executeScript("document.getElementById('dateAndTimePickerInput').value='23/08/2023 6:12 PM'");
  }
}
