package Demo;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Orderd_list {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	  
		  driver.get("http://demo.automationtesting.in/Selectable.html");
		  
		  //select single list item in ordered list
		  
		  java.util.List<WebElement> element1=driver.findElements(By.xpath("//*[@id='Default']/ul/li"));
		  
		  int length=element1.size();
		  
		  System.out.println(length);
		  
		  
		  Actions act1=new Actions(driver);
		  
		  act1.keyDown(Keys.CONTROL)
		      .click(element1.get(4))
		      .build().perform();
		    
	  
//	  http://demo.automationtesting.in/AutoComplete.html
//	  driver.get("http://www.leafground.com/pages/selectable.html");
//	  
//	  java.util.List<WebElement> element1=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
//	  
//	  int length=element1.size();
//	  
//	  System.out.println(length);
//	  
//	  
//	  Actions act1=new Actions(driver);
//	  
//	  act1.keyDown(Keys.CONTROL)
//	      .click(element1.get(0))
//	      .click(element1.get(2))
//	      .click(element1.get(4))
//	      .click(element1.get(6)).build().perform();
//		  
//	  

  }
}
