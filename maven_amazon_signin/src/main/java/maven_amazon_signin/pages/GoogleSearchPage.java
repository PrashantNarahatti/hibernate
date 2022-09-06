package maven_amazon_signin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven_amazon_signin.handlers.CommonMethods;



public class GoogleSearchPage {
CommonMethods commonMethods;
	
	@FindBy(name = "q")
	WebElement searchbox;
	
	@FindBy(xpath = "(//*[@id='rso']//div[1]//a[1])[1]")
	WebElement firstSearchResult;
	
	@FindBy (xpath = "//div[@aria-label='Search by voice']//*[name()='svg']")
	WebElement searchByVoice;
	
	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	public void searchInText(String searchTextvalue) {
		commonMethods = new CommonMethods();
		commonMethods.enterText(searchbox, searchTextvalue);
		commonMethods.hitEnter(searchbox);
	}
	
	public void openFirstSearchResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(firstSearchResult);
	}
}

