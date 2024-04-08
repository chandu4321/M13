package annation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public void connDb() {
		Reporter.log("conneced to DataBase",true);
	}
	
	@BeforeTest
	public void preConn() {
		Reporter.log("Preconn of the appln",true);
	}
	
	@BeforeClass
	public void launch() {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Browser is launched",true);
	}
	
	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("enter email & password",true);
		driver.findElement(By.id("Email")).sendKeys("bangalore541@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("bangalore123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	
	@AfterMethod
	public void logout() {
		Reporter.log("user has logout the appln",true);
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass 
	public void quit() {
		Reporter.log("browser is closed",true);
		driver.quit();
	}
	
	@AfterTest
	public void postCon() {
		Reporter.log("Postconn of the appln",true);
	}
	
	@AfterSuite
	public void closeDB() {
		Reporter.log("DataBase conn is closed",true);
	}
}
