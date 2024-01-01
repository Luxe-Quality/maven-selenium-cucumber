package com.luxequality.cucumber_selenium_maven_java.steps;

import com.luxequality.cucumber_selenium_maven_java.helper.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {
    @Given("user opens the Login page")
    public static void userOpensLoginPage() {
        loginPage.open();
    }

    @When("user enters {string} into the Username login field")
    public static void userEnterUsername(String username) {
        loginPage.inputUsername().sendKeys(username);
    }

    @When("user enters {string} into the Password login field")
    public static void userEnterPassword(String password) {
        loginPage.inputPassword().sendKeys(password);
    }

    @When("user clicks the Login button")
    public static void userClicksLoginBtn() {
        loginPage.btnLogin().click();
    }
}
