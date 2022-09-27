package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
//	@Before("@SmokeTest")
//	public  void setupSmokeTest() {
//		System.out.println("Setup SmokeTest .......");
//	}
//	
//	@Before("@RegressionTest")
//	public  void setupRegTest() {
//		System.out.println("Setup RegressionTest .......");
//	}
	
	
	@Before(value="@SmokeTest", order=1)
	public void readFromSmokeProperty() {
		System.out.println("Read from Smoke Property file......");
	}
	
	@Before(value="@SmokeTest", order=2)
	public void setupSmokeDB() {
		System.out.println("Setup Smoke DB......");
	}
	
	@Before(value="@RegressionTest", order=1)
	public void readFromRegProperty() {
		System.out.println("Read from Reg Property file......");
	}
	
	@Before(value="@RegressionTest", order=2)
	public void setupRegDB() {
		System.out.println("Setup Reg DB......");
	}
	
	
	@Given("User is logged in")
	public void user_is_logged_in() {
	    System.out.println("User is logged in");
	}
	@When("User update a Tasks")
	public void user_update_a_tasks() {
	    System.out.println("User update a Tasks");
	}
	
	@When("User view Tasks")
	public void user_view_tasks() {
	  System.out.println("User view Tasks");
	}
	
	@When("User creates a contact")
	public void user_creates_a_contact() {
		System.out.println("User creates a contact");
	}
	
	@When("User delete contact")
	public void user_delete_contact() {
		System.out.println("User delete contact");
	}
	
	@When("User update a Deals")
	public void user_update_a_deals() {
	    System.out.println("User update a Deals");
	}
	
	@When("User view Deals")
	public void user_view_deals() {
		System.out.println("User view Deals");
	}

	@When("User creates a Deals")
	public void user_creates_a_deals() {
	   System.out.println("User creates a Deals");
	}
	
	@When("User delete Deals")
	public void user_delete_deals() {
		System.out.println("User delete Deals");
	}
	
	@When("User creates a Tasks")
	public void user_creates_a_tasks() {
	   System.out.println("User creates a Tasks");
	}
	
	@When("User delete Tasks")
	public void user_delete_tasks() {
	   
	}
	
	@When("User update a contact")
	public void user_update_a_contact() {
	    System.out.println("User update a contact");
	}
	
	@When("User view contact")
	public void user_view_contact() {
	  System.out.println("User view contact");
	}
}
