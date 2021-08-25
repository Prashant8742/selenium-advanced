package selenium.selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchrozation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		
		
		//implicit wait
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe" );
		//Define Implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String eTitle = "Google";
		String aTitle = "" ;
		
		// launch Chrome and redirect it to the Base URL
		driver.get("http://www.google.com" );
		
		//Maximizes the browser window
		driver.manage().window().maximize() ;

		//get the actual value of the title
		aTitle = driver.getTitle();
		
		//compare the actual title with the expected title
		if (aTitle.equals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		//close browser
		driver.close();
		
		//Explicit wait for state dropdown field
		
	    
	    
	    
		

	}

}
