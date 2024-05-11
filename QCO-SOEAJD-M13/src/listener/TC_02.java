package listener;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_02 extends BaseClass{

	@Test
	public void register() throws InterruptedException {
		driver.findElement(By.linkText("Reg")).click();
		Thread.sleep(2000);
	}
}
