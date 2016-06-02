@Regression
Feature: Transfer between accounts

Scenario: Transfer successful
Given user is logged on
	And user has enough money in the source account
When user enters transfer information
	And user selects transfer
Then money is transferred from source account to destination account

Scenario: Transfer unsuccessful
Given user is logged on
	And user does not have enough money in the source account
When user enters transfer information
	And user selects transfer
Then money is not transferred from source account to destination account
	And user is presented with an error
	
Scenario Outline: successful or unsuccessful transfer of funds
Given a "<src_status>" source account number
And a "<dest_status>" destination account number
And with "<balance_status>" balance
Then the transfer will be "<transfer_status>"

#If you use Examples, you always use Scenario Outline, not Scenario
Examples:
|src_status|dest_status|balance_status|transfer_status|
|valid     |valid      |sufficient    |successful     |
|valid     |invalid    |sufficient    |unsuccessful   |
|valid     |valid      |insufficient  |unsuccessful   |
|valid     |invalid    |insufficient  |unsuccessful   |
|invalid   |valid      |sufficient    |unsuccessful   |
|invalid   |invalid    |sufficient    |unsuccessful   |
|invalid   |valid      |insufficient  |unsuccessful   |
|invalid   |invalid    |insufficient  |unsuccessful   |