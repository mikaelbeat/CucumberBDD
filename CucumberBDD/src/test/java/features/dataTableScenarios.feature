Feature: Validate create account of Facebook

Background: Common login steps
Given User opens Facebook login page

Scenario: Validate create user multiple fields
When Enter test data
	| firstName | lastName | Email |
	| tester1	| tester1  | tester1@email.com |
	| tester2	| tester2  | tester2@email.com |
	| tester3	| tester3  | tester3@email.com |
	| tester4	| tester4  | tester4@email.com |
	| tester5	| tester5  | tester5@email.com |

Then Close browser

