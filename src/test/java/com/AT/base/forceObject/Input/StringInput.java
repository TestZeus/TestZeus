package com.AT.base.forceObject.Input;

import org.openqa.selenium.WebDriver;

import com.AT.base.forceObject.SFField;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class StringInput extends Input {

	public StringInput(SFField field, WebDriver driver) throws JsonMappingException, JsonProcessingException {
		super(field, driver);
	}

}
