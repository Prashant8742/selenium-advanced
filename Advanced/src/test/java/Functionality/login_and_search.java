package Functionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Locators.locators;

public class login_and_search {
	
	@Test
	public void login_Search() throws InterruptedException, IOException {
		
		 //load the properties of confih file
		  FileInputStream s = new FileInputStream("src//test//java//demo//Config.properties");
		  Properties p =new Properties();
		  p.load(s);
		  String browser_name = p.getProperty("browser");
		  String driver_path =  p.getProperty("driver_path");
		  WebDriver driver;
		  
		  //check the browser configurtion
		  if(browser_name.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver",driver_path);
		  driver = new ChromeDriver();
		  }
		  else if(browser_name.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver",driver_path);  
			  driver = new FirefoxDriver();
		  }
		  else
		  {
			  System.setProperty("webdriver.ie.driver",driver_path);  
			  driver = new InternetExplorerDriver(); 
		  }
		
		//Define System configuration or URL access
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		//run main script
		 driver.get("https://ksrtc.in/oprs-web/user/add.do");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 Actions act1=new Actions(driver);
		 //Create locator class object
		 locators l = new locators();
		 
		 //Register
		 l.email(driver).sendKeys("prashantg8742@gmail.com");
		 l.name(driver).sendKeys("Prashant");
		 l.mobile(driver).sendKeys("8824440660");
		 l.button1(driver).click();
		 
		 //Handle the alert
		 driver.switchTo().alert().accept();
		 System.out.println("Successfully registerd");
		 
		 //Login After registration
		driver.manage().deleteAllCookies();
		l.login_button(driver).click();
		l.username(driver).sendKeys("prashantg8742@gmail.com");
		l.password(driver).sendKeys("transport123@");
		l.sub_btn(driver).click();
		System.out.println("Successfully Login");
		//Select From city name
		l.Value1(driver).sendKeys("KURNOOL");
		 act1.sendKeys(Keys.ARROW_DOWN);
		 act1.sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(2000);
		 
		 //Select to city name
		l.Value2(driver).sendKeys("BENGALURU");
		 act1.sendKeys(Keys.ARROW_DOWN);
		 act1.sendKeys(Keys.ENTER).build().perform();
		 
		 //Click on From date
		 
		 l.Date1_click(driver).click();
		 l.Date1_Value(driver).click();
		 
		 //click on to date
		 l.Date2_click(driver).click();
		 l.Date2_value(driver).click();
		 //Remove banner and click on search
		l.banner(driver).click();
		l.Final_submit(driver).click();
		System.out.println("Successfully Searched");

	}
	
	

}
