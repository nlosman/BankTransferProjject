package StepDefinitions;

import Pages.EmrElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccesingAccountDetails {

    EmrElements e = new EmrElements();
    @Given("Show Account Overview")
    public void showAccountOverview() {
    }

    @Then("User should be display Account Summary")
    public void userShouldBeDisplayAccountSummary() {
    }

    @When("User Clicks an Account number")
    public void userClicksAnAccountNumber() {
    }

    @Then("User should be display Account number, account type, balance, available balance")
    public void userShouldBeDisplayAccountNumberAccountTypeBalanceAvailableBalance() {
    }

    @When("User displays the list of filtered account activities.")
    public void userDisplaysTheListOfFilteredAccountActivities() {
    }

    @Then("This list should contain information.")
    public void thisListShouldContainInformation() {
    }

    @And("User clicks any processing on the list.")
    public void userClicksAnyProcessingOnTheList() {
    }

    @Then("User should be display the process details.")
    public void userShouldBeDisplayTheProcessDetails() {
    }
}
