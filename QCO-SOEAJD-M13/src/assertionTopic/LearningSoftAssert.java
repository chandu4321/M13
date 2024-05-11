package assertionTopic;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert {

	@Test
	public void Script() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		SoftAssert sa= new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		sa.assertEquals(driver.getTitle(),"Demo Shop","user not landed to appln");
		driver.findElement(By.linkText("Register")).click();
		sa.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com","user not present in register page");
		WebElement radioButton = driver.findElement(By.id("gender-female"));
		radioButton.click();
		sa.assertTrue(radioButton.isSelected(), "not clicked on female button");
		WebElement name = driver.findElement(By.id("FirstName"));
		name.sendKeys("chandana");
		sa.assertEquals(name.getAttribute("value"), "chandana","firstname is not matching");
		sa.assertAll();
	}
}