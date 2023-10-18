package com.qa.pfl.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class CustomerOrder {
	private WebDriver driver;

	private ElementUtil eleutil;

	private JavaScriptUtil JsUtil;

	public CustomerOrder(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
		JsUtil = new JavaScriptUtil(driver);
		Properties p = eleutil.readPropertyFile(
				System.getProperty("user.dir") + "\\src\\test\\resources\\config\\qa.config.properties");

	}

	private final By Transaction_type = By
			.xpath("//label[text()='Transaction Type']/following::div[1]/oj-select-single/div/div");
	private final By Select_CustomerOrder = By.xpath("//span[text()='Customer Order']");
	private final By ProjectManager = By.xpath("//label[text()='Project Manager *']/following::div[3]");
	private final By RBO_Code = By
			.xpath("//label[text()='RBO NAME']/following::div[@id='oj-combobox-choice-rBONAME_OrderC_t-combobox']");
	private final By RBO_text = By.xpath("//div[@id='oj-listbox-result-label-1376']");
	private final By RBO_Name = By.xpath("//oj-option[@data-value='WALMART SHOE']");
	private final By Selling_Location = By.xpath(
			"//label[text()='Selling Location']/following::div[@id='oj-combobox-choice-sellingLocation_order_t-combobox']");
	private final By Select_country = By.xpath("//oj-option[text()='India']");
	private final By Save = By.xpath("(//button[@class='oj-button-button'])[4]");

	public CustomerOrder Create_Customer_Order() {

		eleutil.waitForElementAndClick(Transaction_type, 10, 2);
		eleutil.waitForElementAndClick(Select_CustomerOrder, 10, 2);
		eleutil.waitForElementAndClick(Selling_Location, 10, 2);
		eleutil.waitForElementAndClick(Select_country, 10, 2);

		return this;
	}

	public CustomerOrder RBO_Walmart() {
		WebElement ele = driver.findElement(By.xpath(
				"//label[text()='RBO NAME']/following::div[@id='oj-combobox-choice-rBONAME_OrderC_t-combobox']"));
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(RBO_Code, 10, 2);
		eleutil.sleep(6);
		Actions oa = new Actions(driver);
		oa.moveToElement(ele).build().perform();
		eleutil.sleep(5);
		oa.moveToElement(ele).sendKeys("WALMART SHOE").build().perform();

		eleutil.sleep(5);
		eleutil.waitForElementAndClick(RBO_Name, 10, 2);

		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Save, 10, 2);
		return this;

	}

	private final By RBO_LefName = By.xpath("//oj-option[@data-value='LEFTIES (INDITEX)']");
	private final By RBO_textf = By.id("rBONAME_OrderC_t-combobox|input");

	public CustomerOrder RBO_LEFTIES() {
		WebElement ele = driver.findElement(By.xpath(
				"//label[text()='RBO NAME']/following::div[@id='oj-combobox-choice-rBONAME_OrderC_t-combobox']"));
		eleutil.sleep(5);

		eleutil.waitForElementAndClick(RBO_Code, 10, 2);

		eleutil.waitForElementAndClick(RBO_textf, 10, 2);

		eleutil.sleep(3);

		eleutil.waitForElementAndClick(RBO_Code, 10, 2);
		eleutil.sleep(3);
		Actions oa = new Actions(driver);
		// oa.moveToElement(ele).build().perform();
		eleutil.sleep(2);
		oa.sendKeys("LEFTIES (INDITEX)").build().perform();

		eleutil.sleep(5);

		eleutil.waitForElementAndClick(RBO_LefName, 10, 2);

		eleutil.sleep(5);

		eleutil.waitForElementAndClick(Save, 10, 2);

		return this;

	}

	private final By RBO_ZARAName = By.xpath("//oj-option[@data-value='ZARA']");

	public CustomerOrder RBO_ZARA() {
		WebElement ele = driver.findElement(By.xpath(
				"//label[text()='RBO NAME']/following::div[@id='oj-combobox-choice-rBONAME_OrderC_t-combobox']"));
		eleutil.sleep(5);

		eleutil.waitForElementAndClick(RBO_Code, 10, 2);
		eleutil.sleep(6);
		Actions oa = new Actions(driver);
		oa.moveToElement(ele).build().perform();
		eleutil.sleep(5);
		oa.moveToElement(ele).sendKeys("ZARA (INDITEX)").build().perform();

		eleutil.sleep(5);

		eleutil.waitForElementAndClick(RBO_ZARAName, 10, 2);

		eleutil.sleep(5);

		eleutil.waitForElementAndClick(Save, 10, 2);
		return this;

	}

	private final By RBO_DecathlonName = By.xpath("//oj-option[@data-value='DECATHLON']");

	public CustomerOrder RBO_DECATHLON() {
		WebElement ele = driver.findElement(By.xpath(
				"//label[text()='RBO NAME']/following::div[@id='oj-combobox-choice-rBONAME_OrderC_t-combobox']"));
		eleutil.sleep(5);

		eleutil.waitForElementAndClick(RBO_Code, 20, 2);
		eleutil.sleep(6);
		Actions oa = new Actions(driver);
		oa.moveToElement(ele).build().perform();
		eleutil.sleep(5);
		oa.moveToElement(ele).sendKeys("WALMART SHOE").build().perform();

		eleutil.sleep(5);

		eleutil.waitForElementAndClick(RBO_Name, 20, 2);

		eleutil.sleep(5);

		eleutil.waitForElementAndClick(Save, 20, 2);
		return this;

	}

	private final By Transaction_NO = By.xpath("//h2[contains(text(),'AD ORDER')]");

	public void Save_Transaction_Number() {

		String TNo = eleutil.doElementGetText(Transaction_NO);
		String[] sp = TNo.split("-");

		System.out.println("The numbers are " + sp);

	}

	private final By Select_ModelField = By
			.xpath("//label[text()='Select Model']/following:: div[@role='presentation'][1]");
	private final By Select_PFL = By.xpath("//span[text()='PFL']");

	public CustomerOrder SelectPFLModel() {

		eleutil.waitForElementAndClick(Select_ModelField, 20, 2);
		eleutil.waitForElementAndClick(Select_PFL, 20, 2);
		return this;
	}

	private final By Select_WL = By.xpath("//span[text()='WL']");

	public CustomerOrder SelectWLModel() {
		eleutil.waitForElementAndClick(Select_ModelField, 20, 2);
		eleutil.waitForElementAndClick(Select_WL, 20, 2);

		return this;
	}

	private final By Select_HTL = By.xpath("//span[text()='WL']");

	public CustomerOrder SelectHTLModel() {

		eleutil.waitForElementAndClick(Select_ModelField, 20, 2);
		eleutil.waitForElementAndClick(Select_HTL, 20, 2);

		return this;
	}

	private final By Search_Customer_Item = By
			.xpath("(//label[text()='Search Customer Item Number']/following::div[1]//div)[1]/div[1]");
	private final By Enter_CustomerItem = By.id("searchCustomerItemNumberPfl_t-combobox|input");
	private final By Click_Item = By.xpath("//span[text()='UAT-WLRWCRC002-VOV']");

	public CustomerOrder Select_Customer_Item() {
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Search_Customer_Item, 20, 2);

		WebElement ele = driver.findElement(Search_Customer_Item);
		Actions oa = new Actions(driver);
		eleutil.sleep(5);
		oa.sendKeys("UAT-WLRWCRC002-VOV").build().perform();
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Click_Item, 20, 2);

		return this;

	}

	private final By Search_Item_dropdown = By.xpath("//input[@id='searchCustomerItemNumberPfl_t-combobox|input']");
	private final By Select_PFLItem = By.xpath(" //oj-option[text()='TTRKBCR001_PFL_R1L1-V1--4-239127-000-01']");
	private final By Configure_Item = By.xpath("//span[text()='Configure']");

	public CustomerOrder SearchItemandConfigure() {
		eleutil.waitForElementAndClick(Search_Item_dropdown, 20, 2);

		eleutil.waitForElementAndClick(Select_PFLItem, 20, 2);

		eleutil.waitForElementAndClick(Configure_Item, 20, 2);
		return this;
	}

	private final By Copyorder = By.xpath("//span[text()='Copy Order']");

	public CustomerOrder CopycustomerOrder() {
		eleutil.sleep(10);
		try {
			eleutil.waitForElementAndClick(Right_Arrow, 20, 2);
		} catch (Exception e1) {
			eleutil.waitForElementAndClick(Right_Arrow, 20, 2);
		}
		try {
			eleutil.sleep(5);
			eleutil.waitForElementAndClick(Copyorder, 20, 2);

		} catch (Exception e) {
			eleutil.sleep(5);
			JsUtil.clickElementByJS(Copyorder);

		}
		return this;
	}

	private final By save = By.xpath("//button//span[text()='Save']");

	public CustomerOrder Saveorder() {
		eleutil.sleep(20);
		eleutil.waitForElementAndClick(save, 20, 2);

		return this;
	}

	private final By Configurebutton = By.xpath("//button//span[text()='Configure']");

	public VariableData_CO Click_ConfigureButton() {
		eleutil.sleep(10);
		WebElement ConfigureButton = driver.findElement(By.xpath("//span[text()='Configure']"));
//		WebElement ConfigureButtonNAv = driver.findElement(By.xpath("//label[text()='Search Customer Item Number']"));
//		eleutil.scrollToEle(Configurebutton);
//		eleutil.waitForElementAndClick(Configurebutton, 10, 2);
//		Actions oact = new Actions(driver);
//		oact.moveToElement(ConfigureButton).click().build().perform();
		JsUtil.scrollIntoView(ConfigureButton);
		eleutil.sleep(5);
		try {
			eleutil.waitForElementAndClick(Configurebutton, 10, 2);
		} catch (Exception e) {

			JsUtil.clickElementByJS(Configurebutton);
		}

		return new VariableData_CO(driver);

	}

	private final By Submit_Order = By.xpath("//span[text()='Submit Order.']");

	private final By Right_Arrow = By.xpath("//div[@id='top-toolbar-wrapper']//div[@title='Next']");

	public CustomerOrder Submit_The_Order() {

		eleutil.sleep(30);

		try {
			eleutil.sleep(10);
			eleutil.waitForElementAndClick(Right_Arrow, 20, 2);
			eleutil.sleep(2);
			eleutil.waitForElementAndClick(Submit_Order, 20, 2);
		} catch (Exception e) {
			eleutil.sleep(2);
			eleutil.waitForElementAndClick(Submit_Order, 20, 2);
		}

		return this;
	}

	private final By Bill_To_Customer = By
			.xpath("(//label[text()='Bill To Customer:']/following::div[@role='presentation'])[1]");
	private final By Bill_To_Customer_Value = By.xpath("//oj-option[text()='489403 - 28 HUNG PHU JSC']");
	private final By Customer_Bill_To = By
			.xpath("(//label[text()='Customer Related Bill to Sites']/following::div[@role='presentation'])[1]");
	private final By Customer_Bill_To_Value = By
			.xpath("//oj-option[text()='1049609 - 168 QUANG TRUNG STR. GOVAP DIST.']");

	public CustomerOrder Billing_To_Details() {
		eleutil.sleep(6);
		eleutil.waitForElementAndClick(Bill_To_Customer, 10, 2);

		eleutil.sleep(4);
		eleutil.waitForElementAndClick(Bill_To_Customer_Value, 10, 2);

		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Customer_Bill_To, 10, 2);

		eleutil.sleep(4);
		eleutil.waitForElementAndClick(Customer_Bill_To_Value, 10, 2);

		return this;
	}

	private final By Ship_To_Customer = By
			.xpath(("//label[text()='Ship To Customer:']/following::div[@role='presentation'][2]"));
	private final By Ship_To_Customer_Value = By
			.xpath("//oj-option[text()='857143 - (Fty 1)Cong Ty TNHH Giay Dona Standard Viet Nam']");
	private final By Customer_Ship_To = By
			.xpath("(//label[text()='Customer Related Ship to Sites']/following::div[@role='presentation'])[2]//a");
	private final By Customer_Ship_To_Value = By.xpath(
			"//oj-option[text()='1868592 - (xuong 1,phong thu mua), cty Dona Standard, KCN Xuan Loc, H.Xuan Loc, Dong Nai']");

	public CustomerOrder Shipping_To_Details() {
		eleutil.sleep(10);
		eleutil.waitForElementAndClick(Ship_To_Customer, 10, 2);
		eleutil.sleep(10);
		eleutil.waitForElementAndClick(Ship_To_Customer_Value, 10, 2);
		eleutil.sleep(10);
		eleutil.waitForElementAndClick(Customer_Ship_To, 10, 2);
		eleutil.sleep(10);
		eleutil.waitForElementAndClick(Customer_Ship_To_Value, 10, 2);

		return this;
	}

	private final By Troubleshoot_controlTab = By.xpath("//span[text()='Troubleshooting and Support Controls']");

	public CustomerOrder Select_TroubleshootTab() {

		eleutil.sleep(4);

		eleutil.waitForElementAndClick(Troubleshoot_controlTab, 10, 2);
		return this;

	}

	private final By ERP_OrderNo = By.xpath("//label[text()='Transaction Number']");

	public CustomerOrder ERP_Orderno() {
		WebElement ele = driver.findElement(ERP_OrderNo);
		eleutil.sleep(5);
		Actions oct = new Actions(driver);
		oct.moveToElement(ele).build().perform();
		eleutil.sleep(20);
		driver.navigate().refresh();

		return this;
	}

}
