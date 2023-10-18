package com.qa.pfl.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;
import com.qa.pfl.constants.AppConstants;

public class ADCommercePage {

	private final static By PFLmodel = By.xpath("//img[@alt='Printed Fabric Label']");
	private WebDriver driver;

	private ElementUtil eleutil;

	private JavaScriptUtil JsUtil;

	private final By QuoteManagerbttn = By.xpath("//span[@title='AD Opportunity to Quote - Manager']");
	private final By NewTransactionbttn = By.xpath("//a[text()='New Transaction']");
	private final By Search = By.xpath("//a[text()='Search']");
	private final By RBOcode = By.xpath("//label[text()='RBO Code*']/../../../..//input");
	private final By WALM = By.xpath("//span[text()='WALM']");
	private final By projectmanager = By.xpath("//input[@id='projectManager_t-combobox|input']");
	private final By Kevin_Parnell = By.xpath("//span[text()='Kevin Parnell']");
	private final By customer_Artwork_Link = By.xpath("//input[@id='customerArtworkLink|input']");
	private final By selling_location = By
			.xpath("//label[text()='Selling Location *']/../../../following-sibling::div//div");
	private final By select_country = By.xpath("//div[@id='__oj_zorder_container']//li[1]");
	private final By SaveTheTransaction = By.xpath("//span[text()='Save']/ancestor::button");

// Addline Item 
	private final By AddLineItembttn = By
			.xpath("//div[@class='cpq-table-wrapper']//button//span[text()='Add Line Item']");
	//	CreatNew button
	private final By CreatNew = By.xpath("//input[@id='copyCustomerSearchData']");

//	Sync to WebCenter
	private final By txtArtwork = By.xpath("//input[@id='customerArtworkLink|input']");

private final By Artwork_Required = By.xpath("//input[starts-with(@id,'art')]");
	private final By rowcheckbox_1 = By.xpath("//div[@role='rowgroup']//input[@title='Select Row']/..");
	private final By SaveButton = By.xpath("//span[text()='Save']");
	private final By Sync_To_WebCenter = By.xpath("//span[text()='Sync To WebCenter']");
	// save Quote Number And Glid Number	
	private final String Quote = "//span[@aria-label='AD Opportunity to Quote - Manager']";

//	public ADCommercePage sync_To_WebCenter() {
//
//		sendKeys(txtArtwork, "Artwork_001", WaitStrategy.CLICKABLE, 100);
//		click(Artwork_Required, WaitStrategy.CLICKABLE, AppConstants.MEDIUM_TIME_OUT);
//		Waits.sleep(5);
//		jsOperation(JSAction.CLICK, rowcheckbox_1);
//		Waits.sleep(5);
//		click(SaveButton, WaitStrategy.CLICKABLE, AppConstants.MEDIUM_TIME_OUT);
//		Waits.sleep(5);
//		click(Sync_To_WebCenter, WaitStrategy.CLICKABLE, AppConstants.MEDIUM_TIME_OUT);
//		Waits.sleep(3);
//		click(Sync_To_WebCenter, WaitStrategy.CLICKABLE, AppConstants.MEDIUM_TIME_OUT);
//
//		return this;
//		eleutil.
//
//	}

private final String GlidNum = "//span[starts-with(text(),'CB')]";
	//	Save method
	private final By Save = By.xpath("//span[text()='Save']");

//	public ADCommercePage saveQuoteAndGlidNum() {
//		// waits condition is required
//
//		WebElement glidNumloc = DriverManager.getDriver().findElement(By.xpath(GlidNum));
//		WebElement quoteloc = DriverManager.getDriver().findElement(By.xpath(Quote));
//		String glidNumber = glidNumloc.getText();
//		String QuoteNumber = glidNumloc.getAttribute("value");
//
//		/*
//		 * try { WriteToPropertyFile.WritePropertiesFile("glidNum", glidNumber,
//		 * "D:\\Automation\\KESTE_CPQ_PFL\\src\\test\\resources\\config\\QuoteAndGLIDnumber.properties"
//		 * ); WriteToPropertyFile.WritePropertiesFile("QuoteNumber", QuoteNumber,
//		 * "D:\\Automation\\KESTE_CPQ_PFL\\src\\test\\resources\\config\\QuoteAndGLIDnumber.properties"
//		 * ); } catch (IOException e) { // TODO Auto-generated catch block
//		 * e.printStackTrace(); }
//		 */
//
//		return this;
//
//	}

