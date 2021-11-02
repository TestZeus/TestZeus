package com.AT.base.forceObject.Checkbox;

import org.openqa.selenium.WebDriver;

import com.AT.base.forceObject.SFField;
import com.AT.base.forceObject.Input.Input;

public class CheckBox extends Input {

	public CheckBox(SFField field, WebDriver driver) {
		super(field, driver);
	}

	@Override
	public void set(String value) {
		getWebElement().click();
	}

}
