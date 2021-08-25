import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium_exception_handling {
	
	//WebDriver driver = new ChromeDriver(); 
	 public static RemoteWebDriver driver = null;
	 public static DesiredCapabilities capabilities = null;
 	

	@Before
	public void setUp() throws Exception {
//		capabilities = new DesiredCapabilities();
//				capabilities.setCapability("browserName", "chrome");
//				capabilities.setCapability("version", "93.0");
//				capabilities.setCapability("platform", "win10");
//
//				driver = new RemoteWebDriver(new URL("https://google.com"), capabilities);
		//System.setProperty ("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe" );
	}

	@After
	public void tearDown() throws Exception {
	}
	
	

	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void test() {
		int[] numbers = {1, 2, 3};
	      System.out.println(numbers[10]);
	      System.out.println("Array out of bound exception occures");

		  }
	
	
	@Test(expected=ArithmeticException.class)
	public void test1() {
		int a,b,c;
		a=10;
		b=0;
		c=a/b;
	      System.out.println(c);
	      System.out.println("Arithmetic exception");
			}
	
	
	      @Test(expected=FileNotFoundException.class)
	  	public void test2() throws IOException {
	    	  BufferedReader br=new BufferedReader(new FileReader("Data"));
	    	     String line;
				while ((line = br.readLine()) != null)
	    	         {
	    	           System.out.println(line);
	    	         }
				
			}
	      @Ignore
	      @Test(expected=ElementNotVisibleException.class)
		  	public void test3(){
	    	  driver.findElement(By.className("gNO89b")).click();		
	      }
	      
	      @Ignore
	      @Test(expected=NoSuchWindowException.class)
		  	public void test4(){
	    	  for (String handle : driver.getWindowHandles()) {
	    	  driver.switchTo().window(handle);	
	    	  }
	      }
	      
	      
	      
	      @Test(expected=NullPointerException.class)
		  	public void test5(){
	    	  driver.findElement(By.className("gNO89b")).click();
	    	  }
	     
	    	 
	      

}
