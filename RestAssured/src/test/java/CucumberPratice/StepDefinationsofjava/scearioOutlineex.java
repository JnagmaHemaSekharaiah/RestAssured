package CucumberPratice.StepDefinationsofjava;

import io.cucumber.java.en.*;

public class scearioOutlineex
{

    @Given("I am on the login page")
    public void i_am_on_the_login_page()
    {
        System.out.println("Logged In");
    }

    @When("I enter username {string}")
    public void i_enter_username(String string)
    {
        System.out.println(string);
    }

    @When("I enter password {string}")
    public void i_enter_password(String string)
    {
        System.out.println(string);
    }

    @Then("login result should be {string}")
    public void login_result_should_be(String string)
    {
        System.out.println(string);
    }

}
