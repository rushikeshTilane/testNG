package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseLayer.baseLayerTestNG;
import com.utilsLayer.JSMClass;

public class loginPage extends baseLayerTestNG {

	@FindBy(xpath = "//input[@name='username']")
	WebElement uname;

	@FindBy(xpath = "//input[@name='password']")
	WebElement pass;

	@FindBy(xpath = "//button")
	WebElement loginButton;

	@FindBy(xpath = "//div[contains(@class,'n-b')]//img")
	WebElement logo1;

	@FindBy(xpath = "//div[contains(@id,'1')]//preceding::img[1]")
	WebElement logo2;

	public loginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginFuntionality(String username, String password) {
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginButton.click();
	}

	public String actualTitle() {
		return driver.getTitle();
		//return JSMClass.getTitleUsingJSM();
	}

	public String actualUrl() {
		return JSMClass.getTitleUsingJSM();
	}

	public boolean logo1() {
		return logo1.isDisplayed();
	}

	public boolean logo2() {
		return logo2.isDisplayed();
	}

}
