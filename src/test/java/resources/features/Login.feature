@login @regression
Feature: Login

    Suite with sceanrios for testing the Login page

    Background:
        Given user opens the Login page

    @smoke
    Scenario: Valid login with the standart user
        When user enters "standard_user" into the Username login field
        And user enters "secret_sauce" into the Password login field
        And user clicks the Login button
        Then user should be redirected to the Inventory page