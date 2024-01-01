package com.luxequality.cucumber_selenium_maven_java.pages;

import com.luxequality.cucumber_selenium_maven_java.steps.Hooks;

public class BasePage extends Hooks {
    public static final String baseUrl = System.getProperty("BASE_URL");

    /**
     * Open baseUrl
     */
    public void open() {
        driver.navigate().to(baseUrl);
    }

    /**
     * Open page
     */
    public void open(String path) {
        driver.navigate().to(baseUrl + "/" + path);
    }
}
