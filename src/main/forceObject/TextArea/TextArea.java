package sft.forceObject.TextArea;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sft.DataFields;
import sft.forceObject.ForceObject;
import sft.forceObject.SFField;
import sft.locators.Locators_Get;
import sft.utils.BaseActions;

import java.util.List;
import java.util.Map;

public class TextArea extends BaseActions implements ForceObject
{

	private String fieldName,domDataType;
	private WebDriver driver;
	private SFField details;
	private static Map<String,String> dataTypes = DataFields.fields();

	public TextArea(SFField field,WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		details = field;
		fieldName = field.getLabel();
		domDataType = dataTypes.get(field.getDetails().getType());
	}

	private WebElement getWebElement() {
		List<WebElement> divs = webelementsWithoutVisibility(By.cssSelector("div[class *='"+ domDataType +"']"));
		int size = divs.size();
		for(int i=0; i < size; i++)
		{
			divs = webelementsWithoutVisibility(By.cssSelector("div[class *='"+ domDataType +"']"));
			WebElement div = divs.get(i);
			String spanText = webelementWithoutVisibility(div,By.cssSelector("span")).getText();
			if(spanText.equalsIgnoreCase(fieldName))
				return webelement(div,By.cssSelector("textarea"));
		}
		return null;
	}

	public void set(String value) 
	{
		getWebElement().clear();
		getWebElement().sendKeys(value, Keys.ENTER);
	}

	public void clear()
	{
		getWebElement().clear();
	}

	@Override
	public String get() {
		return webelement(Locators_Get.getFormDetailsUI,fieldName).getText();
	}

	public String edit_get() {	
		return getWebElement().getAttribute("value");
	}
	
}
