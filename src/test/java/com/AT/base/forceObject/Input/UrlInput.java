package com.AT.base.forceObject.Input;

import org.openqa.selenium.WebDriver;

import com.AT.base.forceObject.SFField;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class UrlInput extends Input {

	public UrlInput(SFField field, WebDriver driver) throws JsonMappingException, JsonProcessingException {
		super(field, driver);
	}

}
