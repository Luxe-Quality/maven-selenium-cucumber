# Maven Selenium Cucumber

The Maven Selenium Cucumber template project.

# Preconditions

1. Install JAVA;
2. Add java path to JAVA_HOME;
3. Install Maven;
4. Add maven path to MAVEN_HOME;
5. Install any code editor.

# Steps to run

Run the command below

```
mvn test
```

# Report

The report is generated in the file `target/surefire-reports/cucumber.html`.

# CI

Testing runs daily at 6am in GitHub actions and deploys a report in the [report](https://github.com/Luxe-Quality/maven-selenium-cucumber/tree/report) branch.

Report link: https://luxe-quality.github.io/maven-selenium-cucumber/