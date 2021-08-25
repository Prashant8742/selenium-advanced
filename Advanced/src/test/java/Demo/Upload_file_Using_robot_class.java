package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload_file_Using_robot_class {
  @Test
  public void f() throws InterruptedException, AWTException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		 WebDriver driver;
		 driver = new ChromeDriver();
		 driver.get("https://www.adobe.com/in/acrobat/online/jpg-to-pdf.html");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 
		 driver.findElement(By.id("lifecycle-nativebutton")).click();
			
			String file="C:\\Users\\prashant_gup\\OneDrive - HCL Technologies Ltd\\Pictures\\Screenshots\\login.jpg";
			
			StringSelection select1=new StringSelection(file);
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
			
			Thread.sleep(4000);
			
			Robot robot1=new Robot();
			
			robot1.keyPress(KeyEvent.VK_CONTROL);
			
			robot1.keyPress(KeyEvent.VK_V);
			
			robot1.keyRelease(KeyEvent.VK_V);
			
			robot1.keyRelease(KeyEvent.VK_CONTROL);
			
			robot1.keyPress(KeyEvent.VK_ENTER);
  }
}
