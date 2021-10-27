package com.AT.base.forceObject.Checkbox;

import org.openqa.selenium.WebDriver;

import com.AT.base.forceObject.SFField;
import com.AT.base.forceObject.Input.Input;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class CheckBox extends Input {

	public CheckBox(SFField field, WebDriver driver) throws JsonMappingException, JsonProcessingException {
		super(field, driver);
	}

	@Override
	public void set(String value) {
		getWebElement().click();
	}

}
