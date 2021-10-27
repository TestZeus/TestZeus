package com.AT.base.forceObject.Input;

import org.openqa.selenium.WebDriver;

import com.AT.base.forceObject.SFField;
import com.AT.base.forceObject.Locators.Locators_Get;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class EmailInput extends Input {

	public EmailInput(SFField field, WebDriver driver) throws JsonMappingException, JsonProcessingException {
		super(field, driver);
	}

	@Override
	public String get() {
		return webelement(Locators_Get.getEmail_ReferenceDetailUI, fieldName).getText();
	}

}
