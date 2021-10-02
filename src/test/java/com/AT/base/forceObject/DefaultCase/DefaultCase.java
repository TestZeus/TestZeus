package com.AT.base.forceObject.DefaultCase;

import org.openqa.selenium.WebDriver;

import com.AT.base.forceObject.ForceObject;
import com.AT.base.forceObject.SFField;

import com.AT.base.locators.Locators_Get;
import com.AT.base.utils.BaseActions;

public class DefaultCase extends BaseActions implements ForceObject {
	protected String span;
	protected String fieldName;

	public DefaultCase(SFField field, WebDriver driver) {
		super(driver);
		this.driver = driver;
		fieldName = field.getLabel();
		span = "//div[contains(@class, 'forcePageBlockSectionView')]//div[contains(@class, 'forcePageBlockSectionRow')]//div[contains(@class, 'forcePageBlockItem')]//div[contains(@class,'label')]/span[text()='"
				+ fieldName + "']/../../div[last()]/span";
	}

	@Override
	public void set(String value) {
		System.out.println("[Alert] : Need to implement in DefaultCase");

	}

	@Override
	public String get() {
		return webelement(Locators_Get.getFormDetailsUI, fieldName).getText();
	}

	public void clear() {
		System.out.println("[Alert] : Need to implement in DefaultCase");

	}

	@Override
	public String edit_get() {
		System.out.println("[Alert] : Need to implement in DefaultCase");
		return null;
	}
}