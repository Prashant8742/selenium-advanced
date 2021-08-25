package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators {
     
	
 	//Register
	  public WebElement  email(WebDriver driver) {
	  return driver.findElement(By.id("email"));
	  }
	  public WebElement  name(WebDriver driver) {
	 return driver.findElement(By.id("fullName"));
	 }
	  public WebElement  mobile(WebDriver driver) {
	 return driver.findElement(By.id("mobileNo"));
	 }
	 
	  public WebElement  button1(WebDriver driver) {
	 return driver.findElement(By.xpath("//*[@id=\"userProfileForm\"]/div/div/div/div/div/div[4]/input"));
	 }
	   
	 
	  //Login
	  public WebElement  login_button(WebDriver driver) {
	 return driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/ul[1]/li[1]/a"));
	 }
	 
	  public WebElement  username(WebDriver driver) {
	 return driver.findElement(By.id("userName"));

	 }
	 
	  public WebElement  password(WebDriver driver) {
	 return driver.findElement(By.id("password"));

	 }
	 
	  public WebElement  sub_btn(WebDriver driver) {
	 return driver.findElement(By.id("submitBtn"));
	 }
	 
	 
	 
	  //Select  From   Place
	  public WebElement  Value1(WebDriver driver) {
	return driver.findElement(By.id("fromPlaceName"));
	 }
	 
	 
	 
	 
	//Select To  Place
	  public WebElement  Value2(WebDriver driver) {
	return driver.findElement(By.id("toPlaceName"));
	 }
	 
	 
	  //Select From Date
	  public WebElement  Date1_click(WebDriver driver) {
	 return driver.findElement(By.id("txtJourneyDate"));
	 }
	 
	  public WebElement  Date1_Value(WebDriver driver) {
	 return driver.findElement(By.linkText("18"));
	 }
	//Select TO Date
	  public WebElement  Date2_click(WebDriver driver) {
	 return driver.findElement(By.id("txtReturnJourneyDate"));
	 }
	 
	  public WebElement  Date2_value(WebDriver driver) {
	 return driver.findElement(By.linkText("22"));
	 }
	 
	 
	 
	  //Close The Banner
	  public WebElement  banner(WebDriver driver) {
	 return driver.findElement(By.id("corover-close-btn"));
	 }
	 
	  //Click on Search button
	  public WebElement  Final_submit(WebDriver driver) {
	return driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
	 }
  }

