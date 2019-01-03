Feature: Validate create account of Facebook

Background: Common login steps
Given User opens Facebook login page

Scenario: Validate first name field
When User enters user "firstName" first name
Then User checks "firstName" first name
Then Close browser

Scenario: Validate create user multiple fields
When User enters user "firstName" first name
And User enters user "lastName" lastname
Then User checks "firstName" first name
And Validate "lastName" last name
But User mobile field should be blank
Then Close browser

