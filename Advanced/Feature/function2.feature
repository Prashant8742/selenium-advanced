Feature:To test the ksrtc application
@openurlandregistration
Scenario:To test the registration page of Ksrtc  
Given open chrome browser and url of the application
When enter User Name and full name and mobile no
Then register Successfully  

@login
Scenario:to test the login page of ksrtc
Given open login page url
When enter username and password and click on login button
Then login Successfully

@search
Scenario:to test bus are find between the given two places
Given open home page url
When enter Leaving from and going to and select Date Of Departure and Date Of Return and click on search button
Then Successfully search the bus
