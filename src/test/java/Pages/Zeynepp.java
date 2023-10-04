package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zeynepp extends Parent {

    public Zeynepp() {
        PageFactory.initElements(GWD.getDriver(),this);}
    @FindBy(name = "username")
    public WebElement usernameLogIn;

    @FindBy(name = "password")
    public WebElement passwordLogIn;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement customerLogIn;


}
