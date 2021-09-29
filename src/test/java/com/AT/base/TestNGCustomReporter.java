package com.AT.base;

import org.testng.Reporter;

public class TestNGCustomReporter extends Reporter {

	public static void logln(String str) {
		log("\n" + str);
	}

	public static void logbr(String str) {
		System.out.println(str);

		log("<br>" + str);
	}
}
