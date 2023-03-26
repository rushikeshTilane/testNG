package com.utilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseLayer.baseLayerTestNG;

public class HandleDP1 extends baseLayerTestNG {

	public static void selectByVisibleText(WebElement wb, String text) {
		Select sel = new Select(wb);
		sel.selectByVisibleText(text);
		// new Select(wb).selectByVisibleText(text);
	}

	public static void selectByIndex(WebElement wb, int index) {
		new Select(wb).selectByIndex(index);
	}

	public static void selectByValue(WebElement wb, String value) {
		new Select(wb).selectByValue(value);
	}
	
	public static String printSelectedValue(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}
	
	public static void printAllValuesDP(WebElement wb) {
		List<WebElement> a= new Select(wb).getOptions();
		for(WebElement b:a) {
			System.out.println(b.getText());
		}
//		for(WebElement c:new Select(wb).getOptions()) {
//			System.out.println(c.getText());
//	}	
	}
	
	public static boolean checkValuePresentInDp(WebElement wb,String value){
		List<WebElement> a= new Select(wb).getOptions();
		for(WebElement b:a) {
			if(b.getText().equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}
}
