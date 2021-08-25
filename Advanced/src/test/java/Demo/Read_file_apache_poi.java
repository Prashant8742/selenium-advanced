package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Read_file_apache_poi {
  
@Test
  public static void f() throws IOException {
	  
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	 WebDriver driver;
	 driver = new ChromeDriver();
	  //Create an object of File class to open xlsx file
      File file = new File("C:\\Users\\prashant_gup\\OneDrive - HCL Technologies Ltd\\test.xlsx");
    
      //For read data use inputstream class
      FileInputStream fis = new FileInputStream(file);
      @SuppressWarnings("resource")
      
      //get the workbook
	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
      
      //get the excel sheet using index or name(if multiple sheet here)
      XSSFSheet sheet = workbook.getSheetAt(0);
      //XSSFSheet sheet = workbook.getSheet("StudentDetails");
      
      //get the total row count in the excel sheet
      int lastRow = sheet.getLastRowNum();
      System.out.println("Last Row = "+ lastRow);
        
      for (int i = 0; i <=lastRow ;i++) {
    	  
    	  //get the row value
       	   String user= sheet.getRow(i).getCell(0).toString();
       	   String pass= sheet.getRow(i).getCell(1).toString();
       	   
       	   //print the Rows value
       	   System.out.println("username="+user);
       	   System.out.println("password="+pass);
       	   
       	   //go to the application and pass the rows values
       	   driver.get("https://ksrtc.in/oprs-web/login/show.do");
       	   driver.manage().window().maximize();
       	   driver.findElement(By.id("userName")).sendKeys(user);
       	   driver.findElement(By.id("password")).sendKeys(pass);
       	   driver.findElement(By.id("submitBtn")).click();   
       	   
       }
        		  
          
}
}
          
      
      
      
      
      
      
      
      
      
      /////////////////Write the manually data///////////////////////////
      
//      
//   // workbook object 
//      XSSFWorkbook workbook1 = new XSSFWorkbook();
//      // spreadsheet object 
//      XSSFSheet spreadsheet
//              = workbook1.createSheet(" Employee Data ");
//      // creating a row object 
//      XSSFRow row;
//      // This data needs to be written (Object[]) 
//      Map<String, Object[]> studentData
//              = new TreeMap<String, Object[]>();
//
//      studentData.put("1", new Object[] { "Employee Id", "NAME", "POST" });
//      
//      studentData.put("2", new Object[] { "1301", "Prajjawal", "Intern" });
//      studentData.put("3", new Object[] { "1302", "Nitish", "Software Consultant" });
//      studentData.put("4", new Object[] { "1303", "Aditi", "QA Engineer" });
//      studentData.put("5", new Object[] { "1303", "Ayush", "System Engineer" });
//      studentData.put("6", new Object[] { "1304", "Abhishek", "Intern" });
//
//      Set<String> keyid = studentData.keySet();
//
//      int rowid = 0;
//      // writing the data into the sheets...
//      for (String key : keyid) {
//          row = spreadsheet.createRow(rowid++);
//          Object[] objectArr = studentData.get(key);
//          int cellid = 0;
//
//          for (Object obj : objectArr) {
//              Cell cell = row.createCell(cellid++);
//              cell.setCellValue((String)obj);
//              System.out.println(cellid +" "+cell);
//          }
//      }
//      // .xlsx is the format for Excel Sheets... 
//      // writing the workbook into the file... 
//      FileOutputStream out = new FileOutputStream(
//              new File("C:\\\\Users\\\\prashant_gup\\\\OneDrive - HCL Technologies Ltd\\\\Book_test.xlsx"));
//      workbook.write(out);
//
//      out.close();
//      
 