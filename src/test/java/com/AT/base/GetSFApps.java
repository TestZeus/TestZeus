package com.AT.base;

import com.jayway.jsonpath.JsonPath;

public class GetSFApps {

	public String getAppsData() {
		String endpoint = "/ui-api/apps?formFactor=Large";
		// Newer method to run Get Api request
		return HTTPClientWrapper.runGetRequest(endpoint).toString();
	}

	public String getAppNavURL(String objectname) {
		// The below method takes objectname as input and gets the direct navigation URL
		// for that application.
		// Note: This does not provide coverage for the installed apps such as CPQ and
		// this will be updated in a future release

		String objurljson = HTTPClientWrapper.runGetRequest("/ui-api/apps?formFactor=Large").toString();
		System.out.println("Response from UI API for 9 dot icons" + objurljson);
		String jsonpath = "$.apps..[?(@.objectApiName=='" + objectname + "')].content";

		String objurl_malformed = JsonPath.read(objurljson, jsonpath).toString();

		String objurl = objurl_malformed.replace("\\/", "/");
		return objurl;

	}

}
