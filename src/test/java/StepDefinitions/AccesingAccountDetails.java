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
        e.myClick(e.overviewBtn);
    }

    @Then("User should be display Account Summary")
    public void userShouldBeDisplayAccountSummary() {
        e.verifyContainsText(e.overviewTable, "Account");
    }

    @When("User Clicks an Account number")
    public void userClicksAnAccountNumber() {
        e.myClick(e.accountNm);
    }

    @Then("User should be display Account number, account type, balance, available balance")
    public void userShouldBeDisplayAccountNumberAccountTypeBalanceAvailableBalance() {
        e.verifyContainsText(e.accountDetails, "Account Number");
    }

    @When("User displays the list of filtered account activities.")
    public void userDisplaysTheListOfFilteredAccountActivities() {
        e.verifyContainsText(e.accountActivitiesFilter, "Activity Period:");
    }

    @Then("This list should contain information.")
    public void thisListShouldContainInformation() {
        e.verifyContainsText(e.accountInformation, "Date");
    }

    @And("User clicks any processing on the list.")
    public void userClicksAnyProcessingOnTheList() {
        e.myClick(e.transactionBtn);
    }

    @Then("User should be display the process details.")
    public void userShouldBeDisplayTheProcessDetails() {
        e.verifyContainsText(e.transactionDetail, "Transaction ID:");
    }
}
