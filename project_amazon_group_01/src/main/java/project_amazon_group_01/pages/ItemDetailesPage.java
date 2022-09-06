package project_amazon_group_01.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import project_amazon_group_01.handlers.CommonMethods;

public class ItemDetailesPage {
	CommonMethods 	commonMethods;
	//Sign In to the application
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

	// Search text field of the application
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchBox;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement searchIcon;

	//Search item page...
	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement firstSearchResult;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-star a-star-4-5'])[1]")
	WebElement starRatingOfTheItems;

	@FindBy(id  = "add-to-cart-button")
	WebElement clickAddToCartBtton;

	@FindBy(id = "buy-now-button")
	WebElement buyNowButton;

	@FindBy(xpath = "(//img[@id='landingImage'])[1]")
	WebElement itemImage;

	@FindBy(xpath = "(//p[normalize-space()='$183.99'])[1]")
	WebElement itemColourButton;

	@FindBy(xpath = "(//input[@type='submit'])[14]")
	WebElement imageButton;

	@FindBy(id  = "a-autoid-0-announce")
	WebElement quantityDropdown;


	//private WebDriver starRating;

	private WebDriver driver; 

	public ItemDetailesPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}

	public void searchInText(String searchTextvalue) {
		commonMethods = new CommonMethods();
		commonMethods.enterText(searchBox, searchTextvalue);
		commonMethods.hitEnter(searchBox);
	}

	public void openFirstSearchResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(firstSearchResult);
	}

	public void starRatingOfItemPage() {
		commonMethods = new CommonMethods();
		commonMethods.mouseHoverOnTheElement(starRatingOfTheItems);
		
	}

	public void addToCartButtonPage() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(clickAddToCartBtton);
	}

	public void buyNowbuttonPage() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(buyNowButton);
	}

	public void itemImagePage() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(itemImage);
	}

	public void itemColourChangeResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(itemColourButton);

	}
	public void itemImageResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(imageButton);
	}

	public void quantityDropDown() {
		Select selectOption=new Select(quantityDropdown);
		selectOption.selectByIndex(1);
	}


	public void signInToAmezonApl() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(signInButton);
		commonMethods.enterText(emailIdOrMobileNorTxtBox, "8123687689");
		commonMethods.clickOnElement(countinueButton);
		commonMethods.enterText(passwordTextBox, "112233");
		commonMethods.clickOnElement(signInbox);
	}
	}