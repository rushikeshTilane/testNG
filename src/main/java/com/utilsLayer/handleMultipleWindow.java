package com.utilsLayer;

import java.util.ArrayList;
import java.util.Set;

import com.baseLayer.baseLayerTestNG;

public class handleMultipleWindow extends baseLayerTestNG {

	public static String handleTwoWindow(String parent, Set<String> allWin) {

		for (String a : allWin) {
			if (!a.equals(parent)) {
				driver.switchTo().window(a);
				return driver.getWindowHandle();
			}
		}
		return null;
	}

	public static String handleThreeWindow(String parent, String firstChild, Set<String> allWin) {
		for (String a : allWin) {
			if ((!a.equals(parent) || (!a.equals(firstChild)))) {
				driver.switchTo().window(a);
				return driver.getWindowHandle();
			}
		}
		return null;
	}

	public static String handleFourWindow(String parent, String firstChild, String secondChild, Set<String> allWin) {
		for (String a : allWin) {
			if ((!a.equals(parent) || (!a.equals(firstChild)) || (!a.equals(secondChild)))) {
				driver.switchTo().window(a);
				return driver.getWindowHandle();
			}
		}
		return null;
	}
	
	public static void handleWindowUsingArrayList(String parent, Set<String> allwin, int index) {
		ArrayList<String> arr= new ArrayList<String>(allwin); {
			driver.switchTo().window(arr.get(index));
		}
	}
}
























