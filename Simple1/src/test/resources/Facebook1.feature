Feature:Verify the login FB
Scenario: verify login with valid and unvlaid
Given User in fb
When user enter pwd
Then error page is 