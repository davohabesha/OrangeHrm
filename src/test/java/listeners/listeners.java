package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import OrangeHrm.OrangeHrm.AddMemeberTset;
import OrangeHrm.OrangeHrm.BaseClass;
import UTILITIES.utilities;



public class listeners extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println(" Test start");
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println(" Test pass");
		//getScreenShot();
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(" Test faild");
		AddMemeberTset.getScreenShot();
	}

	public void onTestSkipped(ITestResult result) {
	
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
	
		System.out.println(" Test start");
	}

	public void onFinish(ITestContext context) {
		System.out.println(" Test finish");
		
	}

}
