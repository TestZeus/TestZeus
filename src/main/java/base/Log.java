package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;

public class Log {

	// Reference code from
	// https://howtodoinjava.com/log4j2/log4j2-properties-example/

	private static final Logger LOGGER = LogManager.getLogger(Log.class.getName());

	// Initialize Log4j logs

//		public Log() {
	//
//			PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
//					+ File.separator + "resources" + File.separator + "log4j.properties");

	// This is to print log for the beginning of the test case, as we usually
	// run so many test cases as a test suite

	// Need to create these methods, so that they can be called

	public static void info(String message) {

		LOGGER.info(message);

	}

	public static void warn(String message) {

		LOGGER.warn(message);

	}

	public static void error(String message) {

		LOGGER.error(message);

	}

	public static void fatal(String message) {

		LOGGER.fatal(message);

	}

	public static void debug(String message) {

		LOGGER.debug(message);

	}

	public static void reportLine(String message) {
		LOGGER.info(message);
		Reporter.log(message + " <br/>", true);
	}

}
