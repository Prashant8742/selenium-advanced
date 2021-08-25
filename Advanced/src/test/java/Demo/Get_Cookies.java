package Demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Get_Cookies {
	WebDriver driver;
  @Test
  public void Cookie_get() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		
		 driver.get("https://ksrtc.in/oprs-web/login/show.do");
		 driver.findElement(By.id("userName")).sendKeys("prashantg8742@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("transport123@");
		 driver.findElement(By.id("submitBtn")).click();
		 File file1=new File("C:\\Users\\prashant_gup\\Selenium-Workspace\\log_result\\cookies.data");
		 try {
		file1.delete();
		 file1.createNewFile();
		 FileWriter fw=new FileWriter(file1);
		 BufferedWriter bw=new BufferedWriter(fw);
		 for(Cookie ck:driver.manage().getCookies()) {
		 bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()+";"+ck.getValue()));
		 bw.newLine();
		 driver.manage().deleteCookieNamed("__gads"); //delete cookie by name	
		 }
		 bw.close();
		 fw.close();
		 }
		 catch(Exception e) {
		 System.out.println(e);
		 }
		 
		  }
  
 
 
 
}
