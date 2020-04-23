package com.test.steps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("cucumber-glue")
public class LoginScreenSteps extends AbstractSteps {
    public void enterLoginDetails(String email, String pwd) {
        loginScreen.enterEmail(email);
        loginScreen.enterPassword(pwd);
        
    }
    
    public void clickLogin()
    {
    	loginScreen.clickLogin();
    }
}
