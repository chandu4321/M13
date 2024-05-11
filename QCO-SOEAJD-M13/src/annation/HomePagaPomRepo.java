package annation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagaPomRepo {

	public HomePagaPomRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "small-searchterms")
	private WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}
	
	@FindBy(partialLinkText = "Books")
	private WebElement bookButton;

	public WebElement getBookButton() {
		return bookButton;
	}
	
	@FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
	private WebElement welcomeText;

	public WebElement getWelcomeText() {
		return welcomeText;
	}
	
	
	
	
}
