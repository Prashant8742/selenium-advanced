package stepdefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class script1 {
WebDriver d1;
	
	@Given("open chrome browser and url of the application1")
	public void open_chrome_browser_and_url_of_the_application1() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\driver\\\\chromedriver.exe");
		d1=new ChromeDriver();
		 d1.get("https://ksrtc.in/oprs-web/login/show.do");
		System.out.println("given done");
	}
	
	@When("enter username and password")
	public void enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		 d1.findElement(By.id("userName")).sendKeys("username");
	        d1.findElement(By.id("password")).sendKeys("password");
		
		System.out.println("when done");
	}
	
	@Then("Login success")
	public void login_success() {
	    // Write code here that turns the phrase above into concrete actions
		 d1.findElement(By.id("submitBtn")).click();
		
		System.out.println("then done");
	}

}
