package com.qa.pfl.pages;

import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class OpenExistingQuote {

	private WebDriver driver;

	private ElementUtil eleutil;

	private JavaScriptUtil JsUtil;
	Properties prop;

	public OpenExistingQuote(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
		JsUtil = new JavaScriptUtil(driver);
		prop = eleutil
				.readPropertyFile("D:\\Selenium_Project\\AD-PFL\\src\\test\\resources\\config\\qa.config.properties");
	}

	private final By Search = By.xpath("//a[@id='search']");
	private final By TransactionID1 = By
			.xpath("//div[@id='inputs']//div[2]//label[text()='Transaction ID']/ancestor::tbody//input");
	private final By TransactionID2 = By
			.xpath("//div[@id='display']//label[text()='Transaction ID']/ancestor::tbody//input");
	private final By Next1 = By.xpath("//td[@id='nextButtonTopSpan']//a");
	private final By Next2 = By.xpath("//td[@id='editorButtonTopSpan']//a");
	private final String Comparator = "//div[@id='editor']//select";
	private final By Value = By.xpath("//div[@id='editor']//tbody[@id='critTableBody']//input");
	private final String clickQuote = "//a[text()='%s']";
	private final By WC_status = By.xpath(
			"//div[text()='WC Status']/ancestor::div[@role='rowgroup']/following-sibling::div//span[contains(@title,'WC')]");
	private final By rowcheckbox = By.xpath("//div[@role='rowgroup']//input[@title='Select Row']/..");

	private final String ClickCustomerOrder = "//a[text()='240564']";
	private final String ClickCustomerOrderWL = "//a[text()='240950']";
	// private final String ClickCustomerOrderHTL = "//a[text()='241160']";
	private final String ClickCustomerOrderHTL = "//a[text()='241159']";

	public ADCommercePage openQoute() {
		// PFL model
		// QuoteManager
//		click(Search, WaitStrategy.CLICKABLE, 10);

		eleutil.waitForElementAndClick(Search, 10, 2);
		String parentWindow = driver.getWindowHandle(); // will get the current window
		Set<String> handles = driver.getWindowHandles(); // set of all the windows
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				eleutil.waitForElementAndClick(TransactionID1, 10, 2);
				eleutil.waitForElementAndClick(Next1, 10, 2);
				eleutil.waitForElementAndClick(TransactionID2, 10, 2);
				eleutil.waitForElementAndClick(Next2, 10, 2);
//				click(TransactionID1, WaitStrategy.CLICKABLE, 10);
//				click(Next1, WaitStrategy.CLICKABLE, 10);
//				click(TransactionID2, WaitStrategy.CLICKABLE, 10);
//				click(Next2, WaitStrategy.CLICKABLE, 10);

				Select se = new Select(driver.findElement(By.xpath(Comparator)));

				se.selectByIndex(1);

				eleutil.waitForElementAndEnterValue(Value, 10, 2, prop.getProperty("QuoteNumber"));
				eleutil.waitForElementAndClick(Search, 10, 2);

				// sendKeys(Value, prop.getProperty("QuoteNumber"), WaitStrategy.CLICKABLE, 10);
				// sendKeys(Value, "CPQ-SIT2-17430", WaitStrategy.CLICKABLE, 10);
//				click(Search, WaitStrategy.CLICKABLE, 10);

				String quote = String.format(clickQuote, prop.getProperty("QuoteNumber"));
				// String quote = String.format(clickQuote, "CPQ-SIT2-17430");

				driver.switchTo().frame("searchResultFrame");
				eleutil.waitForElementAndClick(By.xpath(quote), 10, 2);

//				click(By.xpath(quote), WaitStrategy.CLICKABLE, 10);
				driver.close(); // closing child window
				driver.switchTo().window(parentWindow); // cntrl to parent window

			}

		}
		return new ADCommercePage(driver);

	}

	public CustomerOrder OpenPFLCustomerOrder() {

		eleutil.waitForElementAndClick(Search, 10, 2);
		String parentWindow = driver.getWindowHandle(); // will get the current window
		Set<String> handles = driver.getWindowHandles(); // set of all the windows
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				eleutil.waitForElementAndClick(TransactionID1, 10, 2);
				eleutil.waitForElementAndClick(Next1, 10, 2);
				eleutil.waitForElementAndClick(TransactionID2, 10, 2);
				eleutil.waitForElementAndClick(Next2, 10, 2); 
				eleutil.sleep(3);
				Select se = new Select(driver.findElement(By.xpath(Comparator)));

				se.selectByIndex(1);
				eleutil.waitForElementAndEnterValue(Value, 10, 2, "240564");

				eleutil.waitForElementAndClick(Search, 10, 2);

				String quote = String.format(ClickCustomerOrder, "240564");

				driver.switchTo().frame("searchResultFrame");
				eleutil.waitForElementAndClick(By.xpath(quote), 10, 2);
				eleutil.waitForElementAndClick(By.xpath(quote), 10, 2);

				driver.close(); // closing child window
				driver.switchTo().window(parentWindow); // cntrl to parent window

			}

		}
		return new CustomerOrder(driver);
	}

	public OpenExistingQuote OpenWLCustomerOrder() {

		eleutil.waitForElementAndClick(Search, 10, 2);
		String parentWindow = driver.getWindowHandle(); // will get the current window
		Set<String> handles = driver.getWindowHandles(); // set of all the windows
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				eleutil.waitForElementAndClick(TransactionID1, 10, 2);
				eleutil.waitForElementAndClick(Next1, 10, 2);
				eleutil.waitForElementAndClick(TransactionID2, 10, 2);
				eleutil.waitForElementAndClick(Next2, 10, 2);

				Select se = new Select(driver.findElement(By.xpath(Comparator)));

				se.selectByIndex(1);
				eleutil.waitForElementAndEnterValue(Value, 10, 2, prop.getProperty("CustomerOderWL"));

				eleutil.waitForElementAndClick(Search, 10, 2);

				String quote = String.format(ClickCustomerOrder, prop.getProperty("CustomerOderWL"));

				driver.switchTo().frame("searchResultFrame");
				eleutil.waitForElementAndClick(By.xpath(quote), 10, 2);
				eleutil.waitForElementAndClick(By.xpath(quote), 10, 2);

				driver.close(); // closing child window
				driver.switchTo().window(parentWindow); // cntrl to parent window

			}

		}
		return this;
	}

	public OpenExistingQuote OpenHTLCustomerOrder() {
		eleutil.waitForElementAndClick(Search, 10, 2);
		String parentWindow = driver.getWindowHandle(); // will get the current window
		Set<String> handles = driver.getWindowHandles(); // set of all the windows
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				eleutil.waitForElementAndClick(TransactionID1, 10, 2);
				eleutil.waitForElementAndClick(Next1, 10, 2);
				eleutil.waitForElementAndClick(TransactionID2, 10, 2);
				eleutil.waitForElementAndClick(Next2, 10, 2);

				Select se = new Select(driver.findElement(By.xpath(Comparator)));

				se.selectByIndex(1);
				eleutil.waitForElementAndEnterValue(Value, 10, 2, prop.getProperty("CustomerOderWL"));

				eleutil.waitForElementAndClick(Search, 10, 2);

				String quote = String.format(ClickCustomerOrder, prop.getProperty("CustomerOderWL"));

				driver.switchTo().frame("searchResultFrame");
				eleutil.waitForElementAndClick(By.xpath(quote), 10, 2);
				eleutil.waitForElementAndClick(By.xpath(quote), 10, 2);

				driver.close(); // closing child window
				driver.switchTo().window(parentWindow); // cntrl to parent window

			}

		}
		return this;
	}

}
