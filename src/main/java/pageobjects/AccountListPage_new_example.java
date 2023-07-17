package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountListPage_new_example extends testzeus.base.SFPageBase {

	@FindBy(xpath = "//a[@title='New']")
	private WebElement newbutton;

	@FindBy(xpath = "//button[@name='SaveEdit']")
	private WebElement savebutton;

	public AccountListPage_new_example(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(driver, this);// Creates instance for all web elements
	}

	/**
	 *
	 * @author Robin 28-9-2021
	 * @return the SF Account List page class instance.
	 * @throws InterruptedException
	 */
	public void clickNew() throws InterruptedException {

		Thread.sleep(5000);
		SFClick(newbutton);

		waitForSFPagetoLoad();

	}

	public void clickSave() throws InterruptedException {

		SFClick(savebutton);

		Thread.sleep(5000);

	}

}
