package com.luxequality.cucumber_selenium_maven_java.steps;

import com.luxequality.cucumber_selenium_maven_java.helper.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {

    @Before
    public void setup(Scenario scenario) {
        exe(scenario);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
