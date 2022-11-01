Feature:Verify login functionality in Facebook Application
Scenario Outline:Verify login functionality for valid username and valid password
Given User in on Facebook login page
When User enters the valid "<username>" and valid "<password>"
And User click the login button
Then Successful page is displayed

Examples:
|username|password|
|user1   |pass1   |
|user2   |pass2   |
|user3   |pass3   |
