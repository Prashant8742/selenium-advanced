package selenium.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;



public class Exception_handling_2 {
	
	 static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		driver.manage().window().maximize();;
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		System.out.println("HOME PAGE");
		driver.get("https://google.com/");
		String exp = driver.getTitle();
		String  act= driver.getTitle();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		
		
				
		
	}

}

