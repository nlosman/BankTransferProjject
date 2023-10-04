package StepDefinitions;

import Pages.Parent;
import Pages.Zeynepp;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_2_Zeynep extends Parent {

    Zeynepp ze = new Zeynepp();

    @Given("Navigate to the url")
    public void navigateToTheUrl() {
        GWD.getDriver().get("https://para.testar.org/");
    }

    @When("Enter a valid username and password")
    public void enterAValidUsernameAndPassword() {
        ze.mySendKeys(ze.usernameLogIn,"yagizbaba");
        ze.mySendKeys(ze.passwordLogIn,"123456");

    }

    @Then("Click the Login Button")
    public void clickTheLoginButton() {
        ze.myClick(ze.customerLogIn);

    }
}
