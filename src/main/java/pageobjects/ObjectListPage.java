package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectListPage extends testzeus.base.SFPageBase {

	@FindBy(xpath = "//a[@title='New']")
	private WebElement newbutton;

	@FindBy(xpath = "//button[@name='SaveEdit']")
	private WebElement savebutton;
	

	@FindBy(xpath = "//div[@class='slds-grid']//span[text() = 'Recently Viewed']/following::lightning-icon[@icon-name='utility:down'][2]")
	private WebElement showmoreactions;

	public ObjectListPage(WebDriver webDriver) {
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
	
	public void clickShowMoreActions() throws InterruptedException {

		try{
			SFClick(showmoreactions);
			}
		catch(Exception e) {
			System.out.println("Show more button not shown on list view");
		}
	

		waitForSFPagetoLoad();

	}
	
	

	public void clickSave() throws InterruptedException {

		SFClick(savebutton);

		Thread.sleep(5000);

	}

}
