@timesheets
Feature:This feature is to get pending timesheet
Scenario:This test is to verify the pending timesheet
Given the user is on the home page
When the user clicks on the time option from menu
And the user enter the name "John Smith"
And Clicks on the view button
Then the user should see the message "<message>"
