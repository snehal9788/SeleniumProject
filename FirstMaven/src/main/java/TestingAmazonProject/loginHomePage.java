package TestingAmazonProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginHomePage {
	private static final String ExceptionConditions = null;
	WebDriver driver;
	
	
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
	public void signInButton() {
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2']")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		String title=driver.getTitle();
		System.out.println("title:"+title);
		if(title.contains("Sign In")) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		}
		Assert.assertEquals(title, "Amazon.in Shopping Cart");
	}
	
/*	 public void login(String email,String password) {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
	 // login Button
		String input;
		String button;
		Object WebElement continue = driver.findElement(By.xpath("//input[@class="a-button-input"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click()", continue);
		
		}
	*/

	@Test(priority=1)
	public void verifySuccefullylogIn() {
		//driver.findElement(By.xpath("//a[@class='nav-line-2']")).click();

		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		//driver.findElement(By.xpath("//a[@class='nav-action-button']")).click();

		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("lochana.9788@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
	}

	/*@Test(priority=2)
	public void addToCart()throws InterruptedException {
     driver.findElement(By.xpath("//a[@tabindex='28']")).click();
    // Assert.assertTrue(driver.getTitle().equals("Amazon Pantry: The Online Grocery Shopping Store- Shop Daily Grocery Items and Get delivered in Next Day- Amazon.in"));
	driver.findElement(By.xpath("//a[@tabindex='39']")).click();
	driver.findElement(By.xpath("//span[@id='a-autoid-2-announce']")).click();
	 driver.findElement(By.id("nav-cart-count")).click();
   
	}*/

	
	
	@AfterMethod
	public void closeSetUP() {
		driver.quit();
	}
	
}
