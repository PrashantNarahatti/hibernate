package maven_amazon_signin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven_amazon_signin.handlers.CommonMethods;

public class SigninPage {

	CommonMethods commonMethods;
	
	@FindBy(name = "q")
	WebElement textbox;
	
	
	@FindBy(xpath = "(//input[@id='ap_email']")
	WebElement firstSearchResult;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement ContinueButton;
	
	
	@FindBy(xpath = "(//input[@id='ap_password']")
	WebElement secondSearchResult;
	

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement sign_inButton;
	
	@FindBy(xpath = "(//input[@id='ap_password']")
	WebElement thirdSearchResult;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement sign_inButton1;
	
	
	public SigninPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	public void enterElement1(String mobile_nomber) {
		commonMethods = new CommonMethods();
		commonMethods.enterText(textbox, mobile_nomber);
		commonMethods.hitEnter(textbox);
	}
	
	public void openFirstTextResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(ContinueButton);
	}
	
	public void enterElement2(String password) {
		commonMethods = new CommonMethods();
		commonMethods.enterText(textbox, password);
		commonMethods.hitEnter(textbox);
	}

	public void openSecondTextResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(sign_inButton);
	}
	public void enterElement3(String password) {
		commonMethods = new CommonMethods();
		commonMethods.enterText(textbox, password);
		commonMethods.hitEnter(textbox);
	}

	public void openThirdTextResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(sign_inButton1);
	}
	

	public static WebElement findElement(By linkText) {
		return null;
	}

}

