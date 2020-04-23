package com.test.stepdefs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.steps.HomeScreenSteps;
import com.test.steps.LoginScreenSteps;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDef {
   
    
    @Autowired
    private LoginScreenSteps loginstep;
    
    @Autowired
    private HomeScreenSteps homeStep;
    
    @Given("^I Open the app$")
    public void openApp()
    {
    ;
    }
    
    @When("^I enter login details$")
   
    public void enterLoginDetails(DataTable dt)
    {
    	List<String> list = dt.asList(String.class);
    	loginstep.enterLoginDetails(list.get(0).trim(), list.get(1).trim());
    }
    
    @And("^I click on login$")
    public void clickLogin()
    {
    	loginstep.clickLogin();
    }

    
    @Then("^I should see homepage$")
    public void isHomePageDisplayed()
    {
    	  Assert.assertTrue(homeStep.isLoggedIn());
    }
}
