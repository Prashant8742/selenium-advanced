package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll_with_in_page {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\driver\\\\chromedriver.exe");
		WebDriver d1;

		d1=new ChromeDriver();

		d1.manage().window().maximize();

		d1.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");


		JavascriptExecutor jse=(JavascriptExecutor) d1;
//		WebElement ele1=d1.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[9]/textarea"));
//		jse.executeScript("arguments[0].scrollIntoView(true);",ele1);
//		ele1.sendKeys("Vande Mataram!!!");

		
		jse.executeScript("scroll(0,400)");
		WebElement ele2=d1.findElement(By.xpath("/html/body/div[2]/section/div[5]/div/div[1]/ul/li[11]/img"));
		jse.executeScript("arguments[0].scrollIntoView(true);",ele2);
		System.out.println(ele2.isDisplayed());
	}

  }

