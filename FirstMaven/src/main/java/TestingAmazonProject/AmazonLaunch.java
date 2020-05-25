package TestingAmazonProject;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonLaunch {
	WebDriver driver;//scope is Globally defined,we write class level bcoz we are use this driver for each test case

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhiraj\\Desktop\\ide\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\exe file\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.amazon.in");
			}
	
	@Test(priority=0)
	public void verifyAmazonPageTitle() {
		String title=driver.getTitle();
		System.out.println("The Amazon page title is:"+title);
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test(priority=1)
	public void verifyAmazonLogo() {
		boolean flag=driver.findElement(By.xpath("//a[@class='nav-logo-link']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void verifySearchBar() {
		boolean flag=driver.findElement(By.xpath("//form[@action=\"/s/ref=nb_sb_noss\"]")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void displayDropDownList() {
		boolean aaa=driver.findElement(By.xpath("//select[@class=\"nav-search-dropdown searchSelect\"]")).isSelected();;
		Assert.assertTrue(aaa);
	}
	
	@AfterMethod
	public void closeSetUP() {
		driver.quit();
	}
	
	
}
