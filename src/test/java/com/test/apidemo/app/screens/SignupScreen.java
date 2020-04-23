package com.test.apidemo.app.screens;

import org.openqa.selenium.WebElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;

@Component
@Scope("cucumber-glue")

public class SignupScreen extends AbstractScreen {

	@AndroidFindBy(id = "com.loginmodule.learning:id/textInputEditTextName")
	private WebElement userName;

	@AndroidFindBy(id = "com.loginmodule.learning:id/textInputEditTextPassword")
	private WebElement passWord;

	@AndroidFindBy(id = "com.loginmodule.learning:id/textInputEditTextConfirmPassword")
	private WebElement confirmPassWord;

	@AndroidFindBy(id = "com.loginmodule.learning:id/textInputEditTextEmail")
	private WebElement emailElement;

	@AndroidFindBy(id = "com.loginmodule.learning:id/appCompatButtonRegister")
	private WebElement createAccountButton;

	@AndroidFindBy(id = "com.loginmodule.learning:id/snackbar_text")
	private WebElement registrationSuccessBanner;

	@AndroidFindBy(id = "com.loginmodule.learning:id/appCompatTextViewLoginLink")
	private WebElement loginLink;

	@Autowired
	public SignupScreen(AppiumDriver<? extends MobileElement> driver) {
		super(driver);
	}

	public void enterUserName(String username) {
		userName.sendKeys(username);
	}

	public void clickLoginLink() {
		new TouchAction(driver).press(115, 650).waitAction(2000).moveTo(115, 350).release().perform();
		loginLink.click();
	}

	public void enterPassword(String pwd) {
		passWord.sendKeys(pwd);
	}

	public void enterConfirmPassword(String pwd) {
		confirmPassWord.sendKeys(pwd);
	}

	public void enterEmail(String email) {
		emailElement.sendKeys(email);
	}

	public void clickCreateAccount() {
		new TouchAction(driver).press(115, 650).waitAction(2000).moveTo(115, 350).release().perform();
		createAccountButton.click();
	}

	public boolean isRegistrationSuccesfull() {

		boolean flag = false;
		String message = registrationSuccessBanner.getText();
		if (message.equals("Registration Successful"))
			;
		{
			flag = true;
		}
		return flag;

	}
}
