package project_amazon_group_01.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_amazon_group_01.handlers.CommonMethods;

public class RegistrationPage {
	CommonMethods commonMethods;

	@FindBy(xpath = "//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']")
	WebElement signinButton;
	
	@FindBy(xpath = "//a[@id='createAccountSubmit']")
	WebElement Create_your_Amazon_account;
	
	@FindBy(xpath = "//input[@id='ap_customer_name']")
	WebElement firstAndLastName;
	
	@FindBy(xpath = "//input[@id='ap_phone_number']")
	WebElement mobileNumber;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement maileId;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement ContinueButton;
	

	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement password;
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void openSignin() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(signinButton);
	}

	public void openCreateAccout () {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(Create_your_Amazon_account);
	}
	public void enterYourName(String fullName) {
		commonMethods.enterText(firstAndLastName, fullName);
		commonMethods.hitEnter(firstAndLastName);
	}
	public void enterMobileNumber(String mobilenumber) {
		commonMethods.enterText(mobileNumber, mobilenumber);
		commonMethods.hitEnter(mobileNumber);
	}
	public void enterEmailId(String email) {
		commonMethods.enterText(maileId, email);
		commonMethods.hitEnter(maileId);
	}
	public void enterPassword(String passwd) {
		commonMethods.enterText(password, passwd);
		commonMethods.hitEnter(password);
	}

	public void clickOnContinueButton() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(ContinueButton);
	}


}
