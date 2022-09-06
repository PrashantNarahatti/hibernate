package maven_intro.handlers;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CommonMethods {

	/**
	 * Entering text value in fields
	 * 
	 * @param element
	 * @param value
	 */
	public void enterText(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Data is not enetered in the text field ");
		}
	}

	/**
	 * to send Enter key
	 * 
	 * @param element
	 */
	public void hitEnter(WebElement element) {
		try {
			element.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Data is not enetered in the text field ");
		}
	}

	/**
	 * to click on element
	 * 
	 * @param element
	 */
	public void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Data is not enetered in the text field ");
		}
	}
}