package assertionTopic;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningHardAssert {

	@Test
	public void Script() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals(driver.getTitle(),"Demo Web Shop","user not landed to appln");
		driver.findElement(By.linkText("Register")).click();
		assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com","user not present in register page");
		
		
	}
}
