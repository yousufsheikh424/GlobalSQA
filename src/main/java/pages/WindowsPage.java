package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class WindowsPage extends WebTestBase {

    @FindBy(xpath = "//div[@rel-title='Open New Tab']//child::a[@class='button e.g. button_hilite button_pale small_button']")
    WebElement windowPageClick;

    @FindBy(xpath = "//h1[text()='Frames And Windows']")
    WebElement newTabText;

    public WindowsPage(){

        PageFactory.initElements(driver, this);
    }

    public void newTabOpen(){

        Utility.waitUntilElementToBeClickable(windowPageClick);
    }

    public String getTextNewTab(){

        return Utility.getTextOfNewTab(newTabText);
    }
}
