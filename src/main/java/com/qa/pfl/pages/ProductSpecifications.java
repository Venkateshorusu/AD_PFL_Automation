package com.qa.pfl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;
import com.qa.pfl.constants.AppConstants;

public class ProductSpecifications {
	private WebDriver driver;
	private ElementUtil eleutil;

	private JavaScriptUtil JsUtil;

	// new Create the new Transaction of the transaction
	private final By CreatNew = By.xpath("//input[@id='copyCustomerSearchData']");

	private final By CustomerItemNumber = By.xpath("//input[@id='customerItemNumber|input']");
	private final By bttnVariableData = By.xpath("//label[text()='Variable Data']/../../../..//div[@role='switch']/..");
	private final By DSS = By.xpath("//label[text()='DSS']/../../../..//input");
	private final String dss = "//label[text()='DSS']/../../../..//a";
	private final String dssOption = "//label[text()='DSS']/../../../..//a";
	private final By DSSoptions = By.xpath("//label[text()='DSS']/../../../..//a");

	private final By GPD = By.xpath("//label[text()='GPD']/../../../..//a");
	private final By GPDoptions = By.xpath("//div[ @aria-label='Tracey Goddard']");
	private final By AveryProductCategory = By.xpath("//label[text()='Avery Product Category']/../../../..//span//a");
	private final By AveryProductCategoryoptions = By.xpath("//div[text()='PRINTED FABRIC LABEL']");
	private final By AveryProductLine = By.xpath("//label[text()='Avery Product Line']/../../../..//span//a");
	private final By AveryProductLineoptions = By.xpath("//div[text()='EXTERIOR EMBELLISHMENT PFL']");
	private final By AveryProductType = By.xpath("//label[text()='Avery Product Type']/../../../..//span//a");
	private final By AveryProductTypeoptions = By.xpath("//div[text()='COATED COTTON']");
	private final By pressType = By.xpath("//label[text()='Press Type']/../../../following-sibling::div//a");
	private final By pressTypeoptions = By.xpath("//span[text()='Rotary']");
	private final By TapeStyleNumber = By
			.xpath("//label[text()='Tape Style Number']/../../../following-sibling::div//a");
	private final By TapeStyleNumberSelectOption = By.xpath("//div[text()='#10058 | White | XSF coating']");
	private final By Overall_Width = By.xpath("//input[@id='overallWidthInches|input']");
	private final By NOTESection = By.xpath("//div[@id='oj-collapsible-13-header']");
	private final By ArtProofNote = By.xpath("//textarea[@id='artProofNote_PL|input']");
	private final By FinishedWidth = By.xpath("//label[text()='Finished Width']/../../../..//input");
	private final By FinishedLength = By.xpath("//input[@id='finishedLength_M|input']");
	private final By CutType = By.xpath("//label[text()='Cut Type']/../../../..//a");
	private final By CutTypeoptions = By.xpath("//span[text()='Angle Cut']");
	private final By FoldType = By.xpath("//label[text()='Fold Type']/../../../../..//span//a[@role='presentation']");
	private final By FoldTypeoptions = By.xpath("//span[text()='Center Fold']");
	private final By FrontNumberInks = By.xpath("//input[@id='frontNumberInks|input']");
	private final By StatusSection = By.xpath("//h3[text()='Status']");
	private final By GPDConfigcheckbox = By.id("gPDConfigAttributesConfiguredtrue|cb");
	private final By Validation = By.xpath("//span[text()='Validate']");
	private final By AddtoTransaction = By.xpath("//span[text()=' Add to Transaction']");
	private final By variableTab = By.xpath("//span[text()='Variable Data']");

	public ProductSpecifications(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
		JsUtil = new JavaScriptUtil(driver);
	}

	public ProductSpecifications productSpecification() {
		eleutil.waitForElementAndClick(pressType, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndClick(pressTypeoptions, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndClick(TapeStyleNumber, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndClick(TapeStyleNumberSelectOption, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndEnterValue(Overall_Width, AppConstants.MEDIUM_TIME_OUT, 2, "28");
		eleutil.waitForElementAndEnterValue(FinishedWidth, AppConstants.MEDIUM_TIME_OUT, 2, "28");
		eleutil.waitForElementAndEnterValue(FinishedLength, AppConstants.MEDIUM_TIME_OUT, 2, "7");
		eleutil.waitForElementAndClick(CutType, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndClick(CutTypeoptions, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndClick(FoldType, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndClick(FoldTypeoptions, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndEnterValue(FrontNumberInks, AppConstants.MEDIUM_TIME_OUT, 2, "6");

		return this;
	}

	/**
	 * @param CustomerItem
	 */
	public ProductSpecifications productSpecificationheader(String CustomerItem) {
		String customerNumber = CustomerItem + eleutil.randomStr(5);

		eleutil.sleep(AppConstants.SHORT_TIME_OUT);
		eleutil.waitForElementAndEnterValue(CustomerItemNumber, 100, 5, customerNumber);
		JsUtil.clickElementByJS(bttnVariableData);
		eleutil.waitForElementAndClick(bttnVariableData, AppConstants.MEDIUM_TIME_OUT, 2);
		JsUtil.clickElementByJS(DSS);
		eleutil.sleep(5);

		eleutil.waitForElementAndClick(GPD, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndClick(GPDoptions, AppConstants.MEDIUM_TIME_OUT, 2);

		eleutil.waitForElementAndClick(AveryProductCategory, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndClick(AveryProductCategoryoptions, AppConstants.MEDIUM_TIME_OUT, 2);

		eleutil.waitForElementAndClick(AveryProductLine, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndClick(AveryProductLineoptions, AppConstants.MEDIUM_TIME_OUT, 2);

		eleutil.waitForElementAndClick(AveryProductType, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndClick(AveryProductTypeoptions, AppConstants.MEDIUM_TIME_OUT, 2);

		eleutil.waitForElementAndEnterValue(DSS, 100, 5, "Tracey Goddard");
		eleutil.sleep(5);

		eleutil.waitForElementAndClick(DSSoptions, 40, 5);
//
//		ExtentLogger.info("Entered New Customer Item Number as : " + customerNumber);
		return this;
	}

	/**
	 * @param CustomerItem
	 */
	public Variabledata productSpecificationNotes(String CustomerItem) {

		eleutil.waitForElementAndClick(NOTESection, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndEnterValue(ArtProofNote, AppConstants.MEDIUM_TIME_OUT, 2, CustomerItem);
		eleutil.waitForElementAndClick(StatusSection, AppConstants.MEDIUM_TIME_OUT, 2);
		JsUtil.scrollPageDown();
		eleutil.waitForElementAndClick(GPDConfigcheckbox, AppConstants.MEDIUM_TIME_OUT, 2);
		eleutil.waitForElementAndClick(Validation, AppConstants.MEDIUM_TIME_OUT, 2);
		return new Variabledata(driver);

	}
}
