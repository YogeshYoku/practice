package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//Test case pass ana ithu nadakanum incase fail ana ithu nadakanum or incase skip aana ithu nadakanum....Oru Test Execution ah listen pannite irukuthu
public class ListenersExample implements ITestListener {
	
public void onTestStart(ITestResult result) {
	System.out.println("Test Case is going to execute");
}	
public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case is passed");
	}
public void onTestFailure(ITestResult result) {
	System.out.println("Test Case is Failed");
	}
public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case is Skipped");
	}
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("");	}

public void onStart(ITestContext context) {
		System.out.println("Before Everything");
	}
public void onFinish(ITestContext context) {
	System.out.println("After Everything");
			}
}
