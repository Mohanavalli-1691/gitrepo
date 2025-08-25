package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mainsteps {
	@Given("User is on landing Page")
	public void user_is_on_landing_page() {//method name can be anything
	   System.out.println("first");
	}
	@When("user login to application")
	public void user_login_to_application() {
		 System.out.println("2");
	}
	@Then("Home on land page")
	public void home_on_land_page() {
		 System.out.println("3");
	}
	@And("should see the cards displaying")
	public void should_see_the_cards_displaying() {
		 System.out.println("4");
	}
	
	@When("user login to application with {string} and {string}")//the values will fall here
	public void user_login_to_application_with_and(String username, String password) {//those values store in these variable
	    System.out.println(username+" and pwd is "+password);
	}
	
	@When("^user login to the application with (.+) and (.+)$")
	public void user_login_to_the_application_with_and(String username, Integer pwd) {
	    System.out.println(username+" and the password is" +pwd);
	}
	
	@When("user signup into application")
	public void user_signup_into_application(List<String> data) {
		System.out.println("First data to send in name field : "+data.get(0));
	    
	}	 
	@Given("setup the entries in database")
		public void samplegiven() {
			System.out.println("cleared the entries in database");
		}
	@When("launch the site from config variables")
	public void sampleWhen() {
		System.out.println("launching the site");
		
	}
	@And ("hit the homepage url of the site")
	public void sampleAnd() {
		System.out.println("Hitting the url ");
		
	}
	

}
