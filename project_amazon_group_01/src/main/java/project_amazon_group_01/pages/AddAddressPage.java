package project_amazon_group_01.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_amazon_group_01.handlers.CommonMethods;

public class AddAddressPage {
	CommonMethods commonMethods;
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement addAddresssignInButton;

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement addAddressemailIdOrMobileNorTxtBox;

	@FindBy(xpath = "//input[@id='continue']")
	WebElement countinueButton;

	@FindBy(id = "ap_password")
	WebElement addAdddresspasswordTextBox;

	@FindBy(id = "516172")
	WebElement addAddressPincode;

	@FindBy(xpath = "//img[@alt='boAt bassshead 100 in Ear Wired Earphones with Mic(Black)']")
	WebElement addAddressaddToCart;

	@FindBy(xpath = "//span[@id='glow-ingress-line2']")
	WebElement addAddressButton;

	@FindBy(xpath = "//h2[@class='a-color-tertiary']")
	WebElement addAddressButton1;

	@FindBy(name = "//span[@id='address-ui-widgets-countryCode']//span[@role='button']")
	WebElement region;

	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement fullName;

	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	WebElement mobileNumber;

	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPostalCode']")
	WebElement pincode;

	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")
	WebElement flatAndHouseNoElement;

	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine2']")
	WebElement AreaAndVillageElement;

	@FindBy(xpath = "//input[@id='address-ui-widgets-landmark']")
	WebElement landmark;

	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressCity']")
	WebElement city;

	@FindBy(xpath = "//span[@id='address-ui-widgets-enterAddressStateOrRegion']//span[@role='button']")
	WebElement andhraPradesh;

	public AddAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void openAddAddressSignin() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(addAddresssignInButton);
	}

	public void openAddAddressemailIdOrMobileNorTxtBox() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(addAddressemailIdOrMobileNorTxtBox);
	}

	public void openaddAdddresspasswordTextBox() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(addAdddresspasswordTextBox);
	}

	public void openaddAddressPincode() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(addAddressPincode);
	}

	public void openaddAddressaddToCart() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(addAddressaddToCart);
	}

	public void openAddAddressPage() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(addAddressButton);
	}

	public void openAddAddressPage1() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(addAddressButton1);
	}

	public void openAddAddressregion() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(region);
	}

	public void openAddAddressfullName() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(fullName);

	}

	public void openAddAddressmobileNumber() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(mobileNumber);
	}

	public void openAddAddresspinCode() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(pincode);
	}

	public void openAddAddressflat() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(flatAndHouseNoElement);
	}

	public void openAddAddressAreaandVillage() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(AreaAndVillageElement);
	}

	public void openAddddAddresslandMark() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(landmark);
	}

	public void openAddAddresscity() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(city);
	}

	public void addToCart(String string) {
		// TODO Auto-generated method stub
		
	}

	public void emailIdOrMobileNorTxtBox(String string) {
		// TODO Auto-generated method stub
		
	}

	public void passwordTextBox(String string) {
		// TODO Auto-generated method stub
		
	}

	public void pincode(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addAddressregion(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addAddressmobileNumber(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addAddressflat(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addAddressAreaandVillage(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addAddresslandMark(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addAddresscity(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addAddressstate(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addAddressfullName(String string) {
		// TODO Auto-generated method stub
		
	}

}