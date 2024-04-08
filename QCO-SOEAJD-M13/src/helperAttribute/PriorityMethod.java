package helperAttribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityMethod {

	@Test(priority = -1)
	public void register() {
		Reporter.log("user has register", true);
	}
	
	@Test(priority = 1)
	public void addCart() {
		Reporter.log("user has added a product to cart",true);
	}
	
	@Test(priority = 0)
	public void login() {
		Reporter.log("user has login ", true);
	}
}
