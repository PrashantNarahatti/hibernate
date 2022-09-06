package selenium_introduction.browserInteraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeInteraction {

	public static void main(String[] args) {
		String projectLocation =  System.getProperty("user.dir");
		String chromedrivelocation = "/drivers/chromedriver.exe";
		String driverPath = projectLocation + chromedrivelocation;
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
	}

}
