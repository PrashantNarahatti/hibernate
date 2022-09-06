package maven_amazon_signin.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import maven_amazon_signin.browserSetup.BrowserSetup;
import maven_amazon_signin.pages.GoogleSearchPage;
import maven_amazon_signin.pages.SigninPage;
import maven_amazon_signin.utils.PropertiesReader;

public class GoogleSearchTest {

	public static void main(String[] args) {
		PropertiesReader pr = new PropertiesReader();
		BrowserSetup browserSetup = new BrowserSetup();
		String browser = pr.getBrowserName();
		String url = pr.getAppURL();
		WebDriver driver = browserSetup.setBrowser(browser);
		driver.get(url);

		GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

		googleSearchPage.searchInText("Amazon");
		googleSearchPage.openFirstSearchResult();

//		AmazonPage amazonPage = new AmazonPage(driver);
//		amazonPage.openSignin();

		driver.findElement(By.linkText("Sign in")).click();

		SigninPage signinPage = new SigninPage(driver);
		driver.findElement(By.id("ap_email")).sendKeys("6362762260");
		signinPage.openFirstTextResult();
		driver.findElement(By.id("ap_password")).sendKeys("@Pacchu37");
		signinPage.openSecondTextResult();
		
		driver.findElement(By.linkText("continue")).click();
		
		driver.findElement(By.linkText("Sign-in")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("@Pacchu37");
		signinPage.openThirdTextResult();
		driver.findElement(By.linkText("Sign-in")).click();
		


	}
}