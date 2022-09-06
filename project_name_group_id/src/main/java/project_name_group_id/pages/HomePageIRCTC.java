package project_name_group_id.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_name_group_id.handlers.CommonMethods;

public class HomePageIRCTC {
private CommonMethods commonMethods;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	WebElement okPopupButton;
	
	@FindBy(xpath = "//*[@id='origin']//input")
	WebElement origin;
	
	@FindBy(xpath = "//*[@id='destination']//input")
	WebElement destination;
	
	@FindBy(xpath = "//*[@id='jDate']//input")
	WebElement journeydate;
	
	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement searchButton;
	
	@FindBy(xpath = "(//*[@id='journeyQuota']//span)[1]")
	WebElement journeyQuota;
	
	@FindBy(xpath = "//span[normalize-space()='LADIES']")
	WebElement ladiesQuota;
	
	public HomePageIRCTC(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void closePopup() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(okPopupButton);
	}
	
	public void enterOrigin(String originName) {
		commonMethods.enterText(origin, originName);
		commonMethods.hitEnter(origin);
	}
	
	public void enterDestination(String destinationName) {
		commonMethods.enterText(destination, destinationName);
		commonMethods.hitEnter(destination);
	} 
	
	public void enterJourneyDate() {
		commonMethods.clearTextBox(journeydate);
		String date = commonMethods.getFutureDate();
		commonMethods.enterText(journeydate, date);
	}
	
	public void clickSearchButton() {
		commonMethods.clickOnElement(searchButton);
	}
	
	public void enterMandatoryFields(String origin , String destination) {
		enterOrigin(origin);
		enterDestination(destination);
		enterJourneyDate();
	}
	
	public void selectJourneyQuota() {
		commonMethods.clickOnElement(journeyQuota);
		commonMethods.clickOnElement(ladiesQuota);
	}
	
	public String getJourneyQuotaText() {
		return journeyQuota.getText();
	}

}

