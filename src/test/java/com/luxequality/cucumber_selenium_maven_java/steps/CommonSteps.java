package com.luxequality.cucumber_selenium_maven_java.steps;

import com.luxequality.cucumber_selenium_maven_java.helper.CommonMethods;

import io.cucumber.java.en.When;

public class CommonSteps extends CommonMethods {
    @When("user refresh page")
    public static void userRefreshPage() {
        driver.navigate().refresh();
    }
}
