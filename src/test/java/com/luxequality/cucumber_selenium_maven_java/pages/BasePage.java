package com.luxequality.cucumber_selenium_maven_java.pages;

import com.luxequality.cucumber_selenium_maven_java.helper.CommonMethods;

public class BasePage extends CommonMethods {
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
