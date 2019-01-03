Feature: Validate create account of Facebook

Scenario: Validate first name field
Given User opens Facebook login page
When User enters first name
Then User checks first name
Then Close browser

Scenario: Validate create user multiple fields
Given User opens Facebook login page
When User enters first name
And User enters lastname
Then User checks first name
And Validate last name
But User mobile field should be blank
Then Close browser

