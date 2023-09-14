package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.ActionsUtility;
import utility.Utility;

public class MouseActionPage extends WebTestBase {

    @FindBy(xpath = "//li[@id='menu-item-2822']")
    WebElement movingMouse;

    @FindBy(xpath = "//span[text()='Flash Website']")
    WebElement flashWebSite;

    @FindBy(xpath = "//img[@alt='Get Adobe Flash player']")
    WebElement flashWebsiteImg;

    public MouseActionPage(){
        PageFactory.initElements(driver, this);
    }

    public void mouseHoverFunc(){

        ActionsUtility.mouseHoverElement(movingMouse);
    }

    public void flashWebSiteFunc(){

        Utility.waitUntilElementToBeClickable(flashWebSite);
    }

    public String flashWebsiteText(){
        return Utility.getTextOfFlashWebsite(flashWebsiteImg);
    }
}
