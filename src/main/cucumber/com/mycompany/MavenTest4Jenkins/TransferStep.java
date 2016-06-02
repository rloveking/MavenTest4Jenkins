package com.mycompany.MavenTest4Jenkins;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TransferStep {
	@Given("^user is logged on$")
	public void user_is_logged_on() throws Throwable {
		System.out.println("user is logged on");
	}

	@Given("^user has enough money in the source account$")
	public void user_has_enough_money_in_the_source_account() throws Throwable {
		System.out.println("user has enough money in the source account");
	}

	@When("^user enters transfer information$")
	public void user_enters_transfer_information() throws Throwable {
		System.out.println("user enters transfer information");
	}

	@When("^user selects transfer$")
	public void user_selects_transfer() throws Throwable {
		System.out.println("user selects transfer");
	}

	@Then("^money is transferred from source account to destination account$")
	public void money_is_transferred_from_source_account_to_destination_account() throws Throwable {
		System.out.println("money is transferred from source account to destination account");
	}

	@Given("^user does not have enough money in the source account$")
	public void user_does_not_have_enough_money_in_the_source_account() throws Throwable {
		System.out.println("user does not have enough money in the source account");
	}

	@Then("^money is not transferred from source account to destination account$")
	public void money_is_not_transferred_from_source_account_to_destination_account() throws Throwable {
		System.out.println("money is not transferred from source account to destination account");
	}

	@Then("^user is presented with an error$")
	public void user_is_presented_with_an_error() throws Throwable {
		System.out.println("user is presented with an error");
	}
	
	@Given("^a \"([^\"]*)\" source account number$")
	public void a_source_account_number(String arg1) throws Throwable {
	    
	}

	@Given("^a \"([^\"]*)\" destination account number$")
	public void a_destination_account_number(String arg1) throws Throwable {
	    
	}

	@Given("^with \"([^\"]*)\" balance$")
	public void with_balance(String arg1) throws Throwable {
	    
	}

	@Then("^the transfer will be \"([^\"]*)\"$")
	public void the_transfer_will_be(String arg1) throws Throwable {
	    
	}
}