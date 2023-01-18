package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
    @Given("User is on login page")
    public void user_is_on_login_page() {
        System.out.println("Hello");
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Hello");
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Hello");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("Hello");
    }
}


