package com.AT.testscripts;

import org.testng.annotations.Test;

import com.AT.base.BaseTest;
import com.AT.base.PageBase;
import com.AT.base.SFPageBase;

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

		// We fetch all the labels and datatype from UI API here
		accountlistpage.uiapiscraper();

		// Form data can be passed directly on the new sObject creation screen
		accountlistpage.formValueFiller("Account Name",
				"AccountCreatedOn : " + accountlistpage.getCurrentDateTimeStamp());
		accountlistpage.formValueFiller("Upsell Opportunity", "Maybe");

		// Or form data can be read from a json file as below
		accountlistpage.formValueFiller("SIC Code", PageBase.readJsonFile("accountdata", "$.['SIC Code']"));

		accountlistpage.clickSave();
		System.out.println("Thank you :) ");

	}

	@Test(priority = 2, dependsOnMethods = { "LoginAndFetch" }, groups = { "smokeTest" })
	public void verifyMeta() {
		// From the same UI API data we can even verify that whether few fields are
		// mandatory or not
		SFPageBase.verifyRequiredFields("accountData", "Account");
	}
}
