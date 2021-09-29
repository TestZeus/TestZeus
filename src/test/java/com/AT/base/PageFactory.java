package com.AT.base;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

public class PageFactory {
	/*
	 * @author: Robin Gupta
	 * 
	 * @Date: 29 Sep 2021
	 * 
	 * @Purpose: This class helps in creating new instances of page objects at run
	 * time using Java Reflections 🏭
	 */
	private WebDriver webDriver;

	public PageFactory(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public Object getPageObject(String pageobject) {

		try {
			Constructor<?> c = Class.forName(pageobject).getConstructor(WebDriver.class);
			return c.newInstance(webDriver);
		} catch (NoSuchMethodException e) {

			e.printStackTrace();
		} catch (SecurityException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (InvocationTargetException e) {

			e.printStackTrace();
		}
		return null;

	}

}
