Feature: Login Feature

  Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    When User enters valid "testexample@gmail.com" and "hi"
    And User clicks on login button
    Then User is redirected to the Home Page
