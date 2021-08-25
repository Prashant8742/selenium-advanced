package Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Use_Stroed_Cookies {
	static WebDriver driver;	
  @SuppressWarnings("deprecation")
@Test
  public void Addcookies() {
	  
	  				      
	    	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			
			
			 File file1=new File("C:\\Users\\prashant_gup\\Selenium-Workspace\\log_result\\cookies.data");					
	    	try{										
	    		FileReader fileReader = new FileReader(file1);							
	    		@SuppressWarnings("resource")
				BufferedReader Buffreader = new BufferedReader(fileReader);							
	    		String strline;			
	    		while((strline=Buffreader.readLine())!=null){									
	    				StringTokenizer token = new StringTokenizer(strline,";");									
	    					while(token.hasMoreTokens()){					
	    						String name = token.nextToken();
	    						String value = token.nextToken();					
	    						String domain = token.nextToken();
	    						String path = token.nextToken();					
	    						Date expiry = null;							
	    						String val;			
	    						if(!(val=token.nextToken()).equals("null")){		
	    							expiry = new Date(val);					
	    						}		
	    						Boolean isSecure = new Boolean(token.nextToken()).booleanValue();		
	    						Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);																	
	    						driver.manage().addCookie(ck); // This will add the stored cookie to our current session					
	    					}		
	    		}		
	        	}catch(Exception ex){					
	        		ex.printStackTrace();			
	        	}		
	    	 driver.get("https://ksrtc.in/oprs-web/login/show.do");	
	    }
  }

