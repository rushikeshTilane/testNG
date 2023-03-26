package com.utilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.baseLayer.baseLayerTestNG;

public class JSMClass extends baseLayerTestNG {

	public static void clickUSingJSM(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", wb);
	}

	public static void openURLUSingJSM(String url) {
		((JavascriptExecutor) driver).executeScript("window.location='" + url + "';");
	}

	public static void scrollUSingJSM(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wb);
	}

	public static void highlightUSingJSM(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border=3px solid red;", wb);
	}

	public static void sendDataUSingJSM(String data, WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].value='" + data + "'", wb);
	}
	
	public static String getTitleUsingJSM() {
		return((JavascriptExecutor) driver).executeScript("return document.title").toString();
	}
	
	public static String getURLUsingJSM() {
		return((JavascriptExecutor) driver).executeScript("return document.URL").toString();
	}
	
}
