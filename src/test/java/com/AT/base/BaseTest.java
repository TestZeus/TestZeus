package com.AT.base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.AT.base.sfData.apps.GetSFApps;
import com.AT.pageobjects.LightningLoginPage;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

/*@author: Robin Gupta
@Date: 29 September 2021
@Purpose: All the test classes extend this base test , so as to carry forward the abstraction for page objects , webdriver setup and TEstNG level methods
🙏
*/

public class BaseTest implements ExcelReader, PropertyReader {

	public static final Logger logger = LogManager.getLogger(BaseTest.class);

	private static final String InstalledVersionDetailPage = null;

	protected static WebDriver driver;

	protected static Actions action;
	protected LightningLoginPage lightningloginpage;

	public static String SFBaseURL; // This is the base URL like https://test-ea.lightning.force.com/

	protected static PageFactory pageFactory = null;
	protected Properties staticData = getStaticData();
	protected URL huburl = null;// Setup GRID hub URL here or from properties file
	protected static EmailUtils emailUtils;

	public static String env;
	public static String SFUserId;
	public static String SFPassword;

	@BeforeSuite(alwaysRun = true)
	@Parameters({ "browserType" })
	public void setupWebDriver(@Optional("chrome") String browserType) throws IOException {
		// Fetch all the test data like URL, UserID and Passwords from config.json file
		readConfigJsonFile();

		if ((driver == null)) {
			logger.info("setupWebDriver()");
			driver = WebDriverFactory.createInstance(huburl, browserType);
			action = new Actions(driver);
			pageFactory = new PageFactory(driver);

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			System.out.println("Window width: " + driver.manage().window().getSize().getWidth());
			System.out.println("Window height: " + driver.manage().window().getSize().getHeight());
		}
	}

	private void readConfigJsonFile() {
		{ // Here the commonly used Test data is read from the config.json file
			// UAT stands for User Acceptance Testing and is a short hand for the
			// environment name. Similarly it can be PROD, Sandbox etc

			try {

				String sPath = new java.io.File(".").getCanonicalPath();
				Log.info("Path: " + sPath);
				File jsonFile = new File(sPath + File.separator + "src" + File.separator + "main" + File.separator
						+ "resources" + File.separator + "config.json");
				String salesforce_Lighteningenv = "Salesforce_Lightening";

				Log.info("Reading Environment variables from json file");

				env = (env == null) ? salesforce_Lighteningenv : env;

				SFBaseURL = (String) JsonPath.read(jsonFile, "$.environments." + env + ".UAT.homePage");
				SFUserId = (String) JsonPath.read(jsonFile, "$.environments." + env + ".UAT.userId");
				SFPassword = (String) JsonPath.read(jsonFile, "$.environments." + env + ".UAT.passwd");

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	protected void writeDynamicJsonFile(String path, String value) {
		try {// As we are using the dynamic json file as a local data store, we can write
				// data to it using this method

			String sPath = new java.io.File(".").getCanonicalPath();
			Log.info("Path: " + sPath);
			File jsonFile = new File(sPath + File.separator + "src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "dynamicdata.json");

			Log.info("Writing URL variables to json file");

			DocumentContext doc = JsonPath.parse(jsonFile).

					set(path, value);

			JsonObject jsonObj = new GsonBuilder().create().toJsonTree(doc.json()).getAsJsonObject();
			FileWriter file = new FileWriter(jsonFile);
			String a = jsonObj.toString();
			file.write(a);
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected String readDynamicJsonFile(String path) {
		try { // As we are using the dynamic json file as a local data store, we can read data
				// from it using this method

			String sPath = new java.io.File(".").getCanonicalPath();
			Log.info("Path: " + sPath);
			File jsonFile = new File(sPath + File.separator + "src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "dynamicdata.json");

			Log.info("Reading variables from json file");
			return (String) JsonPath.read(jsonFile, path);

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@BeforeTest(alwaysRun = true)
	public void cleanTestSetup() {
		driver.manage().deleteAllCookies();
	}

	@BeforeClass(alwaysRun = true)
	protected void setUp() throws MessagingException {

		// Setting up email utils object
//EmailUtils emu = new EmailUtils();
		// Setting up Login for SF API requests
		HTTPClientWrapper.SFLogin_API();

		// Set up the common page objects and fetch the data to be used in most
		// of the tests using Reflections concept

		lightningloginpage = (LightningLoginPage) pageFactory.getPageObject(LightningLoginPage.class.getName());
		// Below is commented code as reference for reading data from properties file
		// SFUserId = (String) getStaticData().get("SFLightning.userid");
		// SFPassword = (String) getStaticData().get("SFLightning.password");

	}

	@AfterMethod(alwaysRun = true)
	public void tearDownandCaptureScreenShot(Method method, ITestResult result) { // Method for taking screenshots on
																					// failure of the test case
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
				String currentdatetime = simpleDateFormat.format(new Date());
				File source = captureScreenShot();
				FileUtils.copyFile(source, new File(System.getProperty("user.dir")
						+ "/target/surefire-reports/FailedScreenShots/" + result.getName() + currentdatetime + ".png"));
				Reporter.log("Screenshot taken");
			} catch (Exception e) {

				Reporter.log("Exception while taking screenshot " + e.getMessage());
			}
		}
		logger.info("*************");
		logger.info("Ending Test  ---->" + method.getName());

	}

	public File captureScreenShot() {
		return new PageBase(driver).takeScreenshot();
	}

	@AfterClass(alwaysRun = true)
	public void deleteAllCookies() {
		// Logging out of the Salesforce APIs
		HTTPClientWrapper.SFLogout_API();

		// Handling windows after executing each class from Suite
		try {

			String originalHandle = driver.getWindowHandle();

			for (String handle : driver.getWindowHandles()) {
				if (!handle.equals(originalHandle)) {
					driver.switchTo().window(handle);
					driver.close();
				}
			}

			driver.switchTo().window(originalHandle);

		} catch (Exception e) {

			Reporter.log("Error while closing child windows" + e.getMessage());

		}

		logger.info("Clearing all browser cookies...");
		driver.manage().deleteAllCookies();

	}

	@AfterSuite(alwaysRun = true)
	public void quitWebDrivers() {
		logger.info("terminateWebDrivers()");
		try {
			driver.close();
			driver.quit();
			// Setting driver to null for stopping persistent use of driver
			// session across browsers
			driver = null;
		} catch (Exception e) {
			// Sometime driver.quit() causes exception and not nullifying the
			// driver obj. Which stops next successful browser launch
			driver = null;
			logger.error("Error quitting driver");
			e.printStackTrace();
		}
	}

	@Override
	public Properties getStaticData() { // Method to read data from static data properties file
		if (staticData == null) {
			staticData = new Properties();
			InputStream input = null;

			try {
				String filename = "staticdata.properties";
				input = BaseTest.class.getClassLoader().getResourceAsStream(filename);
				if (input != null) {
					// load a properties file from class path, inside static
					// method
					staticData.load(input);
				}
			} catch (IOException ex) {
				TestNGCustomReporter.logbr("error loading staticdata.properties" + ex.getMessage());
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						TestNGCustomReporter.logbr(("error loading staticdata.properties") + e.getMessage());
					}
				}
			}
		}
		return staticData;
	}

	// Stub methods below for reference
	@Override
	public String excelValueReader(int row, int column) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excelValueWriter(int row, int column, String value) {
		// TODO Auto-generated method stub

	}

	public String getURL(String appname) { // Method to get SF Apps URL and simulate 9 dot navigation
		GetSFApps getSfApps = new GetSFApps();

		return getSfApps.getAppNavURL(appname);

	}

}
