Feature: Login

Scenario: Login using uname and password
    Given Login id and password
    When i landed on login page
    Then user should logged in