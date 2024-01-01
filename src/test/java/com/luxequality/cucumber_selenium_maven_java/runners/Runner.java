package com.luxequality.cucumber_selenium_maven_java.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/features", glue = "com.luxequality.cucumber_selenium_maven_java.steps", plugin = {
                "pretty",
                "html:target/cucumber.html",
                "rerun:target/failed.txt"
})

public class Runner {
}