package selenium.selenium;



import org.junit.Test;

public class Synchronization {
		//WebDriver driver = new ChromeDriver(); 
	
	

@Test(timeout=1000)
	public void test1() {
		int i=1;
		while(i==1)
		{
			System.out.print(i);
			i++;
		}
		
	}
	
	
	
	
	

//	@Test
//	public void test() {
//		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe" );
//		//Define Implicit wait
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		String eTitle = "Google";
//		String aTitle = "" ;
//		
//		// launch Chrome and redirect it to the Base URL
//		driver.get("http://www.google.com" );
//		
//		//Maximizes the browser window
//		driver.manage().window().maximize() ;
//
//		//get the actual value of the title
//		aTitle = driver.getTitle();
//		
//		//compare the actual title with the expected title
//		if (aTitle.equals(eTitle))
//		{
//		System.out.println( "Test Passed") ;
//		}
//		else {
//		System.out.println( "Test Failed" );
//		}
//		//close browser
//		driver.close();
//	}
//	
//	@Test
//	public void test2(){
//		System.setProperty ("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe" );
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		String eTitle = "Log in to Facebook | Facebook";
//		String aTitle = "" ;
//		
//		// launch Chrome and redirect it to the Base URL
//		driver.get("https://touch.facebook.com/login/?next&ref=dbl&fl&refid=8" );
//		//Maximizes the browser window
//		driver.manage().window().maximize() ;
//		//get the actual value of the title
//		aTitle = driver.getTitle();
//		//compare the actual title with the expected title
//		if (aTitle.contentEquals(eTitle))
//		{
//		System.out.println( "Test Passed") ;
//		}
//		else {
//		System.out.println( "Test Failed" );
//		}
//		WebElement Link;
//		Link= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
//		Link.click();
//		}
	
	
	

		
	}


