Feature: This is the background demo

Background: user is login to the netflix app
Given User is on netflix login page
When user enter valid username and password
And Click on login button

Scenario: Test enlisted profile in netflix
Then user should abale to see the user profile made on netflix
And Click on a perticular user profile

Scenario: Enter in a perticular user profile
Then user should abale to enter home page
Then user should navigate to the movie section

