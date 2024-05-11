package batchExe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBurger {

	@Test(groups = "food")
	public void burger() {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.burgerking.in/");
		driver.quit();
	}
}
