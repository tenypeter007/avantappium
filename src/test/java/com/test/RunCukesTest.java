package com.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/cucumber.json", features = {
		"src/test/resources/features/avant.feature", }, glue = "com.test.stepdefs")
public class RunCukesTest {

	private static AppiumDriverLocalService service;

	@BeforeClass
	public static void startAppium() {

		service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(4723));
		service.start();
	}
	
	@AfterClass
	public static void stopAppium() {
		service.stop();
	}
}
