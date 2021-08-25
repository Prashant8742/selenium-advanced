package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Unordered_autocomplete {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	  driver.get("http://demo.automationtesting.in/AutoComplete.html");
		  
	  
	  //Auto complete unordered list
	  driver.findElement(By.id("searchbox")).sendKeys("P");
	  
	  Thread.sleep(4000);
	  
	java.util.List<WebElement> ele1=  driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	  
	int len=ele1.size();
	
	System.out.println(len);
	
	Thread.sleep(4000);
	
	for(WebElement list_values:ele1) {
		if (list_values.getText().equalsIgnoreCase("Cyprus")) {
			list_values.click();
	
		}
    }
}
}
