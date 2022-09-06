package project_amazon_group_01.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_amazon_group_01.handlers.CommonMethods;

public class SigninPage {
	CommonMethods commonMethods;

	@FindBy(xpath = "//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']")
	WebElement signinButton;

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement userId1;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement userId2;

	@FindBy(xpath = "//input[@id='continue']")
	WebElement ContinueButton1;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement ContinueButton2;

	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement passwordTextBox1;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement passwordTextBox2;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement sign_inButton;

	public SigninPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void openSignin() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(signinButton);
	}

	public void enterIncorrectMobileNumber(String mobile_number) {
		commonMethods.enterText(userId1, mobile_number);
		commonMethods.hitEnter(userId1);
	}

	public void openFirstTextResult1() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(ContinueButton1);
	}
	public void enterCorrectMobileNumber(String mobile_number) {
		commonMethods.enterText(userId2, mobile_number);
		commonMethods.hitEnter(userId2);
	}

	public void openFirstTextResult2() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(ContinueButton2);
	}

	public void enterIncorrectPassword(String password) {
		commonMethods.enterText(passwordTextBox1, password);
		commonMethods.hitEnter(passwordTextBox1);
	}
	public void enterCorrectPassword(String password) {
		commonMethods.enterText(passwordTextBox2, password);
		commonMethods.hitEnter(passwordTextBox2);
	}

	public void openSecondTextResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(sign_inButton);
	}
	public void openHomePagewithSignin() {
		commonMethods = new CommonMethods();
	}

}
