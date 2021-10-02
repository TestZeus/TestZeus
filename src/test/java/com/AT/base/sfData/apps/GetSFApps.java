package com.AT.base.sfData.apps;

import org.junit.Test;

import com.AT.base.HTTPClientWrapper;
import com.AT.base.sfData.BaseSFData;
import com.AT.base.sfData.apps.describeAppsPOJO.Apps;

public class GetSFApps {
	Apps apps = new Apps();
	BaseSFData jsonMap = new BaseSFData();

	private String getAppsData() {
		String endpoint = "ui-api/apps?formFactor=Large";
		// Older method to run Get API request

//		GetRequest getRequest = new GetRequest();
//		return getRequest.getResponseWithOauth(endpoint).getBody().asString();

		// Newer method to run Get Api request
		return HTTPClientWrapper.runGetRequest(endpoint).toString();
	}

	public Apps get() {
		apps = jsonMap.getDescriptionInstance(getAppsData(), Apps.class);
		return apps;
	}

	@Test
	public void checkAppData() {
		GetSFApps getSfApps = new GetSFApps();
		Apps apps = getSfApps.get();
		System.out.println(apps.getApps().get(1).getLabel());
	}
}
