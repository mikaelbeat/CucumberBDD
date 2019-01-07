Feature: Multiple feature fields scenario, feature file for demo site
As a user you need to validate first and last name

Scenario: Check first and last name
Given User need to be on demo site
When User enters first name
When User enters last name
Then Close browser3
