package com.utilsLayer;

import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.baseLayer.baseLayerTestNG;

public class extendReports extends baseLayerTestNG implements ITestListener {
	public static ExtentReports extent;

	public static ExtentReports generateReport() {

		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\rushi\\eclipse-workspace\\HRMTestNG\\reports");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		return extent;

	}

}
