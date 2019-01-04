Feature: Validate create account of Facebook

Background: Common login steps
Given User opens Facebook login page

@Smoke
Scenario: Validate first name field - 1
When User enters user "firstName" first name
Then User checks "firstName" first name
Then Close browser

@Smoke @Regression
Scenario: Validate first name field- 2
When User enters user "firstName" first name
Then User checks "firstName" first name
Then Close browser


Scenario: Validate first name field - 3
When User enters user "firstName" first name
Then User checks "firstName" first name
Then Close browser

@Regression
Scenario: Validate first name field- 4
When User enters user "firstName" first name
Then User checks "firstName" first name
Then Close browser

@Smoke
Scenario: Validate first name field - 5
When User enters user "firstName" first name
Then User checks "firstName" first name
Then Close browser

