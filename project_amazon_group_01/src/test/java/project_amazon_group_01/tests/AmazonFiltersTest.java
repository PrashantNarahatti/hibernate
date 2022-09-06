package project_amazon_group_01.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_amazon_group_01.browserSetup.BrowserSetup;
import project_amazon_group_01.handlers.CommonMethods;
import project_amazon_group_01.pages.AmazonSearchFilters;
import project_amazon_group_01.utils.PropertiesReader;

public class AmazonFiltersTest {
	private WebDriver driver;
	private BrowserSetup browserSetup;
	private PropertiesReader propertiesReader;
	private AmazonSearchFilters amazonSearchfilters;
	private CommonMethods commonMethods ;
	
	@BeforeMethod
	public void beforeSetup() {
		browserSetup = new BrowserSetup();
		propertiesReader = new PropertiesReader();
		driver = browserSetup.setBrowser(propertiesReader.getBrowserName());
		amazonSearchfilters = new AmazonSearchFilters(driver);
		commonMethods = new CommonMethods();
		
	}
	
	@Test
	public void verifySearchWithColorFilter() {
		amazonSearchfilters.enterSearch("iphone 13");
		amazonSearchfilters.selectColor();
	
	}
	@Test
	public void verifySearchWithBrandFilter() {
		amazonSearchfilters.enterSearch("phones");
		amazonSearchfilters.selectBrand();
	
	}
	@Test
	public void verifyBrandAndOsFilters() {
		amazonSearchfilters.enterSearch("laptops");
		amazonSearchfilters.selectBrandAndOs();
	}
	@Test
	public void verifyRatingsAndPriceFilters() {
		amazonSearchfilters.enterSearch("laptops");
		amazonSearchfilters.selectRatingsAndPriceFilters();
	}
	@Test
	public void verifyColorAndInternalStorageFilters() {
		amazonSearchfilters.enterSearch("iphone 13");
		amazonSearchfilters.selectColorAndInternalStorage();
	}
	
	@Test
	public void verifyWashingMachineLoadingTypeAndDept() {
		amazonSearchfilters.enterSearch("washing machine");
		amazonSearchfilters.selectLoadingTypeAndDept();
	}
	
	
	
	@AfterMethod
	public void teardown() {
		browserSetup.quitBrowser(driver);
	}
}