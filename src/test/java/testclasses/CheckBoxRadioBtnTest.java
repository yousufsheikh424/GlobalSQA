package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class CheckBoxRadioBtnTest extends WebTestBase {
    public HomePage homePage;
    public DragDropPage dragDropPage;
    public DropDownPage dropDownPage;
    public WindowsPage windowsPage;
    public CheckBoxRadioBtnPage checkBoxRadioBtnPage;
    public MouseActionPage mouseActionPage;

    CheckBoxRadioBtnTest(){

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

    @Test(description = "verify check box and radio btn functionality")
    public void verifyCheckBoxRadioBtnFunctionality(){
        SoftAssert softAssert = new SoftAssert();
        homePage.checkBoxRadioBtnClick();
        checkBoxRadioBtnPage.CheckBoxClick();
        checkBoxRadioBtnPage.RadioBtnClick();
        softAssert.assertTrue(checkBoxRadioBtnPage.radioBtnVerify(), "Should be selected");
        softAssert.assertTrue(checkBoxRadioBtnPage.checkBoxVerify(), "Should be clickable");
        softAssert.assertAll();
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        driver.close();
    }

}
