package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsPage extends BasePage {
    public FlightsPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='flt_fsw_inputBox searchCity inactiveWidget ']")
    WebElement getFrom;

    @FindBy(xpath = "//div[@class='flt_fsw_inputBox searchToCity inactiveWidget ']")
    WebElement getTo;

    @FindBy(xpath = "//span[.='Return']")
    WebElement setReturn;

    @FindBy(xpath = "//div[@class='DayPicker-Months']/div[2]//div[1]/div[.='1']")
    WebElement chooseReturnDate;

    @FindBy(xpath = "//a[.='Search']")
    WebElement btnsearch;

    public void search(){
        clickAndWait(getFrom);
        clickAndWait(getTo);
        clickAndWait(setReturn);
        clickAndWait(chooseReturnDate);
        clickAndWait(btnsearch);
    }
}
