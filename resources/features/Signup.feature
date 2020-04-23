Feature: Signup
	This Feature is for sigup 
	
	Scenario: Verify user is able to signup
	Given I navigate to signup page 
	When I enter signup detail
| test| Test@123 |test@gmail.com|
	And I click on createmyaccount 
	Then User should be signedup
	


