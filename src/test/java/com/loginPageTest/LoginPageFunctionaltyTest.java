package com.loginPageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseLayer.baseLayerTestNG;
import com.pageLayer.loginPage;

public class LoginPageFunctionaltyTest extends baseLayerTestNG {
	// loginPage login = new loginPage();

	@Test(priority = 1, groups = { "setup" })
	public void setup() {
		baseLayerTestNG.starting();
	}

	@Test(priority = 2, groups = { "title" }, dependsOnGroups = { "setup" })
	public void testTitle() {
		Assert.assertEquals(new loginPage().actualTitle(), "OrangeHRM");
	}

	@Test(priority = 3, groups = { "URL" }, dependsOnGroups = { "setup", "title" })
	public void testURL() {
		Assert.assertFalse(new loginPage().actualUrl().contains("orangehrmlive"));
	}

	@Test(priority = 4, groups = { "logo" } )
	public void testlogo1Display() {
		Assert.assertTrue(new loginPage().logo1());
	}

	@Test(priority = 5, groups = { "logo" })
	public void testlogo2Display() {
		Assert.assertTrue(new loginPage().logo2());
	}

	@Test(priority = 6, dependsOnGroups = { "setup", "title", "URL" })
	public void testLoginFunctionality() {
		new loginPage().loginFuntionality("Admin", "admin123");
	}
}
