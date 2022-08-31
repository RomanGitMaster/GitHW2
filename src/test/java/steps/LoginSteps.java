package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Given("user is navigated to HRM web application")
    public void user_is_navigated_to_hrm_web_application() {
        openBrowserAndLunchApp();

    }

    @When("user enters user name and password")
    public void user_enters_user_name_and_password() {
        sendText(lg.username, ConfigReader.getPropertyValyue("username"));
        sendText(lg.password, ConfigReader.getPropertyValyue("password"));

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        lg.loginButton.click();
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Successfully logged in!");
    }

}
