package com.AT.base.forceObject.DateTime;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.AT.base.BaseActions;
import com.AT.base.DataFields;
import com.AT.base.forceObject.ForceObject;
import com.AT.base.forceObject.SFField;
import com.AT.base.forceObject.Locators.Locators_Get;

public class DateTime extends BaseActions implements ForceObject {

	protected String fieldName, domDataType;
	private SFField details;
	protected static Map<String, String> dataTypes = DataFields.fields();
	protected String span;

	public DateTime(SFField field, WebDriver driver) {
		super(driver);
		this.driver = driver;
		details = field;
		fieldName = field.getLabel();
		domDataType = dataTypes.get(field.getDetails().getType());
	}

	@Override
	public void set(String value) {
		System.out.println("[Alert] : Need to implement in DateTime");

	}

	@Override
	public String get() {
		return webelement(Locators_Get.getEmail_ReferenceDetailUI, fieldName).getText();
	}

	public void clear() {
		System.out.println("[Alert] : Need to implement in DateTime");
	}

	@Override
	public String edit_get() {
		// TODO Auto-generated method stub
		return null;
	}

}
