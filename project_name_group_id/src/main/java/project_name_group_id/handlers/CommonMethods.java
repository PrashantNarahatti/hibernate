package project_name_group_id.handlers;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import project_name_group_id.utils.PropertiesReader;

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

	/**
	 * fetching current url
	 * 
	 * @param driver
	 * @return
	 */
	public String getCurrentURL(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	/**
	 * fetching current page title
	 * 
	 * @param driver
	 * @return
	 */
	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	/**
	 * 
	 * @param element
	 */
	public void elementVisibilityCheck(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * for getting hardwait using thread class
	 */
	public void getHardWait() {

		PropertiesReader pr = new PropertiesReader();
		try {
			Thread.sleep(pr.getHardWait());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * clearing text inside text box
	 * 
	 * @param element
	 */
	public void clearTextBox(WebElement element) {
		try {
			element.click();
			String s = Keys.chord(Keys.CONTROL, "A");
			element.sendKeys(s);
			element.sendKeys(Keys.DELETE);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * get future date - 30 days from current day
	 * 
	 * @return
	 */
	public String getFutureDate() {
		LocalDateTime ldt = LocalDateTime.now().plusDays(30);
		DateTimeFormatter formmat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
		String formatter = formmat1.format(ldt);
		return formatter;
	}
	
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementVisibility(WebDriver driver , WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}