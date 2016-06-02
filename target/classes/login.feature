@Smoke
Feature: Login to account

Background: launch the application
Given launch the application

Scenario: valid username and password given
When user enters valid username and valid password
#This is called a data table, where we supply the values for the given method
|userName|password|level    |
|scott   |tiger   |developer|
|megg    |lion    |manager  |
	And clicks on login button
Then the user is logged on

Scenario: invalid username and password given
When user enters invalid username and valid password
#This is called a data table, where we supply the values for the given method
|userName|password|
|Hi      |Bye     |
	And clicks on login button
Then the user is shown and error
	And the user is not logged on
	And the user is given a chance to enter username and password again