package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningCrossBrowserTesting {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void launch(String bname,String url) throws InterruptedException {
		if(bname.contains("chrome")) {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("https://demowebshop.tricentis.com/");
			driver.get(url);
			Thread.sleep(2000);
			driver.quit();
		}
		else if(bname.contains("firefox")) {
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			driver.quit();
		}
	}
}
