package annation;

import org.testng.annotations.Test;

public class TC_01 extends BaseClass{

	@Test
	public void script() throws InterruptedException {
		HomePagaPomRepo hp= new HomePagaPomRepo(driver);
		hp.getBookButton().click();
		Thread.sleep(2000);
		//hp.getBookButton().click();
		
	}
}
