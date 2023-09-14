package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//a[text()='DragAndDrop']")
    WebElement DragDrop;

    @FindBy(xpath = "//a[text()='DropDown']")
    WebElement dropDown;

    @FindBy(xpath = "//a[text()='Windows']")
    WebElement Windows;

    @FindBy(xpath = "//a[text()='SamplePage']")
    WebElement CheckBoxRadioBtn;

    @FindBy(xpath = "//li[@id='menu-item-2822']")
    WebElement MouseAction;

    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    public void dragDropClick(){

        Utility.waitUntilElementToBeClickable(DragDrop);
    }

    public void dropDownClick(){
        Utility.waitUntilElementToBeClickable(dropDown);
    }

    public void windowsClick(){

        Utility.waitUntilElementToBeClickable(Windows);
    }


    public void checkBoxRadioBtnClick(){

        Utility.waitUntilElementToBeClickable(CheckBoxRadioBtn);
    }

    public void mouseActionClick(){

        Utility.waitUntilElementToBeClickable(MouseAction);
    }

}
