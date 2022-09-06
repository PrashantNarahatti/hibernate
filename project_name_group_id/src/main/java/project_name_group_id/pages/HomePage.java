package project_name_group_id.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_name_group_id.handlers.CommonMethods;

public class HomePage {

	CommonMethods commonMethods ;

	@FindBy(xpath = "//button[contains(text(),'✕')]")
	WebElement closeLoginPopup;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void closeLoginPopup() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(closeLoginPopup);
		
	}
}


