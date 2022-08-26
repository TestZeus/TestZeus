package testscripts;

import org.testng.annotations.Test;

import base.BaseTest;
import testzeus.base.SFPageBase;

/**
 * @author Robin
 * @date: 28/09/2021
 * @purpose: This test covers the login to UI, fetches the UI API details and
 *           prints them to console 👼
 */

public class AccountCreationViaUI extends BaseTest {

	@Test(priority = 1)
	public void createAccount() throws Exception {

		// Navigation to login page
		lightningloginpage.openHomepage(SFBaseURL);
		// Submitting user id, password and logging in
		lightningloginpage.login(SFUserId, SFPassword);
		// Navigating directly to Account app
		lightningloginpage.applauncher("Account");
		accountlistpage.clickNew();

		// We fetch all the labels and datatype from UI API here for a certain record id
		String recordid = "0015g00000S9lfUAAR";
		accountlistpage.uiApiParser(recordid);

		// Form data can be passed directly on the new sObject creation screen
		accountlistpage.formValueFiller("Account Name",
				"AccountCreatedOn : " + accountlistpage.getCurrentDateTimeStamp());
//		accountlistpage.formValueFiller("Upsell Opportunity", "Maybe");

		// Or form data can be read from a json file as below
		accountlistpage.formValueFiller("SIC Code",
				testzeus.base.SFPageBase.readJsonFile("accountdata", "$.['SIC Code']"));

		accountlistpage.clickSave();
		System.out.println("Thank you :) ");

	}

	@Test(priority = 2, dependsOnMethods = { "createAccount" }, groups = { "smokeTest" })
	public void verifyMeta() {
		// From the same UI API data we can even verify that whether few fields are
		// mandatory or not
		SFPageBase.verifyRequiredFields("accountData", "Account");
	}
}
