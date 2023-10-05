package Pages;

import Utilities.GWD;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class Osman extends Parent{
    public Osman() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy (linkText = "Bill Pay")
    public WebElement billPayBtn;

    @FindBy (xpath = "//*[@ng-show='showForm']//h1")
    public WebElement billPaymentService;

    @FindBy(xpath = "//*[@name='payee.name']")
    public WebElement payeeName;

    @FindBy(xpath = "//*[@name='payee.address.street']")
    public WebElement payeeAdress;
    @FindBy(xpath = "//*[@name='payee.address.city']")
    public WebElement payeeCity;
    @FindBy(xpath = "//*[@name='payee.address.state']")
    public WebElement payeeState;
    @FindBy(xpath = "//*[@name='payee.address.zipCode']")
    public WebElement payeeZipcode;
    @FindBy(xpath = "//*[@name='payee.phoneNumber']")
    public WebElement payeePhone;
    @FindBy(xpath = "//*[@name='payee.accountNumber']")
    public WebElement payeeAccount;
    @FindBy(xpath = "//*[@name='verifyAccount']")
    public WebElement verifyAccount;

    @FindBy(xpath = "//*[@name='amount']")
    public WebElement amount;
    @FindBy(xpath = "//*[@value='Send Payment']")
    public WebElement sendPayment;
    //@FindBy (xpath = "//*[@ng-show='showResult']//h1")
    @FindBy(xpath = "//span[@id='amount']")
    public WebElement billPaymenComplete;

    @FindBy (linkText = "Accounts Overview")
    public WebElement accountsOverview;

    @FindBy (xpath = "(//*[@ng-repeat='account in accounts'])//a")
    public WebElement accountNumberBtn;

    @FindBy(xpath = "(//td[@class='ng-binding'])[5]")
    public WebElement date;


    @FindBy(xpath = "(//*[@ng-repeat='transaction in transactions']//td)[2]")
    public WebElement nameOfBill;

    @FindBy(xpath = "(//*[@ng-repeat='transaction in transactions']//td)[3]")
    public WebElement debit;


}
