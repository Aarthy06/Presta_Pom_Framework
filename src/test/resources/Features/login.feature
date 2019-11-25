Feature: Test Prestashop website login smoke scenario

Scenario: Test login with valid credentials
Given Open Firefox and start application
When I enter valid username and password
Then user able to login successfully 
Then close the browser