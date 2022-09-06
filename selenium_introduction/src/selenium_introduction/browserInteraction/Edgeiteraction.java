package selenium_introduction.browserInteraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgeiteraction {

	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");
		System.out.println(projectLocation);
		String msedgedrivelocation = "/drivers/msedgedriver.exe";
		System.out.println(msedgedrivelocation);
		String driverPath = projectLocation + msedgedrivelocation;
		System.out.println(driverPath);
		System.setProperty("webdriver.edge.driver", driverPath);
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
	}

}
