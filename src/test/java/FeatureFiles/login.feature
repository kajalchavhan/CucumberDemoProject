Feature: Applicatin login

Background: User is Logged In
	Given I navigate to the login page
	
Scenario Outline: Salesforce application login

Given initialize the browser
When user navigates to "https://login.salesforce.com/?locale=in"
And entre <username> and <password>
And click on login
Then user user should be able to login

Examples:
|username|password|
|test12|Secure@123|
|test45|Secure@456|
|Kajal67|Kajal@123|
