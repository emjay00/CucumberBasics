package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("user navigates to Instagram website")
    public void user_navigates_to_instagram_website() {
        System.out.println("@Given(\"user navigates to Instagram website\")");
    }

    @When("user validates the homepage titles")
    public void user_validates_the_homepage_titles() {
        System.out.println("@When(\"user validates the homepage titles\")");
    }

    @Then("user enters {string} username")
    public void user_enters_username(String username) {
        System.out.println(" @Then(\"user enters "+username+" username\")");
    }

    @Then("user enter {string} password")
    public void user_enter_password(String password) {
        System.out.println(" @Then(\"user enter "+password +" password\")");
    }

    @Then("user clicks on signin button")
    public void user_clicks_on_signin_button() {
        System.out.println("@Then(\"user clicks on signin button\")");
    }

}