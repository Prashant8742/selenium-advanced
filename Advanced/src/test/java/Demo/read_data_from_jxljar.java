package Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class read_data_from_jxljar {
  @Test
  public void f() throws BiffException, IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		 WebDriver driver;
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	  
	 Workbook book1 = Workbook.getWorkbook(new File("C:\\Users\\prashant_gup\\OneDrive - HCL Technologies Ltd\\test.xls")); 
	 Sheet s1 = book1.getSheet(0);
	 
	 
	 for (int i=1;i<s1.getRows();i++)
	 {
		String username = s1.getCell(0,i).getContents(); 
		String password = s1.getCell(1,i).getContents(); 
	 
	 
	 driver.get("https://ksrtc.in/oprs-web/login/show.do");
	 driver.findElement(By.id("userName")).sendKeys(username);
	 driver.findElement(By.id("password")).sendKeys(password);
	 driver.findElement(By.id("submitBtn")).click();
	 }
  }
}
