package maven_amazon_signin.browserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {
	private WebDriver driver = null;
	/**
	 * 
	 * @param browserName
	 * @return
	 */
	public WebDriver setBrowser(String browserName) {
		String bN = browserName.toLowerCase();
		switch (bN) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;
		}
		driver.manage().window().maximize();
		return driver;
	}

	/**
	 * 
	 * @param driver
	 */
	public void quitBrowser(WebDriver driver) {
		driver.quit();
	}

	/**
	 * 
	 * @param driver
	 */
	public void closeBrowserInstance(WebDriver driver) {
		driver.close();
	}

}




