package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelimElements extends Parent {
    public SelimElements() {
        PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(linkText ="Register" )
    public WebElement registerButton;

    @FindBy(id="customer.firstName" )
    public WebElement firstName;

    @FindBy(id="customer.lastName" )
    public WebElement lastName;

    @FindBy(id="customer.address.street" )
    public WebElement adress;

    @FindBy(id="customer.address.city")
    public WebElement city;

    @FindBy(id="customer.address.state" )
    public WebElement state;

    @FindBy(id="customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id="customer.phoneNumber" )
    public WebElement phone;

    @FindBy(id="customer.ssn")
    public WebElement ssn;

    @FindBy(id="customer.username")
    public WebElement username;

    @FindBy(id="customer.password")
    public WebElement password;

    @FindBy(id="repeatedPassword")
    public WebElement confirm;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement regosterBigButton;

    @FindBy(xpath = "//*[@id='rightPanel']/h1")
    public WebElement actualText;

    @FindBy(name = "username")
    public WebElement usernameLogin;

    @FindBy(name = "password")
    public WebElement passwordLogin;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement LogInCustomer;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/h1")
    public WebElement AccountOverview;

    @FindBy(linkText = "Bill Pay")
    public WebElement BillPay;

    @FindBy(name = "payee.name")
    public WebElement payeeName;

    @FindBy(name = "payee.address.street")
    public WebElement billAdress;

    @FindBy(name = "payee.address.city")
    public WebElement billCity;

    @FindBy(name = "payee.address.state")
    public WebElement billState;

    @FindBy(name= "payee.address.zipCode")
    public WebElement billZipCode;

    @FindBy(name = "payee.phoneNumber")
    public WebElement billPhone ;

    @FindBy(name = "payee.accountNumber")
    public WebElement recipientAccount;

    @FindBy(name = "verifyAccount")
    public WebElement VerifyAccount;

    @FindBy(name = "amount")
    public WebElement AmountAccount;

    @FindBy(name = "fromAccountId")
    public WebElement AccountNummer;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement sendPayMent;





















}
