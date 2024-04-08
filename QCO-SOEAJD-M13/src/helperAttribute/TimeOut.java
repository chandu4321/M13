package helperAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TimeOut {

	@Test(timeOut = 20000)
	public void launch() {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
	}
}
