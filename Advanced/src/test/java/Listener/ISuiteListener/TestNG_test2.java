package Listener.ISuiteListener;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.ISuiteListener.Listener1.class)
public class TestNG_test2 {
	@BeforeSuite
	public void bsuite()
	{
	   System.out.println("BeforeSuite method of TestNG2 started");	
	}
	
	
	@Test
	public void test()
	{
		System.out.println("Test Method of TestNG2 started");
	}
	
	@AfterSuite
	public void asuite()
	{
	   System.out.println("AfterSuite method of TestNG2 started");	
	}
}
