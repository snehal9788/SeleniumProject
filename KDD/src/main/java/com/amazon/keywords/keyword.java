package com.amazon.keywords;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.amazon.constants.constant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyword extends constant {
	public static void launchBrowser(String browserName) {
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "HTML unit":
			driver = new HtmlUnitDriver();
			break;
		default:
			System.out.println("Unable to open browser");
			break;
		}

	}
/**
 * For Launch URL 
 */
	public static void launchURL(String url) {
		driver.get(url);
		System.out.println("URL open Successfully...");
	}
/**
 * For Maximize Windows
 */
	public static void maximize() {
		driver.manage().window().maximize();
	}
/**
 * For delete all coockies
 */
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
/**
 * for get webElement
 */
	public static WebElement getWebElement() {
		// TODO Auto-generated method stub

	}
}
