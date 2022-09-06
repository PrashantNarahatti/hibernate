package project_amazon_group_01.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_amazon_group_01.browserSetup.BrowserSetup;
import project_amazon_group_01.handlers.CommonMethods;
import project_amazon_group_01.pages.SigninPage;
import project_amazon_group_01.utils.PropertiesReader;

public class SigninPageTest {
	private WebDriver driver;
	private BrowserSetup browserSetup;
	private PropertiesReader propertiesReader;
	private CommonMethods commonMethods;
	private SigninPage signinPage;

	@BeforeMethod
	public void beforeSetup() {
		browserSetup = new BrowserSetup();
		propertiesReader = new PropertiesReader();
		driver = browserSetup.setBrowser(propertiesReader.getBrowserName());
		signinPage = new SigninPage(driver);
		commonMethods = new CommonMethods();

	}

	@Test
	public void verifyOpenAmazonSigninPage() throws InterruptedException{
		signinPage.openSignin();
		commonMethods.getHardWait();
		System.out.println("Signin page is opened");
		Thread.sleep(1000);
	}

	@Test
	public void verifyAmazonSigninPageWithIncorrectMobileNumber() throws InterruptedException {
		signinPage.openSignin();
		signinPage.openFirstTextResult1();
		signinPage.enterIncorrectMobileNumber("6362762262");
		commonMethods.getHardWait();
		assertEquals(commonMethods.getCurrentURL(driver), "https://www.amazon.in/ap/signin");
		System.out.println("Incorrect mobile number : 6362762262");
		Thread.sleep(1000);

	}

	@Test
	public void verifyAmazonSigninPageWithCorrectMobileNumber() throws InterruptedException {
		signinPage.openSignin();
		signinPage.openFirstTextResult2();
		signinPage.enterCorrectMobileNumber("6362762260");
		commonMethods.getHardWait();
		assertEquals(commonMethods.getCurrentURL(driver), "https://www.amazon.in/ap/signin");
		System.out.println("Correct mobile number : 6362762260");
		Thread.sleep(1000);


	}

	@Test
	public void verifyAmazonSigninPageWithIncorrectPassword() throws InterruptedException {
		signinPage.openSignin();
		signinPage.openFirstTextResult2();
		signinPage.enterCorrectMobileNumber("6362762260");
		signinPage.openSecondTextResult();
		signinPage.enterIncorrectPassword("@Pacchu33");
		commonMethods.getHardWait();
		assertEquals(commonMethods.getCurrentURL(driver), "https://www.amazon.in/ap/signin");
		System.out.println("Incorrect password : @Pacchu33");
		Thread.sleep(1000);


	}

	@Test
	public void verifyAmazonSigninPageWithCorrectPassword() throws InterruptedException {
		signinPage.openSignin();
		signinPage.openFirstTextResult2();
		signinPage.enterCorrectMobileNumber("6362762260");
		signinPage.openSecondTextResult();
		signinPage.enterCorrectPassword("@Pacchu37");
		commonMethods.getHardWait();
		System.out.println("Correct password : @Pacchu37");
		Thread.sleep(1000);


	}

	@Test
	public void verifyAmazonHomePagewithSignin() throws InterruptedException {
		signinPage.openSignin();
		signinPage.openFirstTextResult2();
		signinPage.enterCorrectMobileNumber("6362762260");
		signinPage.openSecondTextResult();
		signinPage.enterCorrectPassword("@Pacchu37");
		signinPage.openHomePagewithSignin();
		commonMethods.getHardWait();
		System.out.println("Open the amazon homepage with sign-in");
		System.out.println("~~~~~~~~~~~~~~~~SIGNIN SUCCESSFULLY~~~~~~~~~~");
		Thread.sleep(10000);

	}

	@AfterMethod
	public void teardown() {
		browserSetup.quitBrowser(driver);
	}
}

