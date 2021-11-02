package com.AT.base.sfData.quickActions;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;

import com.AT.base.HTTPClientWrapper;
import com.AT.base.sfData.BaseSFData;
import com.AT.base.sfData.quickActions.describeQuickActionsPOJO.AllActions;

public class GetSFQuickAction {

	BaseSFData jsonMap = new BaseSFData();

	public JSONArray getQuickActionsData() {
		String endpoint = "quickActions";
		// Older method to run Get API request

//        GetRequest getRequest = new GetRequest();
		String responseBody = HTTPClientWrapper.runGetRequest(endpoint).toString();
		JSONArray responseArray = new JSONArray(responseBody);
		return responseArray;
	}

	private Map<String, String> getDescriptionLinks() {
		JSONArray actionsData = getQuickActionsData();
		Map<String, String> actionsURL = new HashMap<>();
		AllActions actions;
		for (Object actionData : actionsData) {
			actions = jsonMap.getDescriptionInstance(actionData.toString(), AllActions.class);
			actionsURL.put(actions.getLabel().toLowerCase(), actions.getUrls().getDescribe());
		}
		return actionsURL;
	}

	public String get(String quickAction) {
		Map<String, String> actionsURLs;
		actionsURLs = getDescriptionLinks();
		String endpoint = null;
		try {
			endpoint = actionsURLs.get(quickAction.toLowerCase());
			if (endpoint.equalsIgnoreCase("null"))
				throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("Select from following actions only : ");
			for (Map.Entry<String, String> entry : actionsURLs.entrySet()) {
				System.out.println(entry.getKey().toUpperCase() + " : " + entry.getValue());
			}
		}
//		GetRequest getRequest = new GetRequest();
		endpoint = endpoint.split("quickActions")[1];
		String responseBody = HTTPClientWrapper.runGetRequest("/quickActions" + endpoint).toString();
		return responseBody;
	}

	public static void main(String[] args) {
		GetSFQuickAction qAction = new GetSFQuickAction();
		qAction.get("Log a Call");
	}

}
