package Demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Download_file {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		 WebDriver driver;
		 driver = new ChromeDriver();
		 driver.get("https://demoqa.com/upload-download");
		 driver.findElement(By.id("downloadButton")).click();
		 File flocation = new File("C:\\Users\\prashant_gup\\Downloads");
		 File[] total_files = flocation.listFiles();
		 
		 for(File file :total_files)
		 {
			 if(file.getName().equalsIgnoreCase("sampleFile.jpeg"))
			 {
				 System.out.println("File is Found at location");
				 break;
			 }
		 }
  }
}
