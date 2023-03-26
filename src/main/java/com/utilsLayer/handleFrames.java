package com.utilsLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseLayer.baseLayerTestNG;

public class handleFrames extends baseLayerTestNG {

	public static WebDriver swtichToFrameByindex(int index) {
		return driver.switchTo().frame(index);
	}

	public static WebDriver switchToFrameByNameOrID(String name) {
		return driver.switchTo().frame(name);
	}

	public static WebDriver switchToFrameByWebElement(WebElement wb) {
		return driver.switchTo().frame(wb);
	}

	public static WebDriver switchToParentWindow() {
		return driver.switchTo().parentFrame();
	}

	public static WebDriver swtichToTopWrindow() {
		return driver.switchTo().defaultContent();
	}
}
