@Login
Feature: Login
  As a user i want to login to GuruMu website


  Scenario: Login user with valid email & password
    Given User already in login page
    When User input "sucinascaisar@gmail.com" as email and input "Suci!xx1" as password
    And User clicked login button
    Then User will see homepage