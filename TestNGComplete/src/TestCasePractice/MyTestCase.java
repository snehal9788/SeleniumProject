package TestCasePractice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTestCase 
{
	
@Test
	public void TC_01(){
	//	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhiraj\\Desktop\\ide\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\exe file");
		WebDriver driver=new ChromeDriverManager();
		driver.get("http://www.naukri.com");
		
			
			
	}
}
