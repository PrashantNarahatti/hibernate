package project_amazon_group_01.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import project_amazon_group_01.browserSetup.BrowserSetup;
import project_amazon_group_01.pages.AmazonSearchPageAndSubMenu;
import project_amazon_group_01.utils.PropertiesReader;

public class AmazonSearchPageAndSubMenuTest {
	private WebDriver driver;
	private BrowserSetup browserSetup;
	private PropertiesReader propertiesReader;
	

    @BeforeMethod
	public void beforesetup() {
    	browserSetup = new BrowserSetup();
		propertiesReader  = new PropertiesReader();
		driver=browserSetup.setBrowser(propertiesReader.getBrowserName());
		
    }
		
    @Test
	public void testSearch() {
    	AmazonSearchPageAndSubMenu amazonSearchPageSubMenu = new AmazonSearchPageAndSubMenu(driver);
    	amazonSearchPageSubMenu.searchInText("iphone");
    	amazonSearchPageSubMenu.openFirstSearchResult();
    }
    
    
    @Test
	public void testSearch1() {
    	AmazonSearchPageAndSubMenu amazonSearchPageSubMenu = new AmazonSearchPageAndSubMenu(driver);
    	amazonSearchPageSubMenu.searchInText("cloths");
    	amazonSearchPageSubMenu.openFirstSearchResult();	
    }
   
    @Test
	public void verifySearrchwithinvalidText() {
    	AmazonSearchPageAndSubMenu amazonSearchPageSubMenu = new AmazonSearchPageAndSubMenu(driver);
    	amazonSearchPageSubMenu.searchInText("*******");
    	amazonSearchPageSubMenu.openFirstSearchResult();
    }
    
    @Test
	public void customerServiceSubMenu() {
    	AmazonSearchPageAndSubMenu amazonSearchPageSubMenu = new AmazonSearchPageAndSubMenu(driver);
    	amazonSearchPageSubMenu.openSubMenuCS();
    	amazonSearchPageSubMenu.openFirstSearchResult();
    }
    
    @Test
	public void fashionSubMenu() {
    	AmazonSearchPageAndSubMenu amazonSearchPageSubMneu = new AmazonSearchPageAndSubMenu(driver);
    	amazonSearchPageSubMneu.openSubMenuF();
    	amazonSearchPageSubMneu.openFirstSearchResult();
    }

    @AfterMethod
    public void teardown() {
	    browserSetup.quitBrowser(driver);

    }

    

}