package selenium_introduction.browserInteraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInteraction {

	public static void main(String[] args) {
		String projectLocation =  System.getProperty("user.dir");
		String chromedrivelocation = "/drivers/geckodriver.exe";
		String driverPath = projectLocation + chromedrivelocation;
		System.out.println(driverPath);
		System.setProperty("webdriver.gecko.driver", driverPath );
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
	}

}
