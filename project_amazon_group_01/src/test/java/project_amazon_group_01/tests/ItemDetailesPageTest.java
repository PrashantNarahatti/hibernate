package project_amazon_group_01.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_amazon_group_01.browserSetup.BrowserSetup;
import project_amazon_group_01.handlers.CommonMethods;
import project_amazon_group_01.pages.ItemDetailesPage;
import project_amazon_group_01.utils.PropertiesReader;

public class ItemDetailesPageTest {
	private WebDriver driver;
	private BrowserSetup browserSetup;
	private PropertiesReader propertiesReader;
	private ItemDetailesPage itemDetailes;
	private CommonMethods commonMethods;
	
	@BeforeMethod
	public void beforeSetup() {
		browserSetup = new BrowserSetup();
		propertiesReader = new PropertiesReader();
		driver = browserSetup.setBrowser(propertiesReader.getBrowserName());
		//itemDetailes.signInToAmezonApl();
		
	}

	@Test
	public void verifyaddToCartButtonPageLoadedSuccessfully() {
		itemDetailes = new ItemDetailesPage(driver);
		itemDetailes.searchInText("redmi");
		itemDetailes.openFirstSearchResult();
		itemDetailes.addToCartButtonPage();
		
	}
	
	@Test
	public void verifyBuynowPageLoadedSuccessfully() {
		itemDetailes = new ItemDetailesPage(driver);
		itemDetailes.searchInText("redmi");
		itemDetailes.openFirstSearchResult();
		itemDetailes.buyNowbuttonPage();
	}
	
	@Test
	public void verifyItemImageDisplaySuccessfully() {
		itemDetailes = new ItemDetailesPage(driver);
		itemDetailes.searchInText("redmi");
		itemDetailes.openFirstSearchResult();
		itemDetailes.itemImagePage();
	}
	
	@Test
	public void verifyChangeItemColourIsDisplaySuccessfully() {
		itemDetailes = new ItemDetailesPage(driver);
		itemDetailes.searchInText("redmi");
		itemDetailes.openFirstSearchResult();
		itemDetailes.itemColourChangeResult();
	}
	
	@Test
	public void verifyChangeItemImageIsDisplaySuccessfully() {
		itemDetailes = new ItemDetailesPage(driver);
		itemDetailes.searchInText("redmi");
		itemDetailes.openFirstSearchResult();
		itemDetailes.itemImageResult();
	}
	
	@Test
	public void verifyItemQuantityIsDisplaySuccessfully() {
		itemDetailes = new ItemDetailesPage(driver);
		itemDetailes.searchInText("redmi");
		itemDetailes.openFirstSearchResult();
		itemDetailes.quantityDropDown();
	}
	
	@Test
	public void verifyItemStarRatingIsDisplaySuccessfully() {
		itemDetailes = new ItemDetailesPage(driver);
		itemDetailes.searchInText("redmi");
		itemDetailes.openFirstSearchResult();
		itemDetailes.starRatingOfItemPage();
	}
	
	@AfterMethod
	public void teardown() {
		browserSetup.quitBrowser(driver);
	}
}
