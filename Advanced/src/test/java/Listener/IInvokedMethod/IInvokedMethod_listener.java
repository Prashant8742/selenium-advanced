package Listener.IInvokedMethod;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethod_listener implements IInvokedMethodListener {

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("Before Invocation Method Started For: " + method.getTestMethod().getMethodName() + " of Class:" + testResult.getTestClass());
		
	}

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		 System.out.println("After Invocation Method Started For: " + method.getTestMethod().getMethodName() + " of Class:" + testResult.getTestClass());	
	}

}