	//	cancle Order method
	private final By CancelOrder = By.xpath("//span[text()='Cancel Order']");

	//	Export VD method
	private final By ExportVD = By.xpath("//span[text()='Export VD']");

	//	Create / Update Order Method
	private final By CreateORUpdate_Order = By.xpath("//span[text()='Create / Update Order']");

	//	Pipeline Viewer Method
	private final By Pipeline_Viewer = By.xpath("//span[text()='Pipeline Viewer']");

	//	Revision History Method
	private final By Revision_History = By.xpath("//span[text()='Revision History']");

	public ADCommercePage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
		JsUtil = new JavaScriptUtil(driver);
	}

public ADCommercePage addLineItem() {
		eleutil.waitForElementAndClick(AddLineItembttn, 300, 10);

		return this;
	}

	public ADCommercePage cancleOrder() { 
		eleutil.waitForElementAndClick(CancelOrder, 500,5);
		return this;
	}

/** 
	 * 
	 */
	public ADCommercePage ClickQuoteManager() {

		eleutil.waitForElementAndClick(QuoteManagerbttn, AppConstants.MEDIUM_TIME_OUT,2);

		return this;
	}

	public OpenExistingQuote ClickSearch() {
		eleutil.waitForElementAndClick(Search, AppConstants.MEDIUM_TIME_OUT, 2);

		return new OpenExistingQuote(driver);
	}

//	Creat New method
	public ProductSpecifications createNew() {
//		Waits.sleep(5);
		
		eleutil.waitForElementAndClick(CreatNew, 200,5);
	 
		return new ProductSpecifications(driver);
	}

public ADCommercePage createORUpdate_Order() {
		eleutil.waitForElementAndClick(CreateORUpdate_Order, 200,5); 
		return this;
	}

	public ADCommercePage exportVD() {
		eleutil.waitForElementAndClick(ExportVD, 200,5); 
		return this;
	}

public ADCommercePage newTransactionbttn() {

		eleutil.waitForElementAndClick(NewTransactionbttn,50,5);

		return this;
	}

	public ADCommercePage pipeline_Viewer() {
		eleutil.waitForElementAndClick(Pipeline_Viewer, 200,5); 
		return this;
	}

public ADCommercePage revision_History() {
		eleutil.waitForElementAndClick(Revision_History, 200,5); 
		return this;
	}

	public ADCommercePage save() {
		eleutil.waitForElementAndClick(Save, 500, 5);

		return this;
	}

public ADCommercePage selectModel() {
		eleutil.waitForElementAndClick(PFLmodel, 500, 5);
		return this;
	}

	public ADCommercePage transactionSection() { 
		eleutil.waitForElementAndEnterValue(RBOcode, 25, 5, "WALM"); 
		eleutil.waitForElementAndClick(WALM, AppConstants.MEDIUM_TIME_OUT, 5);
		eleutil.waitForElementAndEnterValue(projectmanager, AppConstants.MEDIUM_TIME_OUT, 5, "Kevin Parnell");
		eleutil.waitForElementAndClick(Kevin_Parnell, AppConstants.MEDIUM_TIME_OUT, 5);

		eleutil.waitForElementAndEnterValue(customer_Artwork_Link, AppConstants.MEDIUM_TIME_OUT, 5, "ArtWork_001");
		eleutil.waitForElementAndClick(selling_location, AppConstants.MEDIUM_TIME_OUT, 5);
		eleutil.waitForElementAndClick(select_country, AppConstants.MEDIUM_TIME_OUT, 5);
		eleutil.waitForElementAndClick(SaveTheTransaction, AppConstants.MEDIUM_TIME_OUT, 5);

		return this;

	}

}
