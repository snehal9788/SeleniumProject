package com.flipkart.keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import com.flipkart.constants.constant;
import com.flipkart.cutomUtils.customUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyword extends constant {
	public static void launchBrowser(String browserName) {
		switch (browserName) {
		case "CHROME":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "HTML UNIT":
			driver = new HtmlUnitDriver();
		default:
			System.out.println("Unable to open browser,please select from 'CHROME','FIREFOX','IE','HTML UNIT'");
			break;
		}
	}

	public static void openUrl(String url) {
		driver.get(url);
		System.out.println("Url open Successfully....");
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}
   //////////////  public static void closePopup() {
       	 driver.switchTo().window("");
    	 
	}
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public static void clickOn(String locatorName) {
		getWebElement(locatorName).click();
	}
	
	public static void enterText(String locatorName,String text) {
		getWebElement(locatorName).sendKeys(text);
	}

	public static void mouseHoverClick(String locatorName) {
		action=new Actions(driver);
		action.moveToElement(getWebElement(locatorName)).click().build().perform();
	}
	
	public static void impliciteWait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}
	
	public static void explicitWait(int duration) {
		wait=new FluentWait(driver);
		wait.withTimeout(duration, TimeUnit.SECONDS);
	}
  public static String getText(String locatorName) {
	return getWebElement(locatorName).getText();
	

}
	public static void closeBrowser() {
		driver.close();
	}

	public static WebElement getWebElement(String locatorName) {
		String locatorType=customUtil.getLocatorValue(locatorName)[0];
		String locatorValue=customUtil.getLocatorValue(locatorName)[1];
		switch (locatorType) {
		case "XPATH":
			element=driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			element=driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":
			element=driver.findElement(By.id(locatorValue));
			break;
		case "LINKTEXT":
			element=driver.findElement(By.linkText(locatorType));
			break;
		default:
			System.out.println("Invalid locator found");
			break;
		}
		return element;
		
	}
}
