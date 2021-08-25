package Demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Add_and_delete_cookie {
	static WebDriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 
		 driver.get("https://www.tutorialspoint.com/index.htm");
		 
	      // cookie set with name and value
	      Cookie ck = new Cookie("Automation_Cookie", "Test Engineer");
	      
	      // cookie newly added
	      driver.manage().addCookie(ck);
	      
	      // get all cookies
	      Set<Cookie> cks = driver.manage().getCookies();
	      
	      //iterate the cookies
	      for (Cookie cook : cks) {
	         System.out.println("Cookie name is: "+ cook.getName());
	         System.out.println("Cookie Value is : "+ cook.getValue());
	      }
	      
	      
	      
	      //delete one cookie before save into a file
	      driver.manage().deleteCookieNamed("_fbp");
	      
	      
	      File file1=new File("C:\\Users\\prashant_gup\\Selenium-Workspace\\log_result\\cookies_add1.data");
			 try {
			file1.delete();
			 file1.createNewFile();
			 FileWriter fw=new FileWriter(file1);
			 BufferedWriter bw=new BufferedWriter(fw);
			 for(Cookie ck1:driver.manage().getCookies()) {
			 bw.write((ck1.getName()+";"+ck1.getDomain()+";"+ck1.getPath()+";"+ck1.getExpiry()+";"+ck1.isSecure()+";"+ck1.getValue()));
			 bw.newLine();	
			 }
			 bw.close();
			 fw.close();
			 }
			 catch(Exception e) {
			 System.out.println(e);
			 }
			 
			 
	      // delete all cookies
	     driver.manage().deleteAllCookies();
	     
	      // get cookies
	      Set chs = driver.manage().getCookies();
	      System.out.println("Cookie count after delete: "+chs.size());
	      driver.quit();
		
  }
}
