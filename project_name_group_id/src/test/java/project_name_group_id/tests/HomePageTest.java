package project_name_group_id.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_name_group_id.browserSetup.BrowserSetup;
import project_name_group_id.pages.HomePage;
import project_name_group_id.utils.PropertiesReader;

public class HomePageTest {
	private WebDriver driver;
	private BrowserSetup browserSetup;
	private PropertiesReader propertiesReader;
	private HomePage homePage;

	@BeforeMethod
	public void beforeSetup() {
		browserSetup = new BrowserSetup();
		propertiesReader = new PropertiesReader();
		driver = browserSetup.setBrowser(propertiesReader.getBrowserName());
	}

	@Test
	public void verifyHomePageLoadedSuccessfully() {
		homePage = new HomePage(driver);
		homePage.closeLoginPopup();
	}

	@AfterMethod
	public void teardown() {
		browserSetup.quitBrowser(driver);
	}
}