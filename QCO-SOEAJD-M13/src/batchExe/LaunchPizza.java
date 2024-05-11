package batchExe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchPizza {

	@Test(groups = "food")
	public void pizza() {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://pizzaonline.dominos.co.in/");
		driver.quit();
	}
}
