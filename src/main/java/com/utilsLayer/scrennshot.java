package com.utilsLayer;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseLayer.baseLayerTestNG;

public class scrennshot extends baseLayerTestNG {

	public static void captureScreenShot() throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f =ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\rushi\\eclipse-workspace\\HRMTestNG\\ScreenShot");
		FileUtils.copyFile(f, des);
		
		
	}
}
