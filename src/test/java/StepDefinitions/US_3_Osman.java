package StepDefinitions;

import Pages.Osman;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US_3_Osman {

    Osman os = new Osman();
    @And("Click Bill Pay")
    public void clickBillPay() {
        os.myClick(os.billPayBtn);
    }

    @Then("Success message should be displayed Bill Payment Service")
    public void successMessageShouldBeDisplayedBillPaymentService() {
        Assert.assertTrue(os.billPaymentService.getText().contains("Bill Payment Service"));
    }

    @And("Fill in the blanks")
    public void fillInTheBlanks() {
        os.mySendKeys(os.payeeName, "EnerjiSA Elektrik Odemesi");
        os.mySendKeys(os.payeeAdress, "Sasifelek Cikmazi");
        os.mySendKeys(os.payeeCity, "Istanbul");
        os.mySendKeys(os.payeeState, "Turkiye");
        os.mySendKeys(os.payeeZipcode, "34567");
        os.mySendKeys(os.payeePhone, "07642334567");
        os.mySendKeys(os.payeeAccount, "12");
        os.mySendKeys(os.verifyAccount, "12");
        os.mySendKeys(os.amount, "80");


    }

    @When("Click pay button")
    public void clickPayButton() {
        os.myClick(os.sendPayment);
    }

    @Then("Success message should be displayed amount and account")
    public void successMessageShouldBeDisplayedAmountAndAccount() {

    Assert.assertTrue(os.billPaymenComplete.getText().contains("Complete"));


    }

    @When("Click accounts overview button")
    public void clickAccountsOverviewButton() {
        os.myClick(os.accountsOverview);
    }

    @And("Click account number")
    public void clickAccountNumber() {
        os.myClick(os.accountNumberBtn);

    }

    @Then("User should see date, name of bill, amount")
    public void userShouldSeeDateNameOfBillAmount() {
        Assert.assertTrue(os.date.getText().contains("2023"));
        Assert.assertTrue(os.nameOfBill.getText().contains("EnerjiSA"));
        Assert.assertTrue(os.debit.getText().contains("80"));




    }
}
