package com.test.stepdefs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.steps.MainScreenSteps;
import com.test.steps.SignupSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SigupStepDef {
    @Autowired
    private MainScreenSteps mainScreenSteps;
    
    @Autowired
    private SignupSteps signupSteps;
    
    
    @Given("^I navigate to signup page$")
    public void navigateToSigupPage()
    {
    	mainScreenSteps.getToSigupPage();
    }
    
    @When("^I enter signup detail$")
    public void enterSigupDetails(DataTable dt)
    {
    	
    	List<String> list = dt.asList(String.class);
    	
    	System.out.println(dt);
    	signupSteps.enterSigupDetails(list.get(0).trim(), list.get(1).trim(), list.get(2).trim());
    }
    
    @And("^I click on createmyaccount$")
    public void clickCreateAccount()
    {
    	signupSteps.clickCreateAccount();
    }

    
    @Then("^User should be signedup$")
    public void isRegistrationSucess()
    {
    	  Assert.assertTrue(signupSteps.isRegrationSucess());
    }
    @And("^I navigate to login page from sigup page$")
    public void navigateToLoginPage()
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	signupSteps.clickLoginLink();
    }
}
