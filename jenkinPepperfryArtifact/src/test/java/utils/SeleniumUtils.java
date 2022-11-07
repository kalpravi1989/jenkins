package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class SeleniumUtils extends BaseClass {

	public void seleClick(WebElement ele) {
		try {
			waitUntillClickable(ele);
			ele.click();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	public void enterText(WebElement ele, String text) {
		try {
	waitUntillClickable(ele);
	ele.sendKeys(text);
} catch (WebDriverException e) {
	e.printStackTrace();
}
		
	}

	public void ActionClick(WebElement ele) {
		try {
			waitUntillClickable(ele);
			Actions ac = new Actions(driver);
			ac.click(ele).build().perform();
		} catch (WebDriverException e) {
			e.printStackTrace();

		}
	}

	public void waitUntillClickable(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void waitUntilPresent(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) ele));
	}
}
