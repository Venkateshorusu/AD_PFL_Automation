package com.qa.pfl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy;

public class VariableData_CO {
	private WebDriver driver;

	private ElementUtil eleutil;

	private JavaScriptUtil JsUtil;

	public VariableData_CO(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
		JsUtil = new JavaScriptUtil(driver);
	}

	private final By Click_BuildFiberContent_Tab = By.xpath("//h3[text()='Build Fiber Content']");
	private final By Select_Main_Garment = By.xpath("(//option[@value='BACK COVERAGE'])[1]");
	private final By Select_Garment_Parts = By.xpath("(//option[@value='APPLIQUE'])[2]");
	private final By Add_Garment_Parts = By.xpath("//input[@id='Add_Garment_Parts']");
	private final By Fiber_1field = By
			.xpath("//div[text()='Garment Part']/../../../../../..//div[@role='rowgroup'][2]//div//div[5]");
	private final By Add_GarmentToggle = By.xpath(
			"(//div[@class='oj-switch-container oj-form-control-container'])[6]//div[@class='oj-switch-track'][1]/div[@aria-labelledby='addGarmentPartsToArray_FM-label|label']");

	private final By Validate1 = By.xpath("//span[text()='Validate']");
	// private final By Fiber_1field = By
	// .id("fiber1_DB_FM_PL-combobox|input");
	private final By Fiber1option = By.xpath("//div[@data-value='COTTON']");
	private final By Percentage_field = By
			.xpath("//div[text()='Garment Part']/../../../../../..//div[@role='rowgroup'][2]//div//div[6]");
	private final By percentage_input = By.xpath("//*[@id=\"percentage1_PL|input\"]");

	private final By Fiber2txtbox = By.xpath(
			"(//div[text()='Garment Part']/../../../../../..//div[@role='rowgroup'][2]//div//div[@role='gridcell'])[6]");
	private final By Fiber2_MaterialSelect = By.xpath("//div[@data-value='POLYESTER BRUSHED MICRO JERSEY']");
	private final By Fiber2Percentage = By.xpath(
			"(//div[text()='Garment Part']/../../../../../..//div[@role='rowgroup'][2]//div//div[@role='gridcell'])[7]");
	private final By Fiber2Percent_txtbox = By.xpath("//*[@id='percentage2_PL|input']");

	public VariableData_CO build_Fiber_Content_Section() {
		eleutil.sleep(50);
		eleutil.waitForElementAndClick(Click_BuildFiberContent_Tab, 20, 2);

		eleutil.sleep(8);
		eleutil.waitForElementAndClick(Select_Main_Garment, 10, 2);

		try {
			eleutil.sleep(2);
			eleutil.waitForElementAndClick(Add_Garment_Parts, 10, 2);

		} catch (Exception e) {
			eleutil.sleep(2);
			eleutil.waitForElementAndClick(Add_GarmentToggle, 10, 2);

		}

		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Select_Garment_Parts, 10, 2);

		try {
			eleutil.sleep(2);
			eleutil.waitForElementAndClick(Add_Garment_Parts, 10, 2);

		} catch (Exception e) {
			eleutil.sleep(2);
			eleutil.waitForElementAndClick(Add_GarmentToggle, 10, 2);

		}
//		eleutil.sleep(5);
//		click(Validate1, WaitStrategy.CLICKABLE, 10);
		eleutil.sleep(10);
		try {
			eleutil.waitForElementAndClick(Fiber_1field, 10, 2);

		} catch (Exception e) {
			eleutil.sleep(10);
			eleutil.waitForElementAndClick(Fiber_1field, 10, 2);

		}

