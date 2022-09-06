package maven_intro.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import maven_intro.browserSetup.BrowserSetup;
import maven_intro.pages.GoogleSearchPage;
import maven_intro.pages.SeleniumPage;
import maven_intro.utils.PropertiesReader;

public class GSearchTest {
	private BrowserSetup browserSetup;
	private WebDriver driver;
	
	@BeforeTest
	public void bt() {
		System.out.println("B T");
		
	}

	@BeforeMethod
	public void setup() {
		PropertiesReader pr = new PropertiesReader();
		BrowserSetup browserSetup = new BrowserSetup();
		String browser = pr.getBrowserName();
		String url = pr.getAppURL();
		WebDriver driver = browserSetup.setBrowser(browser);
		driver.get(url);
	}

	@Test
	public void testSearch() {
		PropertiesReader pr = new PropertiesReader();
		BrowserSetup browserSetup = new BrowserSetup();
		String browser = pr.getBrowserName();
		String url = pr.getAppURL();
		WebDriver driver = browserSetup.setBrowser(browser);
		driver.get(url);

		GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

		googleSearchPage.searchInText("Selenium");
		googleSearchPage.openFirstSearchResult();

		SeleniumPage seleniumPage = new SeleniumPage(driver);
		seleniumPage.openDownloads();

	}

	@Test
	public void testSearch1() {
		System.out.println("testSearch1");
	}

	@Test
	public void testSearch2() {
		System.out.println("testSearch2");
	}

	@AfterMethod
	public void teardown() {
		browserSetup.quitBrowser(driver);
	}
  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }
  
  
}
