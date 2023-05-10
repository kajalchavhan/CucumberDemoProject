Feature: Applicatin signup

Scenario: Salesforce application signup

Given the saleforce home page
When user navigates to homepage "https://login.salesforce.com/?locale=in"
And click on tryforfree
And first entre employee firstname and lastname then entre email
And select jobtitle
And entre company Name 
Then select employee and entre phoneno
Then select company country
