package Demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.batik.bridge.BridgeException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Write_using_apche_poi {
  @SuppressWarnings("deprecation")
@Test
  public void f() throws BridgeException, IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		 WebDriver driver;
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	  
	String filepath= "C:\\Users\\prashant_gup\\OneDrive - HCL Technologies Ltd\\STUDENT_DATA.xlsx"; 
	File f1=new File(filepath);
	
	FileOutputStream fos=new FileOutputStream(f1);
	
	XSSFWorkbook w1=new XSSFWorkbook();
	
	XSSFSheet  s1=w1.createSheet("Selenium");
	
	Row r1=s1.createRow(3);
	
	Cell c1=r1.createCell(4);
	
	c1.setCellType(CellType.STRING);
	
	c1.setCellValue("Passed the date into excel sheet");
	
	w1.write(fos);
	 
  }
}
