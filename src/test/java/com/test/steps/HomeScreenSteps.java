package com.test.steps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class HomeScreenSteps extends AbstractSteps {
    public boolean isLoggedIn() {
      return homeScreen.isLoggedIn();
    }
}
