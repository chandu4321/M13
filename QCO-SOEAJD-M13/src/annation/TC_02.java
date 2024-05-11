package annation;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_02 {

	@Test
	public void demo() throws IOException {
		WebDriver driver= new ChromeDriver();
		UtilityMethod um= new UtilityMethod();
	//	driver.get("https://demowebshop.tricentis.com/");
	//	driver.get(um.getDataFromPropertyFile("email"));
	//	driver.get(um.getDataFromPropertyFile("url"));
		
		driver.get(um.getDataFromExcelFile("Sheet", 4, 2));
		HomePagaPomRepo hp= new HomePagaPomRepo(driver);
		hp.getBookButton().click();
	}
}
