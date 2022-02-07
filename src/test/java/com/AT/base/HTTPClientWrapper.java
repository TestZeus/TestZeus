package com.AT.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class HTTPClientWrapper {
	/*
	 * @author: Robin Gupta
	 * 
	 * @Date: 29 Sep 2021
	 * 
	 * @Purpose: This class acts as a bridge for interacting with Salesforce REST
	 * APIs ⚙
	 */

	private static String REST_ENDPOINT = "/services/data";
	private static String API_VERSION = "/v48.0";
	private static String baseUri;
	private static Header oauthHeader;
	private static Header prettyPrintHeader = new BasicHeader("X-PrettyPrint", "1");
	private static HttpPost httpPost;

	// Initial steps for API access
	// reset api token for user and enable connected app access in the Profile for
	// System admin or user at hand

	protected static final String SFAPIUSERNAME_UAT = "test10zeus@gmail.com";

	protected static final String SFAPITOKEN_UAT = PageBase.readJsonFile("config", "$..apitoken");

	protected static final String SFAPIPASSWORDSTRING_UAT = PageBase.readJsonFile("config", "$..passwd");

	// password needs to be appended with token as per :
	// https://stackoverflow.com/questions/38334027/salesforce-oauth-authentication-bad-request-error

	protected static final String SFAPIPASSWORD_UAT = SFAPIPASSWORDSTRING_UAT + SFAPITOKEN_UAT;

	protected static final String SFAPILOGINURL_UAT = "https://testzeus2-dev-ed.my.salesforce.com";

	protected static final String SFAPIGRANTSERVICE = "/services/oauth2/token?grant_type=password";
	// Client id is the consumer key for the connected app
	protected static final String SFAPICLIENTID_UAT = PageBase.readJsonFile("config", "$..SFAPICLIENTID_UAT");

	// Client secret is the consumer secret
	protected static final String SFAPICLIENTSECRET_UAT = PageBase.readJsonFile("config", "$..SFAPICLIENTSECRET_UAT");

	protected static void SFLogin_API() {

		HttpClient httpclient = HttpClientBuilder.create().build();

		// Login requests must be POSTs
		String postUri = SFAPILOGINURL_UAT + SFAPIGRANTSERVICE + "&client_id=" + SFAPICLIENTID_UAT + "&client_secret="
				+ SFAPICLIENTSECRET_UAT + "&username=" + SFAPIUSERNAME_UAT + "&password=" + SFAPIPASSWORD_UAT;

		System.out.println("POST URI is " + postUri);
		httpPost = new HttpPost(postUri);

		httpPost.addHeader("Content-Type", "application/json");

		HttpResponse response = null;

		System.out.println("POST Request is" + httpPost.toString());

		System.out.println("Login Post headers are below:");
		Header[] headers = httpPost.getAllHeaders();

		for (Header header : headers) {
			System.out.println(header.getName() + ": " + header.getValue());
		}

		try {
			// Execute the login POST
			// request-----------------------------------------------------
			response = httpclient.execute(httpPost);
			System.out.println("Executing the login POST request");
			System.out.println("Login response is" + response);
		} catch (Exception e) {
			System.out.println("Exception in SF API Login" + e.getMessage());
		}

		// verify response is HTTP OK
		final int statusCode = response.getStatusLine().getStatusCode();
		if (statusCode != HttpStatus.SC_OK) {
			System.out.println("Error authenticating to Force.com: " + statusCode);
			// Error is in EntityUtils.toString(response.getEntity())
			return;
		}

		String getResult = null;
		try {
			getResult = EntityUtils.toString(response.getEntity());
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}

		JSONObject jsonObject = null;
		String loginAccessToken = null;
		String loginInstanceUrl = null;

		try {
			jsonObject = (JSONObject) new JSONTokener(getResult).nextValue();
			loginAccessToken = jsonObject.getString("access_token");
			loginInstanceUrl = jsonObject.getString("instance_url");
		} catch (JSONException jsonException) {
			jsonException.printStackTrace();
		}

		baseUri = loginInstanceUrl + REST_ENDPOINT + API_VERSION;
		oauthHeader = new BasicHeader("Authorization", "OAuth " + loginAccessToken);
		System.out.println("oauthHeader1: " + oauthHeader);
		System.out.println("\n" + response.getStatusLine());

		System.out.println("instance URL: " + loginInstanceUrl);
		System.out.println("baseUri: " + baseUri);
		System.out.println("Created POST connection for SF REST API for Login purpose");
	}

	protected static void SFLogout_API() {
		httpPost.releaseConnection();
		System.out.println("Releasing connection from SF REST API via HTTPClientWrapper");
	}

	public static JSONObject runGetRequest(String uri) {
		System.out.println("\n_______________ sObject Get Request _______________");

		try {

			// Set up the HTTP objects needed to make the request.
			HttpClient httpClient = HttpClientBuilder.create().build();

			System.out.println("GET URI is" + baseUri + uri);

			HttpGet httpGet = new HttpGet(baseUri + uri);
			httpGet.addHeader(oauthHeader);
			httpGet.addHeader(prettyPrintHeader);

			// Make the request.
			HttpResponse response = httpClient.execute(httpGet);

			// Process the result
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == 200) {
				String response_string = EntityUtils.toString(response.getEntity());
				try {
					JSONObject json = new JSONObject(response_string);

					return json;

				} catch (JSONException je) {
					je.printStackTrace();
				}
			} else {
				System.out.println("Query was unsuccessful. Status code returned is " + statusCode);
				System.out.println("An error has occured. Http status: " + response.getStatusLine().getStatusCode());
				System.out.println(getBody(response.getEntity().getContent()));
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		return null;

	}

	public static void update_sObjectDetails(String uri, JSONObject json) {

		// Update sObjects using REST HttpPatch. We have to create the HTTPPatch, as it
		// does not exist in the standard library
		// Since the PATCH method was only recently standardized and is not yet
		// implemented in Apache HttpClient

		System.out.println("\n_______________ sObject UPDATE _______________");

		try {

			System.out.println("JSON for update of  record:\n" + json.toString(1));

			// Set up the objects necessary to make the request.
			// DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpClient httpClient = HttpClientBuilder.create().build();

			HttpPatch httpPatch = new HttpPatch(baseUri + uri);
			httpPatch.addHeader(oauthHeader);
			httpPatch.addHeader(prettyPrintHeader);
			StringEntity body = new StringEntity(json.toString(1));
			body.setContentType("application/json");
			httpPatch.setEntity(body);

			// Make the request
			HttpResponse response = httpClient.execute(httpPatch);

			// Process the response
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == 204) {
				System.out.println("Updated the sObject successfully.");
			} else {
				System.out.println("sObject update NOT successfully. Status code is " + statusCode);
			}
		} catch (JSONException e) {
			System.out.println("Issue creating JSON or processing results");
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}

	}

	public static JSONObject create_sObject(String uri, JSONObject jsondata) {
		System.out.println("\n_______________ sObject INSERT _______________");

		try {

			System.out.println("JSON for sObject record to be inserted:\n" + jsondata.toString(1));

			// Construct the objects needed for the request
			HttpClient httpClient = HttpClientBuilder.create().build();

			HttpPost httpPost = new HttpPost(baseUri + uri);
			httpPost.addHeader(oauthHeader);
			httpPost.addHeader(prettyPrintHeader);
			// The message we are going to post
			StringEntity body = new StringEntity(jsondata.toString(1));
			body.setContentType("application/json");
			httpPost.setEntity(body);
			System.out.println("post value: " + httpPost);
			// Make the request
			HttpResponse response = httpClient.execute(httpPost);

			// Process the results
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == 201) {
				String response_string = EntityUtils.toString(response.getEntity());
				JSONObject json = new JSONObject(response_string);

				return json;

			} else {
				System.out.println("Insertion unsuccessful. Status code returned is " + statusCode);
			}
		} catch (JSONException e) {
			System.out.println("Issue creating JSON or processing results");
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		return null;

	}

	// Extend the Apache HttpPost method to implement an HttpPatch
	private static class HttpPatch extends HttpPost {
		public HttpPatch(String uri) {
			super(uri);
		}

		@Override
		public String getMethod() {
			return "PATCH";
		}
	}

	private static String getBody(InputStream inputStream) {
		String result = "";
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				result += inputLine;
				result += "\n";
			}
			in.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return result;
	}

	public static String runDeleteRequest(String uri) {
		System.out.println("\n_______________ sObject Delete Request _______________");

		try {

			// Set up the HTTP objects needed to make the request.
			HttpClient httpClient = HttpClientBuilder.create().build();

			System.out.println("Delete URI is" + baseUri + uri);

			HttpDelete httpDelete = new HttpDelete(baseUri + uri);
			httpDelete.addHeader(oauthHeader);
			httpDelete.addHeader(prettyPrintHeader);

			// Make the request.
			HttpResponse response = httpClient.execute(httpDelete);

			// Process the result
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == 200 || statusCode == 204) {
				try {
					try {
						String response_string = EntityUtils.toString(response.getEntity());

						JSONArray json = new JSONArray(response_string);

						String deleteresponse = json.toString();
						return deleteresponse;
					} catch (JSONException je) {
						je.printStackTrace();
					}
				} catch (Exception e) {
					System.out.println(
							"Delete request is successful with no Response body for the status code : " + statusCode);
				}
			} else {
				System.out.println("Delete request was unsuccessful. Status code returned is " + statusCode);
				System.out.println("An error has occured. Http status: " + response.getStatusLine().getStatusCode());
				System.out.println(getBody(response.getEntity().getContent()));
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		return null;

	}

}