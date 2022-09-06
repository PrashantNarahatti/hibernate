package project_amazon_group_01.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_amazon_group_01.handlers.CommonMethods;

public class AmazonCartPage {
	CommonMethods commonMethods;

	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement signInButton;

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement emailIdOrMobileNorTxtBox;

	@FindBy(xpath = "//input[@id='continue']")
	WebElement countinueButton;

	@FindBy(id = "ap_password")
	WebElement passwordTextBox;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signInbox;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchBox;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement searchIcon;

	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement firstSearchResult;

	@FindBy(id = "add-to-cart-button")
	WebElement clickAddToCartBtton;

	@FindBy(id = "buy-now-button")
	WebElement buyNowButton;

	@FindBy(xpath = "//input[@name='submit.delete.C03122a4c-3c0a-4ee2-833c-9f8fb55daef3']")
	WebElement deleteButton;

	@FindBy(xpath = "//span[@id='nav-cart-count']")
	WebElement addCartButton;

	@FindBy(xpath = "//input[@name='submit.save-for-later.C03122a4c-3c0a-4ee2-833c-9f8fb55daef3']")
	WebElement saveForLaterButton;

	@FindBy(xpath = "//input[@name='submit.compare.C03122a4c-3c0a-4ee2-833c-9f8fb55daef3']")
	WebElement seeMoreLikeThisButton;

	// private WebDriver starRating;

	private WebDriver driver;

	public void amazonsearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void searchInText(String searchTextvalue) {
		commonMethods = new CommonMethods();
		commonMethods.enterText(searchBox, searchTextvalue);
		commonMethods.hitEnter(searchBox);
	}

	public void openFirstSearchResult() {
		commonMethods.clickOnElement(firstSearchResult);
	}

	public void addToCartButtonPage() {
		commonMethods.clickOnElement(clickAddToCartBtton);
	}

	public void buyNowbuttonPage() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(buyNowButton);
	}

	public void deleteItem() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(deleteButton);
	}

	public void addCartPage() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(addCartButton);
	}

	public void saveForLaterResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(saveForLaterButton);
	}

	public void seeMoreLikeThisResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(seeMoreLikeThisButton);
	}

	public void signInToAmezonApl() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(signInButton);
		commonMethods.enterText(emailIdOrMobileNorTxtBox, "9423354241");
		commonMethods.clickOnElement(countinueButton);
		commonMethods.enterText(passwordTextBox, "Qwerty");
		commonMethods.clickOnElement(signInbox);
	}
}