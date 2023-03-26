package com.utilsLayer;


import com.baseLayer.baseLayerTestNG;

public class alertPopUp extends baseLayerTestNG {
	
	public static void clickOnOkButtonOnAlertWindow() {
		//Alert alt =driver.switchTo().alert();
		driver.switchTo().alert().accept();
	}

	public static void clickOnCancelButtonOnAlertWindow() {
		driver.switchTo().alert().dismiss();
	}
	
	public static String captureTextOnAlertWindow() {
		return driver.switchTo().alert().getText();
	}
	 public static void sendDatainAlertWindow(String data) {
		 driver.switchTo().alert().sendKeys(data);
	 }
	
	
	
	
}
