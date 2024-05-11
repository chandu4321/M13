package listener;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_01 extends BaseClass{

	@Test
	public void demo() throws InterruptedException {
	//	Reporter.log("Test Case",true);
		driver.findElement(By.partialLinkText("read")).click();
		Thread.sleep(3000);
	}
}
