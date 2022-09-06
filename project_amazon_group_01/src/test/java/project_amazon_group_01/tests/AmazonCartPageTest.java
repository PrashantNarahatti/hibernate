package project_amazon_group_01.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_amazon_group_01.browserSetup.BrowserSetup;
import project_amazon_group_01.handlers.CommonMethods;
import project_amazon_group_01.pages.AmazonCartPage;
import project_amazon_group_01.utils.PropertiesReader;

public class AmazonCartPageTest {
	private WebDriver driver;
	private BrowserSetup browserSetup;
	private PropertiesReader propertiesReader;
	private AmazonCartPage amazonsearch;
	private CommonMethods commonMethods;

	@BeforeMethod
	public void beforeSetup() {
		browserSetup = new BrowserSetup();
		propertiesReader = new PropertiesReader();
		driver = browserSetup.setBrowser(propertiesReader.getBrowserName());
		amazonsearch = new AmazonCartPage();
		amazonsearch.signInToAmezonApl();
		commonMethods = new CommonMethods();

	}

	@Test
	public void verifyItemsDisplayedinCartPageSuccessfully() {
		amazonsearch.searchInText("shoes");
		amazonsearch.openFirstSearchResult();
		amazonsearch.addCartPage();
		commonMethods.getHardWait();
		commonMethods.getHardWait();
		commonMethods.getHardWait();

	}

	@Test
	public void verifyAddToCartButtonPageLoadedSuccessfully() {

		amazonsearch.searchInText("shoes");
		amazonsearch.openFirstSearchResult();
		amazonsearch.addCartPage();
		amazonsearch.addToCartButtonPage();
		commonMethods.getHardWait();
		commonMethods.getHardWait();

	}

	@Test
	public void verifyDeleteTheIteamFromCartpageLoadedSuccessfully() {
		amazonsearch.searchInText("shoes");
		amazonsearch.openFirstSearchResult();
		amazonsearch.addToCartButtonPage();
		amazonsearch.addCartPage();
		amazonsearch.deleteItem();
		commonMethods.getHardWait();
		commonMethods.getHardWait();

	}

	@Test
	public void verifySaveForLaterPageLoadedSuccesfully() {
		amazonsearch.searchInText("shoes");
		amazonsearch.openFirstSearchResult();
		amazonsearch.addToCartButtonPage();
		amazonsearch.addCartPage();
		amazonsearch.saveForLaterResult();
		commonMethods.getHardWait();
		commonMethods.getHardWait();

	}

	@Test
	public void verifySeeMoreLikeThisPageLoadedSuccesfully() {
		amazonsearch.searchInText("shoes");
		amazonsearch.openFirstSearchResult();
		amazonsearch.addToCartButtonPage();
		amazonsearch.addCartPage();
		amazonsearch.seeMoreLikeThisResult();
		commonMethods.getHardWait();
		commonMethods.getHardWait();

	}

	@AfterMethod
	public void teardown() {
		browserSetup.quitBrowser(driver);
	}
}