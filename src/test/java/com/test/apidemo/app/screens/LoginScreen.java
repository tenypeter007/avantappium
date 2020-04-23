package com.test.apidemo.app.screens;

import org.openqa.selenium.WebElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

@Component
@Scope("cucumber-glue")

public class LoginScreen extends AbstractScreen {

	@AndroidFindBy(id = "com.loginmodule.learning:id/textInputEditTextEmail")
	private WebElement emailElement;

	@AndroidFindBy(id = "com.loginmodule.learning:id/textInputEditTextPassword")
	private WebElement passWord;

	@AndroidFindBy(id = "com.loginmodule.learning:id/appCompatButtonLogin")
	private WebElement loginButton;

	@Autowired
	public LoginScreen(AppiumDriver<? extends MobileElement> driver) {
		super(driver);
	}

	public void enterEmail(String email) {
		emailElement.sendKeys(email);
	}

	public void enterPassword(String pwd) {
		passWord.sendKeys(pwd);
	}

	public void clickLogin() {
		loginButton.click();
	}

	/*
	 * public boolean isRegistrationSuccesfull() {
	 * 
	 * boolean flag= false ; String message =
	 * registrationSuccessBanner.getText(); if
	 * (message.equals("Registration Successful")); { flag = true; } return
	 * flag;
	 * 
	 * }
	 */
}
