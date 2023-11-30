Feature: Test the login functionality of OrangeHRM2

Scenario: Test the valid login

Given user is on login page
When user enters username and password
And clicks on login button
Then user should land on homepage

Scenario: Test the valid login2

Given user is on login page
When user enters username and password
And clicks on login button
Then user should land on homepage