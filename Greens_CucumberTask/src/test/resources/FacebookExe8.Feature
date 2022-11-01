Feature:Verify login functionality in Facebook Application
@Regression
Scenario:Verify login functionality for valid username and valid password
Given User in on Facebook login page
When User enters the valid username and valid password
And User click the login button
Then Successful page is displayed

@Smoke
Scenario:Verify login functionality for valid username and valid password
Given User in on Facebook login page
When User enters the valid username and valid password
And User click the login button
Then Successful page is displayed

@Sanity
Scenario:Verify login functionality for valid username and valid password
Given User in on Facebook login page
When User enters the valid username and valid password
And User click the login button
Then Successful page is displayed
Then Successful tags completed