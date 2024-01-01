package com.luxequality.cucumber_selenium_maven_java.steps;

import com.luxequality.cucumber_selenium_maven_java.helper.CommonMethods;

import io.cucumber.java.en.Then;


public class InventorySteps extends CommonMethods {
    @Then("user should be redirected to the Inventory page")
    public void userRedirectedToInventoryPage() {
        waitForVisibility(inventoryPage.btnExtendSidebarMenu());
    }
}
