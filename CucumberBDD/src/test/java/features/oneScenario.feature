Feature: Validate create account of Facebook

Scenario: Validate first name field
Given User opens Facebook login page
When User enters first name
Then User checks first name
Then Close browser