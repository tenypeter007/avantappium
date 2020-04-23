# avantappium
This is a sample appium project for android 

## Getting Started 

1. Install node js https://nodejs.org/en/download/
2. Install appium globally
*npm i -g appium*
3. Clone the repo
4. Change the device capabilities accordingly in config_apidemo_test_app.properties 
5. Resolve maven dependencies 

## Run

1. *mvn clean install test* for  running all scenarios 
2. *mvn clean test  -Dcucumber.options="--tags @login"*  for running specific scenarios 

## Report

Once execution is completed default cucumber report will be generated inside target/cucumber-html-reports

## Note 

1. Scenario 1 is sample sigup scenario with sample android app
2. Scenario 2 is login testcase after performing signup( since the sample app will not store the registered user once user exits the app , hence siging in before performing a login)
3. No need to run appium server prior to running the script. Appium service builder will automatically start a appium server at port 4723.


