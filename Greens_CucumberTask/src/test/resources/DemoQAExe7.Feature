Feature:Verify the functionality DemoQA registeration form
Scenario Outline: Verify the functionality of registeration with valid username and valid password
Given User in DemoQA login page
When User enter the valid "<firstname>" and "<valid lastname>"
When User enter the valid email "<email>" and "<Address>"
When User enter the valid phone "<phone number>"
When User enter the valid Hobbies and Gender
When User enter the valid Skillset
When User enter the valid Date of birth
When User enter the valid pass "<password>" and "<confirm password>"
And User click the login button
Then Successful message is dispalyed

Examples:
|firstname|valid lastname|email        |Address                         |phone number|password|confirm password|
|Testiname|testi_lastname|abc@gmail.com|chennai-600097,omr,throaipalkkam|738748478473|12345667|1246868476486476|