Feature:Verify the booking room functionality in Adactin Hotel Application
Scenario Outline:Verify the booking room functionality for valid username and valid password
Given User is on Adactin application login page
Given user enters "<username>" and "<password>"
And click login button
When User enter the location "<location>" and  "<hotel>"
When User enter the rooms "<room type>" and "<number of rooms>"
When User enter the no of pers "<adult per room>" and "<children per room>"
When User click the search box
And Select checkbox  and continue with login button
Given User is on book a hotel page
When User enter the "<first name>" , "<last name>","<billing address>" and "<credit card number>" 
When User enter the account "<credit card type>","<expiry date>" ,"<expiry year>"and "<cvv number>" 
When User click the book now button
Then Booking order number is dispalyed
Examples:
|username         |password   |location|hotel      |room type|number of rooms|adult per room|children per room|first name|last name|billing address|credit card number       |credit card type|expiry date|expiry year|cvv number|
|NAVEENREDMINOTE10|Adactin@123|Sydney  |Hotel Creek|Standard |1 - One        |1 - One       |1 - One          |Naveen    |Athithan |16 EAST STREET chennai|0123456789012345  |American Express|December   |2022       |123       |