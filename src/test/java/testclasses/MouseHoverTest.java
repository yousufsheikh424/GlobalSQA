package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class MouseHoverTest extends WebTestBase {
    public HomePage homePage;
    public DragDropPage dragDropPage;
    public DropDownPage dropDownPage;
    public WindowsPage windowsPage;
    public CheckBoxRadioBtnPage checkBoxRadioBtnPage;
    public MouseActionPage mouseActionPage;

    MouseHoverTest(){

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

    @Test(description = "verify mouse hover functionality")
    public void verifyMouseHoverFunctionality(){
        SoftAssert softAssert = new SoftAssert();
        mouseActionPage.mouseHoverFunc();
        mouseActionPage.flashWebSiteFunc();
        softAssert.assertEquals(mouseActionPage.flashWebsiteText(), "Get Adobe Flash player", "text should be matched");
        softAssert.assertAll();
    }
    @AfterMethod
    public void teardown() throws InterruptedException {
        driver.close();
    }
}
