package com.utilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseLayer.baseLayerTestNG;

public class ActionsClass extends baseLayerTestNG {

	public void clickUsingActionsClass(WebElement wb) {
		//Actions act = new Actions(driver);
		new Actions(driver).click(wb).build().perform();
	}
	
	public void doubleClickUsingActionsClass(WebElement wb) {
		new Actions(driver).doubleClick(wb).build().perform();
	}
	
	public void rightClickUsingActionsClass(WebElement wb) {
		new Actions(driver).contextClick(wb).build().perform();
	}
	
	public void sendInfoUsingActionsClass(WebElement wb,String data) {
		new Actions(driver).sendKeys(wb,data).build().perform();
	}
	
	public void moveToElementUsingActionsClass(WebElement wb) {
		new Actions(driver).moveToElement(wb).build().perform();
	}
	
	
	
	
	
	
	
}
