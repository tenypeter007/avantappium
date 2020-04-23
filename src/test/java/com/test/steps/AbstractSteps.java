package com.test.steps;

import com.test.apidemo.app.screens.*;
import com.test.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractSteps {
    @Autowired
    public AppUtils utils;

 
    @Autowired
    public HomeScreen homeScreen;
   
    @Autowired
    public MainScreen mainScreen;
    
    @Autowired
    public SignupScreen signupscreen;
    @Autowired
    public LoginScreen loginScreen;

}
