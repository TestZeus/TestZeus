package com.AT.base.forceObject.Input;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.AT.base.BaseActions;
import com.AT.base.DataFields;
import com.AT.base.forceObject.ForceObject;
import com.AT.base.forceObject.SFField;
import com.AT.base.forceObject.Locators.Locators_Get;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Input extends BaseActions implements ForceObject {
	protected String fieldName, domDataType;
	private SFField details;
	protected static Map<String, String> dataTypes = DataFields.fields();
	protected String span;

	public Input(SFField field, WebDriver driver) throws JsonMappingException, JsonProcessingException {
		super(driver);
		this.driver = driver;
		details = field;
		System.out.println(details);
		fieldName = field.getLabel();
		domDataType = dataTypes.get(
				field.getLayouts().get(0).getQuickActionList().getQuickActionListItems().get(2).getLabel().toString());

	}

	protected WebElement getWebElement() {
		List<WebElement> divs = webelementsWithoutVisibility(By.cssSelector("div[class *='" + domDataType + "']"));
		int size = divs.size();
		for (int i = 0; i < size; i++) {
			divs = webelementsWithoutVisibility(By.cssSelector("div[class *='" + domDataType + "']"));
			WebElement div = divs.get(i);
			String spanText = webelementWithoutVisibility(div, By.cssSelector("span")).getText().replace('*', ' ')
					.trim();
			if (spanText.equalsIgnoreCase(fieldName)) {
				return webelement(div, By.cssSelector("input"));
			}
		}
		return null;
	}

	@Override
	public void set(String value) throws InterruptedException {
		getWebElement().clear();
		getWebElement().sendKeys(value);
	}

	public void clear() {
		getWebElement().clear();
	}

	@Override
	public String get() {
		return webelement(Locators_Get.getFormDetailsUI, fieldName).getText();
	}

	@Override
	public String edit_get() {
		return getWebElement().getAttribute("value");
	}
}
