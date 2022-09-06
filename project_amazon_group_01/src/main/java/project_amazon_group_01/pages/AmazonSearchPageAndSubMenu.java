package project_amazon_group_01.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_amazon_group_01.handlers.CommonMethods;

public class AmazonSearchPageAndSubMenu {

	CommonMethods commonMethods;
	//searchbox
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement buttonSearch;
	
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement firstSearchResult;
	//submenu
	@FindBy(id="nav_cs_help")
	WebElement subMenuCustomerService;
	
	@FindBy(id="nav_cs_fashion")
	WebElement subMenuFashion;
	
	public AmazonSearchPageAndSubMenu(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	public  void searchInText(String searchTextvalue) {
		commonMethods = new CommonMethods();
		commonMethods.enterText(searchbox, searchTextvalue);
		commonMethods.hitEnter(searchbox);
	}
	
	public void openFirstSearchResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(firstSearchResult);
	}
	public void openSubMenuCS() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(subMenuCustomerService);
	}
	public void openSubMenuF() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(subMenuFashion);
	}
	
}


