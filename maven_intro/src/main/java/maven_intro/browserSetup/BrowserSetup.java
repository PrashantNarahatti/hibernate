package maven_intro.browserSetup;

/**
 * 1. multiple browsers support
 * 2. maven based project
 * 3. should have module segregation and reusable methods
 * 4. should use testng to execute testcases
 * 5. should read input data from sources like excel, properties , json or xml
 * 6. should include readme.md / readme.txt with project summary in the project folder
 * */
 

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