Feature:Verify the functionality DemoQA registeration form
@Regression
Scenario: Verify the functionality of registeration with valid username and valid password
Given User in DemoQA login page
When User enter the valid firstname and valid lastname
When User enter the valid email and Address
When User enter the valid phone number
When User enter the valid Hobbies and Gender
When User enter the valid Skillset
When User enter the valid Date of birth
When User enter the valid password and confirm password
And User click the login button
Then Successful message is dispalyed
@Smoke
Scenario: Verify the functionality of registeration with valid username and valid password
Given User in DemoQA login page
When User enter the valid firstname and valid lastname
When User enter the valid email and Address
When User enter the valid phone number
When User enter the valid Hobbies and Gender
When User enter the valid Skillset
When User enter the valid Date of birth
When User enter the valid password and confirm password
And User click the login button
Then Successful message is dispalyed
