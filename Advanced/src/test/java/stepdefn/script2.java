package stepdefn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class script2 {
static WebDriver driver;
	
	//Do the register on ksrtc website
	@Given("open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("https://ksrtc.in/oprs-web/user/add.do");
		 driver.manage().window().maximize();
	}
	
	
	@When("enter User Name and full name and mobile no")
	public void enter_User_Name_and_full_name_and_mobile_no() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys("prashantg8742@gmail.com");
		  driver.findElement(By.id("fullName")).sendKeys("Prashant");
		  driver.findElement(By.id("mobileNo")).sendKeys("8824440660");
		  driver.findElement(By.xpath("//*[@id=\"userProfileForm\"]/div/div/div/div/div/div[4]/input")).click();
	}
	
	@Then("register Successfully")
	public void register_Successfully() {
	    // Write code here that turns the phrase above into concrete actions
		  driver.switchTo().alert().accept();
		  System.out.println("Successfully registerd");
		// System.out.println("given done");
	}
	
	
	//login on ksrtc website
	@Given("open login page url")
	public void open_login_page_url() {
		 driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/ul[1]/li[1]/a")).click();
	}
	
	
	@When("enter username and password and click on login button")
	public void enter_username_and_password_and_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		  driver.manage().deleteAllCookies();
		  driver.findElement(By.id("userName")).sendKeys("prashantg8742@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("transport123@");
		  driver.findElement(By.id("submitBtn")).click();
		  
	}
	
	@Then("login Successfully")
	public void login_Successfully() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("Successfully login");
		 
	}
	
	//search for the bus
	@Given("open home page url")
	public void open_home_page_url() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("scroll(0,300)");
	}
	
	
	
	@When("enter Leaving from and going to and select Date Of Departure and Date Of Return and click on search button")
	public void enter_Leaving_from_and_going_to_and_select_Date_Of_Departure_and_Date_Of_Return_and_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		Actions act1=new Actions(driver);
		  WebElement w = driver.findElement(By.id("fromPlaceName"));
		  act1.sendKeys(w, "KURNOOL");
		  act1.sendKeys(Keys.ARROW_DOWN);
		  act1.sendKeys(Keys.ENTER).build().perform();
		  
		  WebElement w1 = driver.findElement(By.id("toPlaceName"));
		  act1.sendKeys(w1, "BENGALURU");
		  act1.sendKeys(Keys.ARROW_DOWN);
		  act1.sendKeys(Keys.ENTER).build().perform();
		 
		  driver.findElement(By.id("txtJourneyDate")).click();
		  driver.findElement(By.linkText("25")).click();
		  driver.findElement(By.id("txtReturnJourneyDate")).click();
		  driver.findElement(By.linkText("30")).click();
		  driver.findElement(By.id("corover-close-btn")).click();
		  //driver.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/div[3]/button")).submit();
		  driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
	}
	
	@Then("Successfully search the bus")
	public void Successfully_search_the_bus() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("Successfully searched");
		
	}

}
