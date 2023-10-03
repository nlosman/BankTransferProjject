package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Fatmanur extends Parent {

    public Fatmanur() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText ="Register" )
    public WebElement registerButton;
    @FindBy(name = "username")
    public WebElement usernameInput;
    @FindBy(name = "password")
    public WebElement passwordInput;
    @FindBy(css = "[type='submit']")
    public WebElement clickLogin;
    @FindBy(linkText = "Request Loan")
    public WebElement clickLink;
    @FindBy(css = "input[id='amount']")
    public WebElement enterLoanAmount;
    @FindBy(css = "input[id='downPayment']")
    public WebElement enterDownPayment;
    @FindBy(id = "fromAccountId")
    public WebElement selectNumber;
    @FindBy(css = "input[type='submit']")
    public WebElement clickApplyButton;
    @FindBy(xpath = "(//td[@align='right'])[1]")
    public WebElement confirmCreditInfo;
    @FindBy(xpath = "//*[contains( text() , 'Congra' )]")
    public WebElement successMsg;
    @FindBy(id = "newAccountId")
    public WebElement clickNumber;
    @FindBy(xpath = "//h1[text()='Account Details']")
    public WebElement confirmAccountInfo;
    @FindBy(xpath = "//b[text()='No transactions found.']")
    public WebElement confirmAccountMessage;
    @FindBy(xpath = "//p[text()='You do not have sufficient funds for the given down payment.']")
    public WebElement confirmMessage2;
}
