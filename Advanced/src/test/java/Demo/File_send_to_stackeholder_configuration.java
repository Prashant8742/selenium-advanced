package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class File_send_to_stackeholder_configuration {
  @Test
  public void f() throws IOException {
	  
	  //load the properties of confih file
	  FileInputStream s = new FileInputStream("src//test//java//Demo//Config.properties");
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
		
	  
	  //rin the main script
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
