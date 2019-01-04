Feature: Validate create account of Facebook

Scenario: Validate first name field
Given User opens Facebook login page
When User enters user "firstName" first name
Then User checks "firstName" first name
Then Close browser