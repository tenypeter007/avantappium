package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class HomeScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.loginmodule.learning:id/recyclerViewUsers")
    private WebElement homePageElement;

    @Autowired
    public HomeScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public boolean isLoggedIn() {
       boolean flag= false;
       if (homePageElement.isDisplayed())
    	   flag= true;
       return flag;
    }
}
