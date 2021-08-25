package Demo;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
  @Test
  public void f() throws InterruptedException, IOException, AWTException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  WebDriver driver;
	  
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
driver.get("http://demo.automationtesting.in/Alerts.html");
	  
	  
	  
	//click on Alert and take screenshot using screenshot interface
	  driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	  String msg = driver.switchTo().alert().getText();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  System.out.println(msg);
	  
	  
	  //taking screenshot
	    TakesScreenshot t1=(TakesScreenshot) driver;
		File Source=t1.getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\selenium\\Screenshot\\screen111.jpg");
		FileHandler.copy(Source, Destination);

		 
		 
		 
		//click on Alert and take screenshot using  RObot class 
			//click on Confirm Alert 
			  driver.findElement(By.linkText("Alert with OK & Cancel")).click();
			  driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
			  String msg1 = driver.switchTo().alert().getText();
			  System.out.println(msg1);
			  Thread.sleep(2000);
			  driver.switchTo().alert().accept();
			  
			 


			//taking screenshot
				Robot r1=new Robot();
				Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
				Rectangle rect1=new Rectangle(sc_size);
				BufferedImage source=	r1.createScreenCapture(rect1);				
				File Destination1=new File("C:\\selenium\\Screenshot\\screen2.jpg");
				ImageIO.write(source, "jpg", Destination1);
							  
			 
			//click on Confirm prompt 
			  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
			  driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
			  driver.switchTo().alert().sendKeys("i am prashant");
			  String msg2 = driver.switchTo().alert().getText();
			  System.out.println(msg2);
			  Thread.sleep(2000);
			  driver.switchTo().alert().accept();	
			  
			 


			//taking screenshot
			  Dimension sc_size1=Toolkit.getDefaultToolkit().getScreenSize();
				Rectangle rect11=new Rectangle(sc_size1);
				BufferedImage source1=	r1.createScreenCapture(rect11);
				File Destination2=new File("C:\\selenium\\Screenshot\\screen3.jpg");
				ImageIO.write(source1, "jpg", Destination2);
				Thread.sleep(2000);
	 
  }
}
