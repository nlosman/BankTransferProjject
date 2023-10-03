package StepDefinitions;

import Pages.Parent;
import Pages.SelimElements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class All_US_selim extends Parent {

    SelimElements se= new SelimElements();
    @Given("Navigate to url")
    public void navigateToUrl() {
        GWD.getDriver().get("https://para.testar.org/");
        se.myClick(se.registerButton);

    }

    @When("fill out the registration form")
    public void fillOutTheRegistrationForm() {
        se.mySendKeys(se.firstName,"halim");
        se.mySendKeys(se.lastName,"yagiz");
        se.mySendKeys(se.adress,"Bergen Straat");
        se.mySendKeys(se.city,"Amsterdam");
        se.mySendKeys(se.state,"Netherland");
        se.mySendKeys(se.zipCode,"2351AB");
        se.mySendKeys(se.phone,"+3161234567");
        se.mySendKeys(se.ssn,"123");
        se.mySendKeys(se.username,"yagizbaba");
        se.mySendKeys(se.password,"123456");
        se.mySendKeys(se.confirm,"123456");

    }
    @Then("Click all")
    public void clickAll() {
        se.myClick(se.regosterBigButton);
    }

    @And("Verify successfully")
    public void verifySuccessfully() {
        se.verifyContainsText(se.actualText,"Welcome halimbaba");
    }

    @When("Enter valid username and password")
    public void enterValidUsernameAndPassword() {
        se.mySendKeys(se.usernameLogin,"yagizbaba");
        se.mySendKeys(se.passwordLogin,"123456");
    }

    @Then("LoginIn button click")
    public void loginınButtonClick() {
        se.myClick(se.LogInCustomer);
    }

    @And("Successfully verify  actualtext.")
    public void successfullyVerifyActualtext() {

        se.verifyContainsText(se.AccountOverview,"Accounts Overview");
    }

    @Then("Redirect the user to the bill payment page")
    public void redirectTheUserToTheBillPaymentPage() {

        se.myClick(se.BillPay);
        se.mySendKeys(se.payeeName,"Dogal Gaz Idaresi");
        se.mySendKeys(se.billAdress,"Bergen Straat");
        se.mySendKeys(se.billCity,"Amsterdam");
        se.mySendKeys(se.billState,"Netherland");
        se.mySendKeys(se.billZipCode,"2351AB");
        se.mySendKeys(se.billPhone,"3161234567");
        se.mySendKeys(se.recipientAccount,"13395");
        se.mySendKeys(se.VerifyAccount,"13395");
        se.mySendKeys(se.AmountAccount,"$35");
        Select select =new Select(se.AccountNummer);
        select.selectByIndex(0);
        se.myClick(se.sendPayMent);
    }

    @And("user can successfully pay {int} different bills")
    public void userCanSuccessfullyPayDifferentBills(int arg0) {
    }

    @And("A success text should be available after each invoice.")
    public void aSuccessTextShouldBeAvailableAfterEachInvoice() {
    }

    @And("The current balance should be seen after each payment.")
    public void theCurrentBalanceShouldBeSeenAfterEachPayment() {
    }
}
