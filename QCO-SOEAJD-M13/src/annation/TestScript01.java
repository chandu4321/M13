package annation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript01 extends BaseClass{

	@Test
	public void books() throws InterruptedException {
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(3000);
	}
}
