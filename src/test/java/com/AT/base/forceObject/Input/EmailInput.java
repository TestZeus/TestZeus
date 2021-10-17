package com.AT.base.forceObject.Input;

import org.openqa.selenium.WebDriver;

import com.AT.base.forceObject.SFField;
import com.AT.base.forceObject.Locators.Locators_Get;

public class EmailInput extends Input {

	public EmailInput(SFField field, WebDriver driver) {
		super(field, driver);
	}

	@Override
	public String get() {
		return webelement(Locators_Get.getEmail_ReferenceDetailUI, fieldName).getText();
	}

}
