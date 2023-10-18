package com.qa.pfl.tests;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.utils.ExcelUtil;
import com.qa.pfl.base.BaseTest;
import com.qa.pfl.constants.AppConstants;
import com.qa.pfl.factory.DriverFactory;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Features;
import io.qameta.allure.Severity;
import io.qameta.allure.Step;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

public class AddNewQuoteToTransaction extends BaseTest {

	@Test(priority = 1)
	public void loginTest() {
		System.out.println("hello");
		try {
		String a=	DriverFactory.takeLongScreenshotAndSaveAsPDF(df.getDriver());
		System.out.println(a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		extendLogger.test.get().info("Test started");
		adcommerce = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		extendLogger.test.get().info("UserName: " + prop.getProperty("username"));

	}

	 
	@Description
	@Step
	@Attachment

	@Test(priority = 2)
	public void newQuoteCreationTest() {
		extendLogger.test.get().info("QuoteCreation started");
		prodSpec=adcommerce.ClickQuoteManager()
//		  extendLogger.test.get().info( MediaEntityBuilder.
//				  createScreenCaptureFromPath(df.getScreenshot("newQuote"), "QuoteCreation").build());

		.newTransactionbttn().transactionSection().addLineItem().selectModel().createNew();
	}
	@DataProvider

    public Object[][] productSpectionData() {

        return ExcelUtil.getTestData(AppConstants.AD_New_Quote_Tran);

    }  
	
	@Test(dataProvider = "productSpectionData",priority = 3)
	public void productSpectionTest(String CustomerName) {
		System.out.println(CustomerName);
		variabledata = prodSpec.productSpecificationheader(CustomerName).productSpecification()
				.productSpecificationNotes(CustomerName);
	}

	@Test(priority = 4)
	public void variableDataTest() {
		variabledata.SelectInputFields().configure_Fiber_Module_section().configure_CareModule_section().selectLayoutField()
				.languageTranslationDetailsSection().build_Fiber_Content_Section()
				.build_Care_Instructions_section()
				.variable_Data_Input_Entry();

	}
}
