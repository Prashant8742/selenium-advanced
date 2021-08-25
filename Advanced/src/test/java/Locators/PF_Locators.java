package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PF_Locators {
	
	//Register
	@FindBy(id="email")
	public static WebElement email;
	
	@FindBy(id="fullName")
	public static WebElement name;
	
	@FindBy(id="mobileNo")
	public static WebElement mobile;
	
	@FindBy(xpath="//*[@id=\"userProfileForm\"]/div/div/div/div/div/div[4]/input")
	public static WebElement button1;
	
	//login
	@FindBy(xpath="/html/body/header/div/div/div[1]/div/div/ul[1]/li[1]/a")
	public static WebElement login_button;
	
	@FindBy(id="userName")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="submitBtn")
	public static WebElement sub_btn;
	
	@FindBy(id="fromPlaceName")
	public static WebElement value1;
	
	@FindBy(id="toPlaceName")
	public static WebElement value2;
	
	@FindBy(id="txtJourneyDate")
	public static WebElement Date1_click;
	
	@FindBy(linkText="18")
	public static WebElement Date1_Value;
	
	@FindBy(id="txtReturnJourneyDate")
	public static WebElement Date2_click;
	
	@FindBy(linkText="22")
	public static WebElement Date2_value;
	
	@FindBy(id="corover-close-btn")
	public static WebElement banner;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-block btn-booking']")
	public static WebElement Final_submit;
	

}
