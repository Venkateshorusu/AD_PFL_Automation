package com.qa.pfl.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;
import com.qa.pfl.constants.AppConstants;

import io.qameta.allure.Step;

public class LoginPage {

	// page changing model

	private WebDriver driver;
	private ElementUtil eleutil;
	private By login = By.xpath("//a[text()='Login']");
	private By userName = By.id("username");
	private By password = By.id("psword");
	private By loginBtn = By.id("log_in");
	private By forgotPwdLink = By.linkText("Forgot password?");
	 

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}

	@Step("Login to application username : {0} and password : {1}")
	public ADCommercePage doLogin(String username, String pwd) {

		System.out.println("Application Credentials: " + username + ":" + pwd);
		eleutil.waitForElementAndClick(login, 20, 2);
//		eleutil.doClick(login);
		eleutil.waitForElementVisible(userName, AppConstants.LONG_TIME_OUT).sendKeys(username);
		eleutil.waitForElementVisible(password, AppConstants.SHORT_TIME_OUT).sendKeys(pwd);
		eleutil.doClick(loginBtn);
		return new ADCommercePage(driver);
  
	}

	@Step("....Getting login page title...")
	public String getLoginPageTitle() {

		String title = eleutil.waitForTitleIs(AppConstants.LOGIN_PAGE_TITLE, AppConstants.SHORT_TIME_OUT);
		System.out.println("Login Page Title is :" + title);
		return title;
	}

	
 

}
