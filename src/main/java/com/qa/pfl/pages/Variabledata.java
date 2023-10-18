package com.qa.pfl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
 
import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class Variabledata {

	private WebDriver driver;
	private ElementUtil eleutil;

	private JavaScriptUtil JsUtil;

	private final By variableTab = By.xpath("//span[text()='Variable Data']");

	private final String variableTabxpath = "//span[text()='Variable Data']";
	private final By Select_Input_Fields_section = By.xpath("//h3[text()='Select Input Fields']");

	private final By FiberModule = By.xpath("//input[@id='fiber_module']");
	private final By exclusive_of_decoration = By.xpath("//input[@id='exclusive_of_decoration']");
	private final By ad_info = By.xpath("//input[@id='ad_info']");
	private final By country_origin = By.xpath("//input[@id='country_origin']");
	private final By CareModule = By.xpath("//input[@id='care_module']");
	private final By cut_number = By.xpath("cut_number");
	private final By read_only_for_ad_info = By.xpath("//input[@id='ad_info']/..//../td[6]//input");
	private final By read_only_for_cut_number = By.xpath("//input[@id='cut_number']/..//../td[6]//input"); 
	private final By Configure_Care_Module_section = By.xpath("//h3[normalize-space()='Configure Care Module']");

	private final By Wash = By.xpath("//span[text()='Wash']/../..//div[3]//input");

private final By Bleach = By.xpath("//span[text()='Bleach']/../..//div[3]//input");
	//	selectLayoutField
	private final By Select_Layout_Field_Section = By.xpath("//h3[text()='Select Layout Fields']");
	private final By fiberclass1 = By
			.xpath("//div[text()='Layout Field']/ancestor::div[@role='row']/../following-sibling::div//div//div[3]");

	private final By fiberclass2 = By
			.xpath("//*[@id=\"_setvDOutputOption2-arrayset-table\"]/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[3]");

private final By fiberclass3 = By
			.xpath("//*[@id=\"_setvDOutputOption2-arrayset-table\"]/div[1]/div[1]/div[2]/div/div[2]/div[3]/div[3]");
	private final By fiberclass4 = By
			.xpath("//*[@id=\"_setvDOutputOption2-arrayset-table\"]/div[1]/div[1]/div[2]/div/div[2]/div[4]/div[3]");
	private final By fiberModuleoption = By.xpath("//li//div[text()='Fiber Module']");
	private final By CareModuleoption = By.xpath("//li//div[text()='Care Module']");
	private final By EOD = By.xpath("//div[text()='EOD']");
	private final By Country_of_Origin = By.xpath("//div[text()='Country of Origin']");
	private final By PlusIcon = By.xpath(
			"//*[@id=\"_setvDOutputOption2-arrayset-table\"]/div[1]/cpq-table-toolbar/oj-toolbar/div[1]/div/oj-button[1]/button");
	//	languageTranslationDetailsSection
	private final By field_name = By
			.xpath("//label[text()='Field Name']/ancestor::div[@class='input-form-control oj-flex']//a");
	private final By Care_Module = By.xpath("//li//div[text()='Care Module']");
	private final By Languagefield = By
			.xpath("//label[text()='Language']/../../../..//div[2]//div[@role='presentation']//div");

	private final By LanguageforEnglish = By.xpath("//div[text()='English']");

private final By LanguageforSpanish = By.xpath("//div[text()='Spanish']");
	private final By Add_Language_detailsButton = By.xpath("//input[@id='addLanguageDetails']");
	//	Build Fiber Content Section
	private final By Build_Fiber_Content_Section = By.xpath("//h3[text()='Build Fiber Content']");
	private final By Select_Garment_Parts = By.xpath("//select[@id='selectedGarments']//option[text()='BACK']");
	private final By Add_Garment_Parts = By.xpath("//input[@id='Add_Garment_Parts']");
	private final By Fiber_1field = By
			.xpath("//div[text()='Garment Part']/../../../../../..//div[@role='rowgroup'][2]//div//div[5]");

	private final By Fiber1option = By.xpath("//div[text()='COTTON']");

private final By Percentage_field = By
			.xpath("//div[text()='Garment Part']/../../../../../..//div[@role='rowgroup'][2]//div//div[6]");
	private final By percentage_input = By.xpath("//*[@id=\"percentage1_PL|input\"]");
	//	-- Build Care Instructions section
	private final By Build_Care_Instructions_section = By.xpath("//h3[text()='Build Care Instructions']");
	private final By washdropdown = By.xpath("//label[text()='Wash']/../../../..//input[@id='wash_CM_PL-combobox|input']");
	private final By wash_Option = By.xpath("//div[text()='COLD WASH.']");
	private final By Bleachdropdown = By.xpath("//label[text()='Bleach']/../../../..//input [@id='bleach_CM_PL-combobox|input']");
	private final By Bleach_option = By.xpath("//div[text()='BLEACH AS NEEDED']");

	//	Variable Data Input Entry
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
	private final By VDComplete = By.xpath("//oj-switch[@id=\"vDComplete_PL\"]/div");
	private final String VDtablexpath = "//div[@id='vDOuputNew']//table[@class='html-table-element']";
	private final By Validate = By.xpath("//span[text()='Validate']");
	private final By Add_To_Transaction = By.xpath("//span[text()=' Add to Transaction']");
	
	private final By ConfigureFiberModule = By.xpath("//h3[text()='Configure Fiber Module']");
	private final By overrideToggleforFiberpercentage=By.xpath("//oj-switch[@id='overrideFiberPercentage_FM_PL']");
	private final By checkboxForoverrideFiberPercentage = By.xpath("//input[@id='overrideFiberPercentageArr_FM_PL-undefined']");
	public Variabledata(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
		JsUtil = new JavaScriptUtil(driver);
	}
	public Variabledata configure_Fiber_Module_section() {
		
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(ConfigureFiberModule, 10, 2);
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(overrideToggleforFiberpercentage, 10, 2);
		
		return this;
		
	}
	
	
	public Variabledata build_Care_Instructions_section() {
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Build_Care_Instructions_section, 10, 2);
		eleutil.sleep(5);
//		eleutil.waitForElementAndClick(washdropdown, 10, 2);
		
		 
		eleutil.sleep(5);
		try {
		eleutil.waitForElementAndClick(washdropdown, 10, 2);
		eleutil.waitForElementAndClick(wash_Option, 10, 2);
		}
		catch(Exception e) {
			eleutil.waitForElementAndClick(washdropdown, 10, 2);
			eleutil.waitForElementAndClick(wash_Option, 10, 2);
		}
		
		eleutil.sleep(5);

		eleutil.waitForElementAndClick(Bleachdropdown, 10, 2);
		eleutil.waitForElementAndClick(Bleach_option, 10, 2);

		return this;
	}
	 
	public Variabledata build_Fiber_Content_Section() {
		
		
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Build_Fiber_Content_Section, 10, 2);
		
		
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Select_Garment_Parts, 10, 2);
		
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Add_Garment_Parts, 10, 2);
		
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Fiber_1field, 10, 2);
		
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Fiber1option, 10, 2);
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(checkboxForoverrideFiberPercentage, 10, 2);
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Percentage_field, 10, 2);
		
		eleutil.sleep(5);
		eleutil.waitForElementAndEnterValue(percentage_input, 10, 2, "100");
		 

		return this;
	}
	public Variabledata configure_CareModule_section() {
//		JsUtil.scrollPageDownMiddlepage();
		eleutil.sleep(7);

		JsUtil.clickElementByJS(Select_Input_Fields_section);
		eleutil.sleep(3);
		JsUtil.clickElementByJS(Configure_Care_Module_section);
//		eleutil.waitForElementAndClick(Configure_Care_Module_section, 20, 2);
//		eleutil.waitForElementVisible(Wash, 10);
//		JsUtil.clickElementByJS(Wash);
		eleutil.scrollToEle(Wash);
        eleutil.sleep(3);
        eleutil.doClick(Wash);
        eleutil.sleep(5);
        eleutil.doClick(Bleach);
		return this;
	}
	public Variabledata languageTranslationDetailsSection() {

		try {
			eleutil.sleep(7);
			eleutil.waitForElementAndClick(field_name, 10, 2);
			eleutil.waitForElementAndClick(Care_Module, 10, 2);

			eleutil.sleep(5);
			eleutil.waitForElementAndClick(Languagefield, 10, 2);
			eleutil.waitForElementAndClick(LanguageforEnglish, 10, 2);

			eleutil.sleep(5);
			eleutil.waitForElementAndClick(Languagefield, 10, 2);
			eleutil.waitForElementAndClick(LanguageforSpanish, 10, 2);

		} catch (Exception e) {
			eleutil.sleep(7);
			eleutil.waitForElementAndClick(field_name, 10, 2);
			eleutil.waitForElementAndClick(Care_Module, 10, 2);
			eleutil.sleep(5);
			eleutil.waitForElementAndClick(Languagefield, 10, 2);
			eleutil.waitForElementAndClick(LanguageforEnglish, 10, 2);
			eleutil.sleep(5);
			eleutil.waitForElementAndClick(Languagefield, 10, 2);
			eleutil.sleep(5);
			eleutil.waitForElementAndClick(LanguageforSpanish, 10, 2);
		}
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Add_Language_detailsButton, 10, 2);

		return this;
	}
	public Variabledata SelectInputFields() {
		JsUtil.scrollPageUp();
		eleutil.sleep(5);
		JsUtil.clickElementByJS(variableTab);
		eleutil.sleep(5);
		JsUtil.clickElementByJS(Select_Input_Fields_section);
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(FiberModule, 10, 2);
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(exclusive_of_decoration, 10, 2);
		eleutil.sleep(5);
		JsUtil.clickElementByJS(CareModule);
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Validate, 10, 2);

		return this;
	}

	public Variabledata selectLayoutField() {
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Select_Layout_Field_Section, 10, 2);

		eleutil.sleep(5);

		try {
			eleutil.waitForElementAndClick(fiberclass1, 10, 2);
			eleutil.sleep(3);
			eleutil.waitForElementAndClick(fiberModuleoption, 10, 2);

		} catch (Exception e) {
			eleutil.waitForElementAndClick(fiberclass1, 10, 2);
			eleutil.sleep(3);
			eleutil.waitForElementAndClick(fiberModuleoption, 10, 2);
			eleutil.sleep(5);

		}
		JsUtil.clickElementByJS(PlusIcon);

		eleutil.sleep(5);
		try {
			eleutil.waitForElementAndClick(fiberclass2, 10, 2);
			eleutil.sleep(3);
			eleutil.waitForElementAndClick(CareModuleoption, 10, 2);

		} catch (Exception e) {
			eleutil.waitForElementAndClick(fiberclass2, 10, 2);
			eleutil.sleep(3);
			eleutil.waitForElementAndClick(CareModuleoption, 10, 2);
			eleutil.sleep(5);

		}
		JsUtil.clickElementByJS(PlusIcon);
		eleutil.sleep(5);
		try {
			JsUtil.clickElementByJS(fiberclass3);

			eleutil.sleep(3);
			eleutil.waitForElementAndClick(fiberclass3, 10, 2);
			eleutil.sleep(3);
			eleutil.waitForElementAndClick(EOD, 10, 2);

		} catch (Exception e) {
			eleutil.waitForElementAndClick(fiberclass3, 10, 2);
			eleutil.sleep(3);
			eleutil.waitForElementAndClick(EOD, 10, 2);
			eleutil.sleep(5);

		}
