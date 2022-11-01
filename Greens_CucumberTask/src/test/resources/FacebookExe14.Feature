Feature:Verify login registeration functionality in Facebook Application
Scenario:Verify login functionality for valid username and valid password
Given User in on Facebook create login page for create new account
When User enters the valid username and last name
When User enters the valid email address and New password
When User click the date of birth
When User click the gender type
And User click the signup button
Then Facebook Account createSuccessful 