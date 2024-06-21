Feature: Login page automation of demo application
Scenario Outline: login is successful with valid cread
Given User is on login page
When user enter valid "<username>" and "<password>"
And click on login button
Then User is navigated to home page
And close the browser

Examples:
| username | password |
| somjit.ch2000@gmail.com | Sharmi@123 |

