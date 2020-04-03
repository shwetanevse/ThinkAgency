package Utility;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Regression.Test.Suite.PingLinks;



public class ListenersClass extends PingLinks implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Testcase started --> " +result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase pass --> " +result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase failed --> " +result.getName());
		//takeScreenshotOnFail(result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase skipped --> " +result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
