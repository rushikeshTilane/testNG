package com.utilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class ListenersClass extends extendReports implements ITestListener{
	public static ExtentTest test;

	public void onStart(ITestContext context) {
		extendReports.generateReport();
		System.out.println("Suite is started");

	}

	public void onTestStart(ITestResult result) {
		test = extent.createTest("Tc is Started : " + result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\rushi\\eclipse-workspace\\TestNGHRM\\ScreenShot\\"+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(f, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Tc passed");
		test.log(Status.PASS, "Tc is passsed : " + result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Tc is failed : " + result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Tc is skipped : " + result.getMethod().getMethodName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}
	
	public void onFinish(ITestContext context) {
		System.out.println("suite is finished");	
		extent.flush();
		}

}
