package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmrElements extends Parent {
    public EmrElements() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="")
    public WebElement overviewBtn;
}
