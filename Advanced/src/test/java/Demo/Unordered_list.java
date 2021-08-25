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

public class Unordered_list {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	  
		  driver.get("http://demo.automationtesting.in/Selectable.html");
		  
	  
	//select multiple list item in unordered list
		 
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  
	  java.util.List<WebElement> element2=driver.findElements(By.xpath("//*[@id='Serialize']/ul/li"));
	  
	  int length1=element2.size();
	  
	  System.out.println(length1);
	  
	  
	  Actions act2=new Actions(driver);
	  
	  act2.keyDown(Keys.CONTROL)
	      .click(element2.get(0))
	      .click(element2.get(1))
	      .click(element2.get(3))
	      .click(element2.get(6))
	      .build().perform();
	  
	  
	 
  }
}
