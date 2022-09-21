@GetCEOName
Feature: This feature is to get the CEO name from the OrangeHRM APP
Scenario:This test is to verify the CEO name
Given the user is logged in successfully and is on Home Page
When the user clicks on the directory option from the Menu bar
And the user select the job title as "CEO" from drop down
And clicks the search button
Then the user shoild see the CEO name as "<CEO_Name>"