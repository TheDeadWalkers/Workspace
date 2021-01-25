package sdf;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepdef {

    @Given("^Login id and password$")
    public void login_id_and_password() throws Throwable {
       System.out.println("akash and 123");
    }

    @When("^i landed on login page$")
    public void i_landed_on_login_page() throws Throwable {
        System.out.println("login page");
    }

    @Then("^user should logged in$")
    public void user_should_logged_in() throws Throwable {
       System.out.println("login successful");
    }

}