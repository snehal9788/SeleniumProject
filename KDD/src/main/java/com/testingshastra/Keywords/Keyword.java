package com.testingshastra.Keywords;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	private static Logger log - Logger
	private static WebDriver driver;

	public static void openBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new chromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new firefor();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "HtmlUnit":
			driver = new HtmlUnitDriver();
			break;
		default:
			break;
		}
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void searchProduct(String productName) {
		
	}
}
