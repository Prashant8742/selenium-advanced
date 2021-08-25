package Listener.ITestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenertest implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("onFinish method started");
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("onStart method started");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage" +arg0.getName());	
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("The name of the testcase failed is :"+arg0.getName());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("The name of the testcase Skipped is :"+arg0.getName());
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getName()+" test case started");					

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		 System.out.println("The name of the testcase passed is :"+arg0.getName());					

	}

}
