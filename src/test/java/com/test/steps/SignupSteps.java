package com.test.steps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class SignupSteps extends AbstractSteps {
	
	   public void enterSigupDetails(String name, String pwd,String email ) {
		   signupscreen.enterUserName(name);
		   signupscreen.enterEmail(email);
		   signupscreen.enterPassword(pwd);
		   signupscreen.enterConfirmPassword(pwd);
		  
	    }
	   
	   public void clickCreateAccount()
	   {
		   signupscreen.clickCreateAccount();
	   }

	   public boolean isRegrationSucess()
	   {
		   return signupscreen.isRegistrationSuccesfull();
	   }
	   
	   public void clickLoginLink()
	   {
		   signupscreen.clickLoginLink();
	   }
}
