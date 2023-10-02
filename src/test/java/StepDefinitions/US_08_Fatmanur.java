package StepDefinitions;

import Pages.Fatmanur;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class US_08_Fatmanur {
    Fatmanur ft = new Fatmanur();
    Parent pn = new Parent();

    @Given("Navigate to Parabank")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("Click Register button")
    public void clickRegisterButton() {
        ft.myClick(ft.registerButton);
    }

    @When("Enter username and password")
    public void enterUsernameAndPassword() {
        ft.mySendKeys(ft.usernameInput, "yagizbaba");
        ft.mySendKeys(ft.passwordInput, "123456");
    }

    @Then("Click Login button")
    public void clickLoginButton() {
        ft.myClick(ft.clickLogin);
    }

    @Then("Click Request Loan link")
    public void clickRequestLoanLink() {
        ft.myClick(ft.clickLink);
    }

    @When("Enter Loan Amount and Down Payment")
    public void enterLoanAmountAndDownPayment() {
        ft.mySendKeys(ft.enterLoanAmount, "1000");
        ft.mySendKeys(ft.enterDownPayment, "500");
    }

    @Then("Select account number")
    public void selectAccountNumber() {
        Select accountMenu = new Select(ft.selectNumber);
        accountMenu.selectByIndex(0);
    }

    @And("Click Apply Now button")
    public void clickApplyNowButton() {
        ft.myClick(ft.clickApplyButton);
    }

    @When("Confirm Credit Request Processed information")
    public void confirmCreditRequestProcessedInformation() {
        pn.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[@align='right'])[1]")));
        Assert.assertTrue(ft.confirmCreditInfo.getText().contains("Loan"));
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        pn.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains( text() , 'Congra' )]")));
        Assert.assertTrue(ft.successMsg.getText().contains("Congra"));
    }

    @And("Click new account number")
    public void clickNewAccountNumber() {
        ft.myClick(ft.clickNumber);
    }

    @When("Confirm Account Details information")
    public void confirmAccountDetailsInformation() {
        Assert.assertTrue(ft.confirmAccountInfo.getText().toLowerCase().contains("details"));
    }

    @Then("Confirm Account Activity message")
    public void confirmAccountActivityMessage() {
        pn.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='No transactions found.']")));
        Assert.assertTrue(ft.confirmAccountMessage.getText().toLowerCase().contains("no transactions found"));
    }

    @When("Enter Loan Amount and Down Payment \\(scenario two)")
    public void enterLoanAmountAndDownPaymentScenarioTwo() {
        ft.mySendKeys(ft.enterLoanAmount, "2000");
        ft.mySendKeys(ft.enterDownPayment, "1000");
    }

    @Then("Confirm the message \\(scenario two)")
    public void confirmTheMessageScenarioTwo() {
        pn.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='You do not have sufficient funds for the given down payment.']")));
        Assert.assertTrue(ft.confirmMessage2.getText().contains("You do not have"));
    }



}
