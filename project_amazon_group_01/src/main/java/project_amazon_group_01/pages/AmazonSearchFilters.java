package project_amazon_group_01.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_amazon_group_01.handlers.CommonMethods;

public class AmazonSearchFilters {
CommonMethods commonMethods;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchBox;
	
	@FindBy(xpath = "//a[@title='Blue']//div[@class='colorsprite aok-float-left']")
	WebElement colorFilter;
	
	@FindBy(xpath= "//span[@class='a-size-base a-color-base'][normalize-space()='Motorola']")
	WebElement brandFilter;
	
	@FindBy(xpath = "//li[@aria-label='Lenovo']//span[contains(text(),'Lenovo')]")
	WebElement laptopBrand;
	
	@FindBy(xpath = "//li[@aria-label='Windows 11 Home']//span[contains(text(),'Windows 11 Home')]")
	WebElement laptopOs;
	
	
	@FindBy(xpath = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	WebElement ratings;
	
	@FindBy(xpath = "//span[contains(text(),'Under $500')]\r\n"+ "")
	WebElement price;
	
	@FindBy(xpath = "//span[contains(text(),'64 GB')]")
	WebElement internalStorage;
	@FindBy(xpath = "//span[@class='a-size-base a-color-base'][normalize-space()='Clothes Washing Machines']\r\n"+ "")
	WebElement department;
	@FindBy(xpath = "//span[@class='a-size-base a-color-base'][normalize-space()='Top Load']")
	WebElement loadingType;
	
	public AmazonSearchFilters(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}
	public void enterSearch(String searchText) {
		commonMethods = new CommonMethods();
		commonMethods.enterText(searchBox,searchText );
		commonMethods.hitEnter(searchBox);
		
		
	}
	public void selectColor() {
		commonMethods.clickOnElement(colorFilter);
	}
	
	public void selectBrand() {
		commonMethods.clickOnElement(brandFilter);
	}
	
	public void selectBrandAndOs() {
	   commonMethods.clickOnElement(laptopBrand);
	   commonMethods.clickOnElement(laptopOs);
   }
    
   public void selectRatingsAndPriceFilters() {
	   commonMethods.clickOnElement(ratings);
	   
	   commonMethods.clickOnElement(price);
   }
   
   public void selectColorAndInternalStorage() {
	   commonMethods.clickOnElement(colorFilter);
	   commonMethods.clickOnElement(internalStorage);
   }
   
   public void selectLoadingTypeAndDept() {
	   commonMethods.clickOnElement(department);
	   commonMethods.clickOnElement(loadingType);
   }
}

