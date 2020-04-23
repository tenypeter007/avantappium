package com.test.steps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class MainScreenSteps extends AbstractSteps{
	   public void getToSigupPage() {
	        mainScreen.clickOnSigupForAccount();
	       
	    }
}