		eleutil.sleep(10);
		eleutil.waitForElementAndClick(Fiber1option, 10, 2);

		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Percentage_field, 10, 2);

		eleutil.sleep(5);
		eleutil.waitForElementAndClick(percentage_input, 10, 2);

		return this;
	}

	private final By Build_Care_Instructions_section = By.xpath("//h3[text()='Build Care Instructions']");
	private final By washdropdown = By.xpath("//label[text()='Wash']/../../../..//input[@role='combobox']");
	private final By wash_Option = By.xpath("//div[text()='COLD WASH.']");
	private final By Bleachdropdown = By.xpath("//label[text()='Bleach']/../../../..//a");
	private final By Bleach_option = By.xpath("//div[text()='BLEACH AS NEEDED']");

	public VariableData_CO build_Care_Instructions_section() {
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Build_Care_Instructions_section, 10, 2);

		eleutil.sleep(2);
		eleutil.waitForElementAndClick(washdropdown, 10, 2);

		eleutil.waitForElementAndClick(wash_Option, 10, 2);

		eleutil.sleep(2);
		eleutil.waitForElementAndClick(Bleachdropdown, 10, 2);

		eleutil.waitForElementAndClick(Bleach_option, 10, 2);
		System.out.println("Care builded");
		return this;
	}

	private final By select_The_row = By
			.xpath("//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[3]//input");
	private final By select_the_quantity = By
			.xpath("//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[4]");
	private final By enterQuantity = By
			.xpath("//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[4]//input");
	private final By update_fiber_content = By.xpath("//input[@value='Add/Update Fiber Content']");
	private final By Update_care_instructions = By.xpath("//input[@value='Add/Update Care Instructions']");
	private final By EODclass = By
			.xpath("//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[7]");
	private final By EODoption = By.xpath("//div[text()='Exclusive of Decoration']");
	private final By country_origin1 = By
			.xpath("//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[9]");
	private final By country_originotpions = By.xpath("//div[text()='Made in Africa']");
	private final By CPSIA_Txtbox = By
			.xpath("//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[10]");
	private final By CPSIA_TxtValue = By.xpath("//input[@id='cpsia_VD_PL|input']");
	private final String VDtablexpath = "//div[@id='vDOuputNew']//table[@class='html-table-element']";
	private final By Validate = By.xpath("//span[text()='Validate']");

	public VariableData_CO variable_Data_Input_Entry() {

		eleutil.sleep(5);

		eleutil.waitForElementAndClick(select_The_row, 10, 2);

		eleutil.sleep(5);

		eleutil.waitForElementAndClick(select_the_quantity, 10, 2);

		eleutil.sleep(5);

		eleutil.waitForElementAndEnterValue(enterQuantity, 10, 2, "100");
		eleutil.sleep(5);

		JsUtil.clickElementByJS(update_fiber_content);
		eleutil.sleep(5);

		eleutil.waitForElementAndClick(select_The_row, 10, 2);
		eleutil.sleep(5);

		JsUtil.clickElementByJS(Update_care_instructions);
		eleutil.sleep(5);

		eleutil.waitForElementAndClick(select_The_row, 10, 2);
		eleutil.sleep(5);

		JsUtil.clickElementByJS(Update_care_instructions);

		eleutil.sleep(5);

		eleutil.waitForElementAndClick(select_The_row, 10, 2);

		eleutil.sleep(5);

		eleutil.waitForElementAndClick(EODclass, 10, 2);

		eleutil.sleep(5);

		eleutil.waitForElementAndClick(EODoption, 10, 2);
		eleutil.sleep(5);

		eleutil.waitForElementAndClick(country_origin1, 10, 2);
		eleutil.sleep(5);

		eleutil.waitForElementAndClick(country_originotpions, 10, 2);

		eleutil.sleep(5);
		eleutil.waitForElementAndClick(CPSIA_Txtbox, 10, 2);
		eleutil.sleep(5);
		eleutil.waitForElementAndEnterValue(CPSIA_TxtValue, 10, 2, "12345");
		eleutil.sleep(5);

		eleutil.waitForElementAndClick(select_The_row, 10, 2);

		eleutil.sleep(5);

		eleutil.waitForElementAndClick(Validate, 10, 2);

		// eleutil.sleep(5);
//		click(Validate, WaitStrategy.CLICKABLE, 10);

		eleutil.sleep(5);

//		Actions a = new Actions(driver);
		WebElement VDtable = driver.findElement(By.xpath(VDtablexpath));
		
//		a.moveToElement(VDtable).build().perform();
		JsUtil.scrollIntoView(VDtable);
		
		return this;
	}

	private final By Add_To_Transaction = By.xpath("(//header//oj-button[@chroming='solid'])[3]/button ");

//span[text()=' Add to Transaction']
	public CustomerOrder Add_To_Transaction() {
		eleutil.sleep(5);

		eleutil.waitForElementAndClick(Add_To_Transaction, 15, 2);

		return new CustomerOrder(driver);

	}

}
