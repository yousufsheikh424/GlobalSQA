package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class CheckBoxRadioBtnPage extends WebTestBase {

    @FindBy(xpath = "//input[@value='Functional Testing']")
    WebElement CheckBox;

    @FindBy(xpath = "//input[@value='Post Graduate']")
    WebElement RadioBtn;

    public CheckBoxRadioBtnPage(){

        PageFactory.initElements(driver, this);
    }

    public void CheckBoxClick(){
        Utility.waitUntilElementToBeClickable(CheckBox);

    }

    public void RadioBtnClick(){

        Utility.waitUntilElementToBeClickable(RadioBtn);
    }

    public boolean radioBtnVerify(){

        return Utility.isSelectedVerify(RadioBtn);
    }
    public boolean checkBoxVerify(){
        return Utility.isSelectedVerify(CheckBox);
    }


}
