package com.AT.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseActions extends PageBase {
	public BaseActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	protected WebDriver driver = null;

	public WebElement webelement(By locator) {
		return driver.findElement(locator);
	}

	public WebElement webelement(WebElement element, By locator) {
		return element.findElement(locator);
	}

	public List<WebElement> webelements(By locator) {
		return driver.findElements(locator);
	}

	public List<WebElement> webelements(WebElement element, By locator) {
		return element.findElements(locator);
	}

	public List<WebElement> webelementsWithoutVisibility(By cssSelector) {
		return driver.findElements(cssSelector);
	}

	public WebElement webelementWithoutVisibility(WebElement div, By cssSelector) {
		return div.findElement(cssSelector);
	}

	public WebElement webelement(By getFormDetailsUI, String fieldName2) {
//Placeholder stub		
		return null;
	}

	public WebElement webelement(Locator getFormDetailsUI, String fieldName2) {
		// Placeholder stub
		return null;
	}

}
