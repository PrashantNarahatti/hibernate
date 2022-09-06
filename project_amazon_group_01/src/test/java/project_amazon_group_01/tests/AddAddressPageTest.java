package project_amazon_group_01.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_amazon_group_01.browserSetup.BrowserSetup;
import project_amazon_group_01.handlers.CommonMethods;
import project_amazon_group_01.pages.AddAddressPage;
import project_amazon_group_01.utils.PropertiesReader;

public class AddAddressPageTest {
	private WebDriver driver;
	private BrowserSetup browserSetup;
	private PropertiesReader propertiesReader;
	private AddAddressPage addAddressPage;
	private AddAddressPage addAAdressSigninPage;
	private AddAddressPage addAddress;
	private CommonMethods commonMethods;
	private By sign_inButton;
	
		
	@BeforeMethod
 public void beforeSetup() {
		browserSetup=new BrowserSetup();
		 propertiesReader = new PropertiesReader();
		 driver=browserSetup.setBrowser(propertiesReader.getBrowserName());
		 addAddressPage=new AddAddressPage(driver);
		 commonMethods=new CommonMethods();
	}
	

	  @Test
	public void openAddAddressSignin() {
	  addAddressPage.openAddAddressPage();
	  commonMethods.getHardWait();
	System.out.println("Signin page is opened");
	  }
	 

		@Test
		public void enteremailIdOrMobileNorTxtBox()  throws InterruptedException {
			addAddressPage.openAddAddressemailIdOrMobileNorTxtBox();
			addAddressPage.emailIdOrMobileNorTxtBox("mouni@gmail.com");
			commonMethods.getHardWait();
			System.out.println("emailIdOrMobileNorTxtBox");
			Thread.sleep(2000);
			
		}
		@Test
		
		public void enterpasswordTextBox()  throws InterruptedException {
			addAddressPage.openaddAdddresspasswordTextBox();
			addAddressPage.passwordTextBox("mouni");
			commonMethods.getHardWait();
			System.out.println("PasswordTextBox");
			Thread.sleep(8000);
		}
		
		@Test
		
		public void AddAdrespincode()  throws InterruptedException {
			addAddressPage.openAddAddresspinCode();
			addAddressPage.pincode("516172");
			commonMethods.getHardWait();
			System.out.println("Pincode");
			Thread.sleep(8000);
		}
		@Test
		public void AddAdresaddToCart()  throws InterruptedException {
			addAddressPage.openaddAddressaddToCart();
			addAddressPage.addToCart("earphones");
			commonMethods.getHardWait();
			System.out.println("earphones");
			Thread.sleep(8000);
		}
			
		
		
		
	@Test
	public void openAddAddressPage() {
		addAddressPage.openAddAddressPage();
		commonMethods.getHardWait();

		
		}
	@Test
	public void openAddAddressPage1() {
		//addAddressPage.openAddAddressPage();
		 addAddressPage.openAddAddressPage1();
		commonMethods.getHardWait();
		
		}
	
	@Test
	public void enterregion() {
		addAddress.addAddressregion("India");
		
	}

	
	@Test
	public void enterAddAddressfullName() {
		addAddress=new AddAddressPage(driver);
		addAddress.addAddressfullName("Monu");
	
     commonMethods.getHardWait();
	}
	
	
	@Test
	public void enterAddAddressMobilenumber() {
		addAddress=new AddAddressPage(driver);
		addAddress.addAddressmobileNumber("9492774078");
        commonMethods.getHardWait();
	}
	

	@Test
	public void enterAddAddressflat() {
		addAddress=new AddAddressPage(driver);
		addAddress.addAddressflat("abcd");
        commonMethods.getHardWait();
	}
	

	@Test
	public void enterAddAddressAreaandVillage() {
		addAddress=new AddAddressPage(driver);
		addAddress.addAddressAreaandVillage("kadapa");
        commonMethods.getHardWait();
	}
	
	
	@Test
	public void enterAddAddresslandMark() {
		addAddress=new AddAddressPage(driver);
		addAddress.addAddresslandMark("Temple");
        commonMethods.getHardWait();
	}
	
	@Test
	public void enterAddAddresscity() {
		addAddress=new AddAddressPage(driver);
		addAddress.addAddresscity("Bngl");
        commonMethods.getHardWait();
	}
	
	
	@Test
	public void enterAddAddressstate() {
		addAddress=new AddAddressPage(driver);
		addAddress.addAddressstate("Ap");
        commonMethods.getHardWait();
	}

	@AfterMethod
	public void teardown() {
		browserSetup.quitBrowser(driver);
	}
}
