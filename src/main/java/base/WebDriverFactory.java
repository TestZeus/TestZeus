package base;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


@SuppressWarnings("deprecation")
public class WebDriverFactory {

	/*
	 * @author: Robin Gupta
	 * 
	 * @Date: 29 September 2021
	 * 
	 * @Purpose: This class helps in setting up the webdriver dynamically as per the
	 * parameters passed from BaseTest class. 🏭
	 */

	static Logger log = LogManager.getLogger(WebDriverFactory.class);
	public final static String windowXPositionKey = "xpos";
	public final static String windowYPositionKey = "ypos";

	public static WebDriver startInstance(String browserName) {
		WebDriver driver = null;
		try {
			URL hubUrl = null;// Set hubURL here
			driver = WebDriverFactory.createInstance(hubUrl, browserName);
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			int xPosition = Integer.valueOf(System.getProperty(windowXPositionKey, "0"));
			int yPosition = Integer.valueOf(System.getProperty(windowYPositionKey, "0"));
			driver.manage().window().setPosition(new Point(xPosition, yPosition));
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Exception creating driver instance", e);
		}
		return driver;
	}

	@SuppressWarnings("deprecation")
	static WebDriver createInstance(URL hubUrl, String browserName) throws IOException {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver(createFirefoxProfile());
		} else if (browserName.equalsIgnoreCase("chrome")) {
			String chromeExe = "src" + File.separator + "test" + File.separator + "resources" + File.separator
					+ "chromedriver.exe";// set the path to chromedriver for Windows systems
			System.setProperty("webdriver.chrome.driver", chromeExe);
			System.setProperty("webdriver.chrome.silentOutput", "true");
			// Added options as https://github.com/lefthandedgoat/canopy/issues/376
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.setExperimentalOption("useAutomationExtension", false);
			options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
			options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
			options.addArguments("--no-sandbox"); // https://stackoverflow.com/a/50725918/1689770
			options.addArguments("--disable-infobars"); // https://stackoverflow.com/a/43840128/1689770
			options.addArguments("--disable-dev-shm-usage"); // https://stackoverflow.com/a/50725918/1689770
			options.addArguments("--disable-browser-side-navigation"); // https://stackoverflow.com/a/49123152/1689770
			options.addArguments("--disable-gpu"); // https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
			options.setPageLoadStrategy(PageLoadStrategy.NONE);// https://www.skptricks.com/2018/08/timed-out-receiving-message-from-renderer-selenium.html

			capabilities.setCapability(ChromeOptions.CAPABILITY, options);

			// Way to manually setup the webdriver-------------------
//				ChromeDriverService service = new ChromeDriverService.Builder()
//						.usingDriverExecutable(new File(chromeExe)).usingAnyFreePort().build();
//				service.start();
			// driver = new RemoteWebDriver(service.getUrl(), capabilities);

			// another way to automatically setup webdriver using Boni Garcia's webdrvier
			// manager---------------------------------------
			driver = WebDriverManager.chromedriver().capabilities(options).create();
		} else if (browserName.equalsIgnoreCase("ie")) {
			String ieExe = "ie driver location";
			System.setProperty("webdriver.internetexplorer.driver", ieExe);
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			// Setting Initial browser URL so that Driver connection is not
			// hung with respect to the browser instance
			capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://www.bing.com/");
			capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
			InternetExplorerDriverService ieservice = new InternetExplorerDriverService.Builder()
					.usingDriverExecutable(new File(ieExe)).usingAnyFreePort().build();
			driver = new InternetExplorerDriver(ieservice, capabilities);
		} else if (browserName.equalsIgnoreCase("safari") && isSafariSupportedPlatform()) {
			driver = new SafariDriver();
		} else if (browserName.equalsIgnoreCase("remote-firefox")) {
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(hubUrl, capability);
		} else if (browserName.equalsIgnoreCase("remote-chrome")) {
			driver = new RemoteWebDriver(hubUrl, DesiredCapabilities.chrome());
		} else if (browserName.equalsIgnoreCase("remote-ie")) {
			DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
			driver = new RemoteWebDriver(hubUrl, capability);
		} else if (browserName.equalsIgnoreCase("remote-safari")) {
			DesiredCapabilities capability = DesiredCapabilities.safari();
			driver = new RemoteWebDriver(hubUrl, capability);
		}

		log.info("WebDriverFactory created an instance of WebDriver for: " + browserName);
		return driver;
	}

	@SuppressWarnings("unused")
	private static DesiredCapabilities getIncognitoDesiredCapabilities() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		return capabilities;
	}

	static boolean isSafariSupportedPlatform() {
		Platform current = Platform.getCurrent();
		return Platform.MAC.is(current) || Platform.WINDOWS.is(current);
	}

	static FirefoxOptions createFirefoxProfile() {
		// FirefoxProfile profile = new FirefoxProfile();

		ProfilesIni profileIni = new ProfilesIni();
		FirefoxProfile profile = profileIni.getProfile("default");
		FirefoxOptions options = new FirefoxOptions();

		profile.setPreference("dom.max_chrome_script_run_time", 60);
		profile.setPreference("setTimeoutInSeconds", 60);
		profile.setPreference("dom.max_script_run_time", 60);
		profile.setPreference("dom.popup_maximum", 0);
		profile.setPreference("privacy.popups.disable_from_plugins", 3);
		profile.setPreference("browser.xul.error_pages.enabled", false);
		profile.setPreference("general.useragent.extra.firefox", "Firefox");
		profile.setAcceptUntrustedCertificates(true);
		options.setProfile(profile);
		return (options);
	}
}