Feature: Buy a one way trip from IAD to Seattle SEA 

Background: 
	Given user is at Make My Trip homepage. 
	
Scenario: user buys ticket from IAD to SEA in Rupees 
	When user clicks on flights and chooses time, date, departure for flight 
	And user chooses a flight 
	And user enters passanger info 
	And user enters payment info 
	Then user gets failure message 
	
Scenario: user buys ticket from IAD to SEA in dollars 
	When user switches to USD currency 
	And after user clicks on flights and chooses time, date, departure for flight 
	Then no flights are available