package com.AT.pageobjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AT.base.PageBase;

public class LightningLoginPage extends PageBase {

	@FindBy(id = "username")
	@CacheLookup
	private WebElement username;

	@FindBy(id = "password")
	@CacheLookup
	private WebElement password;

	@FindBy(id = "Login")
	@CacheLookup
	private WebElement login_button;

	@FindBy(xpath = "")
	private List<WebElement> sessionErrorMessage;

	public LightningLoginPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(driver, this);// Creates instance for all web elements
	}

	/**
	 *
	 * @author Robin 28-9-2021
	 * @return the SF Lightning page class instance.
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void login(String userid, String passwordtext) throws InterruptedException, IOException {

//		Thread.sleep(5000);
//
//		SFField field = new SFField();
//		field.setLabel("Account Name");
//		TextArea ta = new TextArea(field, driver);
//
//		System.out.println(ta);

//		ObjectMapper mapper = new ObjectMapper();
//		SFField field = null;
//
//		field = mapper.readValue((GetSFObject.getDescribeLayout("Lead")), SFField.class);
//		field.setLabel("Phone");
//		System.out.println("Field label -------" + field.getLabel());
//		Input omnisearch = new Input(field, driver);
//		System.out.println(omnisearch.get());

		try {

			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println("Alert data: " + alertText);
			alert.accept();

		} catch (NoAlertPresentException e) {

		}

		explicitWait(username, 5);

		username.sendKeys(userid);
		password.sendKeys(passwordtext);
		safeClick(login_button);

		Thread.sleep(2000);
		waitForSFPagetoLoad();

	}

}
