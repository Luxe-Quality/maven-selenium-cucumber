package com.luxequality.cucumber_selenium_maven_java.helper;

import com.luxequality.cucumber_selenium_maven_java.pages.*;

public class PageInitializer {
    public static LoginPage loginPage;
    public static InventoryPage inventoryPage;

    /**
     * Initialize pages
     */
    public static void initializePages() {
        loginPage = new LoginPage();
        inventoryPage = new InventoryPage();

    }
}