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

public class CaseCreationViaUI extends BaseTest {

	@Test(priority = 1)
	public void createCase() throws Exception {

		// Navigation to login page
		lightningloginpage.openHomepage(SFBaseURL);
		// Submitting user id, password and logging in
		lightningloginpage.login(SFUserId, SFPassword);
		// Navigating directly to Case list page
		lightningloginpage.applauncher("Case");
		objectlistpage.clickShowMoreActions();
		objectlistpage.clickNew();

		// We fetch all the labels and datatype from UI API here for a certain record id
		String recordid = "5005g00000iogzGAAQ";
		objectlistpage.uiApiParser(recordid);

		// Form data can be passed directly on the new sObject creation screen
		objectlistpage.formValueFiller("Case Origin",
				"Phone");

		objectlistpage.clickSave();
		System.out.println("Thank you :) ");

	}

	@Test(priority = 2, dependsOnMethods = { "createCase" }, groups = { "smokeTest" })
	public void verifyMeta() {
		// From the same UI API data we can even verify that whether few fields are
		// mandatory or not
		SFPageBase.verifyRequiredFields("accountData", "Account");
	}
}
