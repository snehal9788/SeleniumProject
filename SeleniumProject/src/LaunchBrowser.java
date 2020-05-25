import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver", "http://facebook.com");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.testingshastra.com/");
	
}
}
//  WebDriverWait wait = new WebDriverWait(driver,2);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Pantry")));
//wait=new WebDriverWait(driver,2);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-cart-count")));
//wait=new WebDriverWait(driver,2);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sc-active-cart")));