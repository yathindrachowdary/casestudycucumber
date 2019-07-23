Feature: Signup
Scenario: Signup in testme 
	Given user want to signup in testme app 
	When user opens the testme app using url
	Then click on the signup button
	And  fill the required fields 
	 | username | firstname | lastname | password | conform password | gender | e-mail | mobile number | dob |address | answer |
	 | yathindra56 | yathindra | chowdary | lokesh | lokesh | m | tyc@gmail.com | 1234569871 | 06/20/1998 | chennai,omr,city | land |
	
	Then click on registration button
