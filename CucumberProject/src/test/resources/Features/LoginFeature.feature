Feature: Test the login functionality of OrangeHRM

Scenario: Test the valid login

Given user is on login page
When user enters username and password
And clicks on login button
Then user should land on homepage