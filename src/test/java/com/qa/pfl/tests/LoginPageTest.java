package com.qa.pfl.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pfl.base.BaseTest;
import com.qa.pfl.constants.AppConstants;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("EPIC - 1414 : Design of the login page for the open cart application")
@Story("US - 14 : Implementation of login page feature for the open cart application")
public class LoginPageTest extends BaseTest {
	@Description("Login Page title test")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 1)
	public void loginPageTitleTest() {

		String actTitle = loginpage.getLoginPageTitle();
		Assert.assertEquals(actTitle, AppConstants.LOGIN_PAGE_TITLE);
	}

	@Description("Check user is able to login to the application with correct user name and correct password")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 1)
	public void loginTest() {
	

		loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

}
