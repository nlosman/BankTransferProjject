package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmrElements extends Parent {
    public EmrElements() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//*[@id='leftPanel']/ul/li[2]/a")
    public WebElement overviewBtn;

    @FindBy(xpath="//*[@id='accountTable']//th[1]")
    public WebElement overviewTable;

    @FindBy(xpath="//*[@id='accountTable']//a[1]")
    public WebElement accountNm;

    @FindBy(xpath="//*[@id='rightPanel']/div/div[1]/table/tbody/tr[1]/td[1]")
    public WebElement accountDetails;

    @FindBy(xpath="//*[@id='rightPanel']/div/div[2]/form/table/tbody/tr[1]/td[1]")
    public WebElement accountActivitiesFilter;

    @FindBy(xpath="//*[@id='transactionTable']/thead/tr/th[1]")
    public WebElement accountInformation;

    @FindBy(xpath="//*[@id='transactionTable']/tbody/tr[1]//a")
    public WebElement transactionBtn;

    @FindBy(xpath="//*[@id='rightPanel']/table/tbody/tr[1]/td[1]/")
    public WebElement transactionDetail;
}
