package maven_amazon_signin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven_amazon_signin.handlers.CommonMethods;

public class AmazonPage {
	CommonMethods commonMethods;

	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	WebElement signinButton;

	public AmazonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void openSignin() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(signinButton);
	}

	public WebElement findElement(By linkText) {
		// TODO Auto-generated method stub
		return null;
	}


}
