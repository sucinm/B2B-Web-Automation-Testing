Feature: Register
  As a user i want to register to Ralali Marketplace

  Scenario: Register user with valid data
    Given User already in register page
    And User fill all the required fields
    When User click register
    Then Modal verification email is appear
