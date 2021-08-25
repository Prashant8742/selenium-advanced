package Functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Locators.PF_Locators;

public class PF_login_search {
  @Test
  public void f() throws InterruptedException {
	  
	//Define System configuration or URL access
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
			 WebDriver driver;
			 driver = new ChromeDriver();
			 driver.get("https://ksrtc.in/oprs-web/user/add.do");
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 Actions act1=new Actions(driver);
			
			 
			 PageFactory.initElements(driver, PF_Locators.class);
			
			 //register
			 PF_Locators.email.sendKeys("prashantg8742@gmail.com");
			 PF_Locators.name.sendKeys("Prashant");
			 PF_Locators.mobile.sendKeys("8824440660");
			 PF_Locators.button1.click();
			 
			 //Handle the alert
			 driver.switchTo().alert().accept();
			 System.out.println("Successfully registerd");
			 
			 //Login After registration
			driver.manage().deleteAllCookies();
			PF_Locators.login_button.click();
			PF_Locators.username.sendKeys("prashantg8742@gmail.com");
			PF_Locators.password.sendKeys("transport123@");
			PF_Locators.sub_btn.click();
			System.out.println("Successfully Login");
			
			//Select From city name
			PF_Locators.value1.sendKeys("KURNOOL");
			 act1.sendKeys(Keys.ARROW_DOWN);
			 act1.sendKeys(Keys.ENTER).build().perform();
			 Thread.sleep(2000);
			 
			 //Select to city name
			PF_Locators.value2.sendKeys("BENGALURU");
			 act1.sendKeys(Keys.ARROW_DOWN);
			 act1.sendKeys(Keys.ENTER).build().perform();
			 
			 //Click on From date
			 
			 PF_Locators.Date1_click.click();
			 PF_Locators.Date1_Value.click();
			 
			 //click on to date
			 PF_Locators.Date2_click.click();
			 PF_Locators.Date2_value.click();
			 
			 //Remove banner and click on search
			PF_Locators.banner.click();
			PF_Locators.Final_submit.click();
			System.out.println("Successfully Searched");

  }
}
