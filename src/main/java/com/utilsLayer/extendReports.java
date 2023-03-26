package com.utilsLayer;



import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.baseLayer.baseLayerTestNG;

public class extendReports extends baseLayerTestNG {
	public static ExtentReports extent;
	
	public static String getDate() {
		String date = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		return date;
	}

	public static ExtentReports generateReport() {

		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\rushi\\eclipse-workspace\\TestNGHRM\\Reports1\\"+extendReports.getDate()+"");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		return extent;

	}

}
