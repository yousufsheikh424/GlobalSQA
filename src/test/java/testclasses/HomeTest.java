package testclasses;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;
import utility.ActionsUtility;

import java.awt.*;

public class HomeTest extends WebTestBase {

    public HomePage homePage;
    public DragDropPage dragDropPage;
    public DropDownPage dropDownPage;
    public WindowsPage windowsPage;
    public CheckBoxRadioBtnPage checkBoxRadioBtnPage;
    public MouseActionPage mouseActionPage;

    HomeTest(){

        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        dragDropPage = new DragDropPage();
        dropDownPage = new DropDownPage();
        windowsPage = new WindowsPage();
        checkBoxRadioBtnPage = new CheckBoxRadioBtnPage();
        mouseActionPage = new MouseActionPage();
    }

    @Test(description = "verifying drag and drop functionality")
    public void verifyDragDropPerformFunctionality(){
        SoftAssert softAssert = new SoftAssert();
        homePage.dragDropClick();
        /*dragDropPage.iFrameTab1();
        dragDropPage.iFrameTab2();
        dragDropPage.iFrameTab3();
        dragDropPage.closingAd();*/
        dragDropPage.ddFrameTab();
        dragDropPage.dragDropFunc();
    }

    @Test(description = "verifying drop down functionality")
    public void verifyDropDownSelectionFunctionality(){
        SoftAssert softAssert = new SoftAssert();
        homePage.dropDownClick();
        dropDownPage.australiaSelection();
        softAssert.assertEquals(dropDownPage.getTextOfSelection(), "Australia", "Text Selection should be matched");
        softAssert.assertAll();
    }


    @Test(description = "verifying get window handle on windows page")
    public void verifyGetWindowHandleOnWindowsPage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.windowsClick();
        windowsPage.newTabOpen();
        softAssert.assertEquals(windowsPage.getTextNewTab(), "Frames And Windows", "Text should be matched");
        softAssert.assertAll();
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        driver.close();
    }
}
