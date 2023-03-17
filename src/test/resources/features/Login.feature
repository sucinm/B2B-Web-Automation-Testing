@Login
Feature: Login

  Scenario: Login user with valid email & password
    Given User already in login page
    When User input valid email and as password
    And User clicked login button
    Then User will see homepage