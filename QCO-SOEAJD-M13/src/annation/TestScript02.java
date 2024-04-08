package annation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript02 extends BaseClass{

	@Test
	public void computer() throws InterruptedException {
		driver.findElement(By.partialLinkText("Computers")).click();
		Thread.sleep(3000);
	}
	
}