//		jsOperation(JSAction.CLICK, PlusIcon);
//		 eleutil.sleep(5);
//		try {
//			jsOperation(JSAction.CLICK, fiberclass4);
//			 eleutil.sleep(3);
//			click(fiberclass4, WaitStrategy.CLICKABLE, 10);
//			 eleutil.sleep(5);
//			click(Country_of_Origin, WaitStrategy.CLICKABLE, 5);
//
//		} catch (Exception e) {
//			click(fiberclass4, WaitStrategy.CLICKABLE, 10);
//			 eleutil.sleep(8);
//			click(Country_of_Origin, WaitStrategy.CLICKABLE, 10);
//			 eleutil.sleep(5);
//
//		}

		return this;
	}

	public ADCommercePage variable_Data_Input_Entry() {
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
//		click(country_origin1, WaitStrategy.CLICKABLE, 10);
//		 eleutil.sleep(5);
//		click(country_originotpions, WaitStrategy.CLICKABLE, 10);
//		 eleutil.sleep(5);
		eleutil.waitForElementAndClick(select_The_row, 10, 2);
		
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Validate, 10, 2);
		 
		
		eleutil.sleep(5);

		Actions a = new Actions(driver );
		WebElement VDtable = driver.findElement(By.xpath(VDtablexpath));
		a.moveToElement(VDtable).build().perform();
		eleutil.sleep(5);
		eleutil.waitForElementAndClick(Add_To_Transaction, 10, 2);
		 
		eleutil.sleep(15);
		return new ADCommercePage(driver);
	}

	/**
	 * this is the method to run all methods in form of methodChain
	 * 
	 */
	public void variablemethods() {
		SelectInputFields().configure_CareModule_section().selectLayoutField().languageTranslationDetailsSection()
				.build_Fiber_Content_Section().build_Care_Instructions_section().variable_Data_Input_Entry();
	}

}
