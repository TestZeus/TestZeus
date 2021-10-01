package sft.forceObject.Input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sft.DataFields;
import sft.forceObject.ForceObject;
import sft.forceObject.SFField;
import sft.locators.Locators_Get;
import sft.utils.BaseActions;

import java.util.List;
import java.util.Map;



public class Input extends BaseActions implements ForceObject
{
	protected String fieldName,domDataType;
	private SFField details;
	protected static Map<String,String> dataTypes = DataFields.fields();
	protected String span;
	public Input(SFField field,WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		details = field;
		fieldName = field.getLabel();
		domDataType = dataTypes.get(field.getDetails().getType());
	}

	protected WebElement getWebElement() {
		List<WebElement> divs = webelementsWithoutVisibility(By.cssSelector("div[class *='"+ domDataType +"']"));
		int size = divs.size();
		for(int i=0; i<size; i++)
		{
			divs = webelementsWithoutVisibility(By.cssSelector("div[class *='"+ domDataType +"']"));
			WebElement div = divs.get(i);
			String spanText = webelementWithoutVisibility(div,By.cssSelector("span")).getText().replace('*',' ').trim();
			if(spanText.equalsIgnoreCase(fieldName))
			{
				return webelement(div,By.cssSelector("input"));
			}
		}
		return null;
	}

	public void set(String value) 
	{
		getWebElement().clear();
		getWebElement().sendKeys(value);
	}

	public void clear()
	{
		getWebElement().clear();
	}
	
	public String get() {	
		return webelement(Locators_Get.getFormDetailsUI,fieldName).getText();
	}
	
	public String edit_get() {	
		return getWebElement().getAttribute("value");
	}
}
