package com.utilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseLayer.baseLayerTestNG;

public class handleDP extends baseLayerTestNG {

	public void selectByVisibleText(WebElement wb, String visibleText) {
		Select sel = new Select(wb);
		sel.selectByVisibleText(visibleText);
	}

	public static void selectByIndex(WebElement wb, int index) {
		new Select(wb).selectByIndex(index);
	}

	public static void selectByValue(WebElement wb, String value) {
		new Select(wb).selectByValue(value);
	}

	public static String getSelectedOption(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}

	public static int countTotalVAluesInDP(WebElement wb) {
		return new Select(wb).getOptions().size();
	}

	public static void printAllValueInDp(WebElement wb) {
		List<WebElement> a = new Select(wb).getOptions();
		for (WebElement b : a) {
			System.out.println(b.getText());
		}
	}

	public static boolean checkValueIsPresentOrNot(WebElement wb, String data) {
		List<WebElement> a = new Select(wb).getOptions();
		for (WebElement b : a) {
			if (b.getText().equalsIgnoreCase(data));{
			return true;
		}
		}
		 return false;
	}
}
