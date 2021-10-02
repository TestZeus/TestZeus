package com.AT.base.forceObject.Input;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.AT.base.forceObject.SFField;

public class DateInput extends Input {

	public DateInput(SFField field, WebDriver driver) {
		super(field, driver);
	}

	@Override
	protected WebElement getWebElement() {
		List<WebElement> dateFields = webelementsWithoutVisibility(
				By.xpath("//div[contains(@class, '" + domDataType + "')]/../label/span"));
		int size = dateFields.size();
		int i;
		for (i = 0; i < size; i++) {
			dateFields = webelementsWithoutVisibility(
					By.xpath("//div[contains(@class, '" + domDataType + "')]/../label/span"));

			if (dateFields.get(i).getText().replace('*', ' ').trim().equals(fieldName))
				break;
		}
		return webelements(By.xpath("//div[contains(@class, '" + domDataType + "')]/input")).get(i);
	}

}
