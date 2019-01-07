Feature: DataTable scenario

Background: Common login steps
Given User opens Facebook login page

Scenario Outline: Validate create user multiple fields
When User enters user "<firstName>" first name
And User enters user "<lastName>" lastname
Then User checks "<firstName>" first name
And Validate "<lastName>" last name
Then User enters "<Email>" address 
Then User checks "<Email>" address 
Then Close browser

Examples:
	| firstName | lastName | Email |
	| tester1	| tester1  | tester1@email.com |
	| tester2	| tester2  | tester2@email.com |
	| tester3	| tester3  | tester3@email.com |
	| tester4	| tester4  | tester4@email.com |
	| tester5	| tester5  | tester5@email.com |