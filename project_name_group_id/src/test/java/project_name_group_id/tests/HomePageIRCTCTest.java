package project_name_group_id.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_name_group_id.browserSetup.BrowserSetup;
import project_name_group_id.handlers.CommonMethods;
import project_name_group_id.pages.HomePageIRCTC;
import project_name_group_id.utils.PropertiesReader;

public class HomePageIRCTCTest {
	private WebDriver driver;
	private BrowserSetup browserSetup;
	private PropertiesReader propertiesReader;
	private HomePageIRCTC homePageIRCTC;
	private CommonMethods commonMethods ;
	
	@BeforeMethod
	public void beforeSetup() {
		browserSetup = new BrowserSetup();
		propertiesReader = new PropertiesReader();
		driver = browserSetup.setBrowser(propertiesReader.getBrowserName());
		homePageIRCTC = new HomePageIRCTC(driver);
		commonMethods = new CommonMethods();
		homePageIRCTC.closePopup();
	}
	
	@Test
	public void verifyTrainSearchSuccessWithMandatoryFileds() {
		homePageIRCTC.enterOrigin("ypr");
		homePageIRCTC.enterDestination("chennai");
		homePageIRCTC.enterJourneyDate();
		homePageIRCTC.clickSearchButton();
		commonMethods.getHardWait();
		assertEquals(commonMethods.getCurrentURL(driver), "https://www.irctc.co.in/nget/booking/train-list");
	}
	
	@Test
	public void verifyTrainSearchSuccessWithAllAvailableFileds() {
		homePageIRCTC.enterMandatoryFields("ypr", "ms");
		homePageIRCTC.selectJourneyQuota();
		homePageIRCTC.clickSearchButton();
		commonMethods.getHardWait();
		commonMethods.getHardWait();
		assertEquals(homePageIRCTC.getJourneyQuotaText(), "LADIES");		
	}
	
	@AfterMethod
	public void teardown() {
		browserSetup.quitBrowser(driver);
	}
}