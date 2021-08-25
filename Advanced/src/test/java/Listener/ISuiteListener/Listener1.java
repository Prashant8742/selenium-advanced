package Listener.ISuiteListener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Listener1 implements ISuiteListener{

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("onFinish function started "  + suite.getName());
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("onStart function started "  + suite.getName());
	}

}
