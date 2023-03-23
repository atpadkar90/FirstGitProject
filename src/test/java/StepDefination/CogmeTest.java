package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CogmeTest {
	
	@Given("user open blank browser")
	public void user_open_blank_browser() {
		 System.out.println("*****************");
		System.out.println("Blank brower");
	    
	   
	}
	
	@When("user is on google page")
	public void user_is_on_google_page() {
		
		System.out.println("Google Page");
	    
	}
	@Then("validate google home page title")
	public void validate_google_home_page_title() {
	    
		System.out.println("Google Home Page");
	}
	@When("user is on facebook page")
	public void user_is_on_facebook_page() {
	
		System.out.println("Facebook Page");
	}
	
	@Then("validate facebook Login page title")
	public void validate_facebook_login_page_title() {
		System.out.println("Facebook loig Page");
	}

	@When("user is on Orange HRM")
	public void user_is_on_orange_hrm() {
		System.out.println("Orange Page");
	}
	@Then("validate Orange HRM Login Page title")
	public void validate_orange_hrm_login_page_title() {
		System.out.println("Orange login Page");
	}


}
