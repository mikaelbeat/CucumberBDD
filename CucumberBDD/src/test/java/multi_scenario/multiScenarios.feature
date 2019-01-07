Feature: Multiple feature fields scenario, feature file for Facebook

Scenario: Validate first name field
Given User opens Facebook login page
When User enters user "firstName" first name
Then User checks "firstName" first name
Then Close browser

Scenario: Validate create user multiple fields
Given User opens Facebook login page
When User enters user "firstName" first name
And User enters user "lastName" lastname
Then User checks "firstName" first name
And Validate "lastName" last name
Then User mobile field should be blank
Then Close browser

