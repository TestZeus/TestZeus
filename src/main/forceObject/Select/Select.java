package sft.forceObject.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sft.DataFields;
import sft.forceObject.ForceObject;
import sft.forceObject.SFField;
import sft.locators.Locators_Get;
import sft.sfData.objectDescribe.describeLayoutPOJO.PicklistValue;
import sft.utils.BaseActions;

import java.util.List;
import java.util.Map;

public class Select extends BaseActions implements ForceObject {
    private String fieldName, domDataType;
    private WebDriver driver;
    private static Map<String, String> dataTypes = DataFields.fields();
    private SFField details;

    public Select(SFField field, WebDriver driver) {
        super(driver);
        this.driver = driver;
        details = field;
        fieldName = field.getLabel();
        domDataType = dataTypes.get(field.getDetails().getType());
    }

    private void select(String value) {
        System.out.println("Trying to select value : " + value + " for field : " + fieldName);
        boolean found = false;
        List<WebElement> divs = webelementsWithoutVisibility(By.cssSelector("div[class *='" + domDataType + "']"));
        for (WebElement div : divs) {
            String spanText = webelementWithoutVisibility(div, By.cssSelector("span")).getText().replace('*', ' ').trim();
            if (spanText.equalsIgnoreCase(fieldName)) {
                click(webelementWithoutVisibility(div, By.cssSelector("a")));
                break;
            }
        }

        List<WebElement> options = webelements(By.cssSelector("div[class*='select-options'][class*='visible'] ul li a"));
        int size = options.size();
        for (int i = 0; i < size; i++) {
            options = webelementsWithoutVisibility(By.cssSelector("div[class*='select-options'][class*='visible'] ul li a"));
            WebElement option = options.get(i);
            if (option.getText().equalsIgnoreCase(value)) {
                option.click();
                hardwait(1);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Available options for field \"" + fieldName + "\" are :");
            List<PicklistValue> picklist = details.getDetails().getPicklistValues();
            for (int j = 0; j < picklist.size(); j++)
                System.out.println("\t\t" + picklist.get(j).getLabel());
            Assert.fail();
        }
    }

    public void set(String value) {
        select(value);
    }

    public void clear() {

    }

    @Override
    public String get() {
        return webelement(Locators_Get.getFormDetailsUI, fieldName).getText();
    }

    public String edit_get() {
        List<WebElement> divs = webelementsWithoutVisibility(By.cssSelector("div[class *='" + domDataType + "']"));
        for (WebElement div : divs) {
            String spanText = webelementWithoutVisibility(div, By.cssSelector("span")).getText().replace('*', ' ').trim();
            if (spanText.equalsIgnoreCase(fieldName)) {
                return webelement(div, By.cssSelector("a")).getText();
            }
        }
        return null;
    }

}
