package com.test.apidemo.app.screens;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

@Component
@Scope("cucumber-glue")
public class MainScreen extends AbstractScreen {

	@AndroidFindBy(id = "com.loginmodule.learning:id/textViewLinkRegister")
	private WebElement sigupForanAccountElement;

	@AndroidFindBy(id = "com.google.android.gms:id/cancel")
	private WebElement googleCancelButton;

	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement packageInstallerAllow;

	WebDriverWait wait = new WebDriverWait(driver, 5);

	@Autowired
	public MainScreen(AppiumDriver<? extends MobileElement> driver) {
		super(driver);

	}

	public void clickOnSigupForAccount() {
		wait.until(ExpectedConditions.visibilityOf(sigupForanAccountElement));
		sigupForanAccountElement.click();
	}

	public void clickOnGoogleCancel() {
		wait.until(ExpectedConditions.visibilityOf(googleCancelButton));
		googleCancelButton.click();
	}

	public void clickOnPacjageAllow() {
		wait.until(ExpectedConditions.visibilityOf(packageInstallerAllow));
		packageInstallerAllow.click();
	}
}
