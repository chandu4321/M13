package helperAttribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethod {

	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("user has login the appln", true);
	}
	
	@Test
	public void register() {
		Reporter.log("user has register the appln",true);
	}
	
	@Test(dependsOnMethods = "login")
	public void product() {
		Reporter.log("user has selected a product",true);
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
		Reporter.log("user has logout the appln",true);
	}
}

