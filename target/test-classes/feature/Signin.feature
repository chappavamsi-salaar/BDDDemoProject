Feature: Login Function
Scenario Outline: Login Functionality with different user types
Given the user navigates to the login page
When I enter "<username>" and "<password>"
Then the login result should be "<url>"

Examples:
| username         | password       | url                                       |
| standard_user    | secret_sauce  | https://www.saucedemo.com/inventory.html  |
| standard_user    | 123456789	   | https://www.saucedemo.com/                |