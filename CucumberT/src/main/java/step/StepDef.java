package step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	@Given("^I want to login facebook$")
	public void i_want_to_login_facebook()  {
	    System.out.println("A");
	}

	@When("^I entered ID and Password$")
	public void i_entered_ID_and_Password()  {
		 System.out.println("B");
	}

	@Then("^Login Successfully$")
	public void login_Successfully()  {
		 System.out.println("C");
	}

}
