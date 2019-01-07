Feature: Hooks scenarios

Scenario: Validate first name field
Given User opens Facebook login page
When User enters user "firstName" first name
Then User checks "firstName" first name

Scenario: Validate create user multiple fields
Given User opens Facebook login page
When User enters user "firstName" first name
And User enters user "lastName" lastname
Then User checks "firstName" first name
And Validate "lastName" last name
But User mobile field should be blank

