package com.AT.base.forceObject.Locators;


import com.AT.base.Locator;

public class Locators_Get extends Locator
{
	public static Locator getFormDetailsUI = new Locator(XPATH,
"//force-record-layout-section//div[contains(@class,'label')]/span[text()='${fieldName}']/../../div[last()]//slot/slot");

	public static Locator getEmail_ReferenceDetailUI = new Locator(XPATH,getFormDetailsUI.value+"//a");
}
