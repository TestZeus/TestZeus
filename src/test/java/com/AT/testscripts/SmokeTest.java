package com.AT.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.AT.base.BaseTest;
import com.AT.base.HTTPClientWrapper;
import com.jayway.jsonpath.JsonPath;

/**
 * @author Robin
 * @date: 28/09/2021
 * @purpose: This test covers the login to UI, fetches the UI API details and
 *           prints them to console 👼
 */

public class SmokeTest extends BaseTest {

	@Test(priority = 1)
	public void LoginAndFetch() throws Exception {
//

		// The data from this API call can be observed in the Emailable report under
		// Surefire reports folder
//		Reporter.log((HTTPClientWrapper.runGetRequest("/ui-api/record-ui/0015g00000S9lfUAAR")).toString());

		// For getting the base layouts
		// System.out.println(HTTPClientWrapper.runGetRequest("/sobjects/Account/describe/layouts/"));

		// For getting the actions
		// System.out.println(HTTPClientWrapper.runGetRequest("/ui-api/actions/record/5006f00001fC2rmAAC"));

		// For getting 9 dot icon URLs :
		String accountURLjson = HTTPClientWrapper.runGetRequest("/ui-api/apps?formFactor=Large").toString();

		String accountsURLmalformed = JsonPath.read(accountURLjson, "$.apps..[?(@.objectApiName=='Report')].content")
				.toString();

		String accountsURL = accountsURLmalformed.replace("\\/", "/");

//		lightningloginpage.openHomepage(SFBaseURL);
//		lightningloginpage.login(SFUserId, SFPassword);

		driver.navigate().to(accountsURL);

	}

	@Test(priority = 2, dependsOnMethods = { "LoginAndFetch" }, groups = { "smokeTest" })
	public void Logout() {

		Reporter.log("End of script");
	}
}
