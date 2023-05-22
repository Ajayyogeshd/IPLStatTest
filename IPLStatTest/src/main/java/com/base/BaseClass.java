package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.ConfigReader;
import config.PropertiesFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ConfigReader reader;

	/**
	 * Initializes the WebDriver based on the specified browser.
	 * 
	 * @param browser The browser name (Chrome, Firefox, or Edge).
	 * @return The initialized WebDriver.
	 */
	public WebDriver initializeWebDriver(String browser) {
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		return driver;
	}

	/**
	 * Retrieves the URL from the properties file.
	 * 
	 * @return The URL.
	 */
	public String getUrl() {
		reader = new PropertiesFileReader();
		return reader.getUrl();
	}

	/**
	 * Retrieves the browser name from the properties file.
	 * 
	 * @return The browser name.
	 */
	public String getBrowser() {
		reader = new PropertiesFileReader();
		return reader.getBrowser();
	}

	/**
	 * Opens the specified URL in the WebDriver.
	 * 
	 * @param url The URL to open.
	 */
	public void openURL(String url) {
		// Open the URL in the WebDriver
		driver.get(url);
	}

	/**
	 * Enters the specified text into the given WebElement after clearing it.
	 * 
	 * @param element The WebElement to send keys to.
	 * @param text    The text to be entered.
	 */
	public void sendKeys(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * Clicks on the specified WebElement.
	 * 
	 * @param element The WebElement to click.
	 */
	public void clickElement(WebElement element) {
		element.click();
	}

	/**
	 * Sets the implicit wait time for the WebDriver.
	 */
	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * Waits for a WebElement to become visible.
	 * @param element The WebElement to wait for.
	*/
	
	public void waitForElementVisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForElementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * Retrieves the text from the given WebElement.
	 * 
	 * @param element The WebElement to retrieve the text from.
	 * @return The text of the WebElement.
	 */
	public String getTextFromElement(WebElement element) {
		return element.getText();
	}

	/**
	 * Quits the current browser window and closes the WebDriver.
	 */
	public void quitWindow() {
		driver.quit();
	}

	/**
	 * Maximizes the browser window.
	 * 
	 * @param driver The WebDriver instance.
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * 
	 * Captures a screenshot of the current state of the WebDriver and saves it as a
	 * PNG file.
	 * 
	 * @param driver   The WebDriver instance to capture the screenshot from.
	 * 
	 * @param testName The name of the test associated with the screenshot.
	 * 
	 * @return The file path of the captured screenshot.
	 */
	public static String captureScreenshot(WebDriver driver, String testName) {

		File srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath = System.getProperty("user.dir") + "\\Screenshots\\" + testName + ".png";

		try {
			FileHandler.copy(srcScreenshot, new File(destinationScreenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return destinationScreenshotPath;
	}
	 public void scrollIntoView( WebElement element) {
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	    }
	 public void clickElementWithJavaScript(WebElement element) {
		    JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].click();", element);
		}


}
