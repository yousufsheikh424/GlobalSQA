package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class DropDownPage extends WebTestBase {

    @FindBy(xpath = "//option[text()='Australia']")
    WebElement australiaOption;

    public DropDownPage(){

        PageFactory.initElements(driver, this);
    }

    public void australiaSelection(){

        Utility.waitUntilElementToBeClickable(australiaOption);
    }

    public String getTextOfSelection(){
        return Utility.getTextOfDropDownSelection(australiaOption);
    }
}
