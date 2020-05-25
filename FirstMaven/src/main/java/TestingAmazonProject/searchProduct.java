package TestingAmazonProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class searchProduct {
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
	/*@Test(priority=0)
	public void verifyNextPageDisplay() {
		//AmazonHomePage homePage= PageFactory.initElements(driver(), AmazonHomePage.class);
		driver.findElement(By.xpath("//a[@tabindex='27']")).click();
		driver.findElement(By.xpath("//a[text()='Baby Products']")).click();
		String title=driver.getTitle();
		System.out.println("The title of Baby Products is:"+title);
		Assert.assertEquals(title, "Amazon.in Bestsellers: The most popular items in Baby Products", "Page should not found");
	}
	*/
	@Test(priority=1)
	public void verifySearchByProductName() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Television");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title=driver.getTitle();
		System.out.println("The title of Television page is:"+title);
		Assert.assertEquals(title, "Amazon.in : Television", "Page Not Found..");	
	
	}
	
	@Test
	
	
		
	
	@AfterMethod
	public void closeSetUP() {
		driver.quit();
	}

}
