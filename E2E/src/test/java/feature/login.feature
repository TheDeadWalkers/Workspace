Feature: Login user

Scenario: Open login page and login

Given username and password
When landed on login page
Then login successful
And print hello