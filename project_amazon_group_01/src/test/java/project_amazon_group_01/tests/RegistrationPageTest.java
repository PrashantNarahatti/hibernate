package project_amazon_group_01.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_amazon_group_01.browserSetup.BrowserSetup;
import project_amazon_group_01.handlers.CommonMethods;
import project_amazon_group_01.pages.RegistrationPage;
import project_amazon_group_01.utils.PropertiesReader;

public class RegistrationPageTest {
	private WebDriver driver;
	private BrowserSetup browserSetup;
	private PropertiesReader propertiesReader;
	private CommonMethods commonMethods;
	private RegistrationPage registrationPage;

	@BeforeMethod
	public void beforeSetup() {
		browserSetup = new BrowserSetup();
		propertiesReader = new PropertiesReader();
		driver = browserSetup.setBrowser(propertiesReader.getBrowserName());
		registrationPage = new RegistrationPage(driver);
		commonMethods = new CommonMethods();

	}
	@Test
	public void verifyOpenAmazonSigninPage() {
		registrationPage.openSignin();
		commonMethods.getHardWait();
		
		
	}
	@Test
	public void verifyOpenAmazonRegistrationPage() {
		registrationPage.openCreateAccout();
		commonMethods.getHardWait();
		
	}
	@Test
	public void verifyCreateAccoutWithAmazonRegistration() {
		registrationPage.openSignin();
		registrationPage.openCreateAccout();
		registrationPage.enterYourName("Ganesh Gunturu");
		registrationPage.enterMobileNumber("7032321889");
		registrationPage.enterEmailId("ganeshgunturu3247@gmail.com");
		registrationPage.enterPassword("Ganesh32");
		registrationPage.clickOnContinueButton();
		commonMethods.getHardWait();
		
	}
	 @Test
	   public void verifyCreateAccountWithAmazonRegistratio() {
		   registrationPage.openSignin();
		   registrationPage.openCreateAccout();
		   registrationPage.enterYourName("Praveen Kumar");
		   registrationPage.enterMobileNumber("8142851697");
		   registrationPage.enterEmailId("praveen.nallamuri32@gmail.com");
		   registrationPage.enterPassword("Praveen54");
		   registrationPage.clickOnContinueButton();
		   commonMethods.getHardWait();
	 }

	@AfterMethod
	public void teardown() {
		browserSetup.quitBrowser(driver);
	}

}
