package com.AT.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BaseActions {
    protected WebDriver driver = null;

    public BaseActions(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement webelement(By locator) {
        return driver.findElement(locator);
    }

    public WebElement webelement(WebElement element, By locator) {
        return element.findElement(locator);
    }

    public List<WebElement> webelements(By locator) {
        return driver.findElements(locator);
    }


    public List<WebElement> webelements(WebElement element,By locator) {
        return element.findElements(locator);
    }


}
