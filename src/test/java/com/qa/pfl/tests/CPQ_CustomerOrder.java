package com.qa.pfl.tests;

import org.testng.annotations.Test;


import com.qa.pfl.base.BaseTest;

public class CPQ_CustomerOrder extends BaseTest {
	@Test(priority = 1)
	public void loginTest() {
		adcommerce = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority = 2)
	public void searchForExistingQuote() {
		openexQuote = adcommerce.ClickQuoteManager().ClickSearch();
	}

	@Test(priority = 3)
	public void opentheExistingQoute() {
		customerorder = openexQuote.OpenPFLCustomerOrder();
	}

	@Test(priority = 4)
	public void customerOrder() {
		vdco = customerorder.CopycustomerOrder().Saveorder().Click_ConfigureButton();
	}

	@Test(priority = 5)
	public void vdConfiguration() {
		customerorder=vdco.build_Fiber_Content_Section()
				.build_Care_Instructions_section()
				.variable_Data_Input_Entry()
				.Add_To_Transaction();

	}
	@Test(priority = 6)
	public void  shipAndBill() { 
		customerorder.Billing_To_Details().Shipping_To_Details().Submit_The_Order().ERP_Orderno();
	}

}
