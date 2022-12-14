package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddEmployeeSteps extends CommonMethods {


    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        lg=new LoginPage();
        lg.username.sendKeys(ConfigReader.getPropertyValyue("username"));
        lg.password.sendKeys(ConfigReader.getPropertyValyue("password"));
    }

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        dash.pimOption.click();

    }
    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        dash.addEmployeeOption.click();
    }
    @When("user sends first and last name")
    public void user_sends_first_and_last_name() {
        addEmp.firstName.sendKeys("Teddy");
        addEmp.lastName.sendKeys("Bear");
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        addEmp.saveBtn.click();
    }

    @Then("employee is successfully added")
    public void employeeIsSuccessfullyAdded() {
        System.out.println("New employee is successfully added");
        closeBrowser();
    }
}
