Feature: Signup
	This Feature is for sigup 
	
	@signup
	Scenario: Verify user is able to signup
	Given I navigate to signup page 
	When I enter signup detail 
			| testuser| Test@123 |test1@gmail.com|
	And I click on createmyaccount 
	Then User should be signedup
	
	@login
	Scenario: Verify user is able to login
	Given I navigate to signup page 
	When I enter signup detail 
		| avant| Test@123 |avanttest123@gmail.com|
	And I click on createmyaccount 
	And I navigate to login page from sigup page 
	And I enter login details
			|avanttest123@gmail.com| Test@123 |
	And I click on login 
	Then I should see homepage
	
	
