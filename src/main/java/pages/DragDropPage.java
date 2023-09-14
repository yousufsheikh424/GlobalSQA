package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.ActionsUtility;
import utility.Utility;

import javax.swing.*;

public class DragDropPage extends WebTestBase {

    @FindBy(xpath = "//iframe[@id='google_esf']")
    WebElement iFrameEle1;

    @FindBy(xpath = "//iframe[@id='aswift_1']")
    WebElement iFrameEle2;

    @FindBy(xpath = "//iframe[@id='ad_iframe']")
    WebElement iFrameEle3;

    @FindBy(xpath = "//span[text()='Close']")
    WebElement closingAlert;

    @FindBy(xpath = "//iframe[@class='demo-frame lazyloaded']")
    WebElement ddFrame;

    @FindBy(xpath = "//img[@alt='The peaks of High Tatras']")
    WebElement sourcePath;

    @FindBy(id = "trash")
    WebElement destinationPath;

    public DragDropPage(){

        PageFactory.initElements(driver, this);
    }

    public void ddFrameTab(){

        Utility.switchToFrameTab(ddFrame);
    }

    public void dragDropFunc(){

        ActionsUtility.dragAndDropOfElement(sourcePath, destinationPath);
    }

    /*public void iFrameTab1(){
        Utility.switchToFrameWithID(iFrameEle1);
    }
    public void iFrameTab2(){
        Utility.switchToFrameWithID(iFrameEle2);
    }
    public void iFrameTab3(){
        Utility.switchToFrameWithID(iFrameEle3);
    }
    public void closingAd(){
        Utility.waitUntilElementToBeClickable(closingAlert);
    }*/

}
