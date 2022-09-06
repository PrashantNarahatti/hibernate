package project_amazon_group_01.browserSetup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import project_amazon_group_01.utils.PropertiesReader;

public class BrowserSetup {
	private WebDriver driver ;

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
		//maximize window
				driver.manage().window().maximize();
				//implicit wait
				PropertiesReader pr = new PropertiesReader();
				//fecthing wait from properties class
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(pr.getImplicitWait()));
				driver.get(pr.getAppURL());
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
