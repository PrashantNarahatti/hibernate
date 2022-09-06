package project_amazon_group_01.handlers;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import project_amazon_group_01.utils.PropertiesReader;

public class CommonMethods {
	private WebDriver driver;

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
			System.out.println("Data is enetered in the text field ");
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
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementVisibility(WebDriver driver, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void mouseHoverOnTheElement(WebElement element) {

		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

}
