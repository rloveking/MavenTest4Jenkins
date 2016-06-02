package com.mycompany.MavenTest4Jenkins;


import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	// Given: launch the application
	// When: user enters valid username and valid password
	// And: clicks on login button
	// Then: the user is logged into the application
	
	//hooks are for everything, not just this feature!
	@Before("@Regression")
	public void doBefore(){
		System.out.println("Running the doBefore() method");
	}
	
	@After("@Regression")
	public void doAfter(){
		System.out.println("Running the doAfter() method");
	}

	@Given("^launch the application$")
	public void launch_the_application() {
		System.out.println("Running: Launch the application");
	}

	@When("^user enters ([a-zA-Z]{1,}) username and ([a-zA-Z]{1,}) password$")
	public void user_enters_valid_username_and_valid_password(String validUsername, 
			String validPassword, DataTable data) {
		List<Map<String, String>> list = data.asMaps(String.class, String.class);
		System.out.println("Running: user enters " + validUsername + " username and " 
				+ validPassword + " password");
		for (Map<String, String> temp : list) {
			System.out.println("UserName: " + temp.get("userName"));
			System.out.println("Password: " + temp.get("password"));
			if (temp.get("level") != null) 
				{System.out.println("Level: " + temp.get("level"));}
		}
	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() {
		System.out.println("Running: clicks on login button");
	}

	@Then("^the user is logged on$")
	public void the_user_is_logged_on() {
		System.out.println("Running: the user is logged on");
	}

	// Given launch the application
	// When user enters invalid username and valid password
	// And clicks on login button
	// Then the user is shown and error
	// And the user is not logged on
	// And the user is given a chance to enter username and password again

	@Then("^the user is shown and error$")
	public void the_user_is_shown_and_error() {
		System.out.println("Running: the user is shown and error");
	}

	@And("^the user is not logged on$")
	public void the_user_is_not_logged_on() {
		System.out.println("Running: the user is not logged on");
	}

	@And("^the user is given a chance to enter username and password again$")
	public void the_user_is_given_a_chance_to_enter_username_and_password_again() {
		System.out.println("Running: the user is given a chance to enter username and password again");
	}
}
