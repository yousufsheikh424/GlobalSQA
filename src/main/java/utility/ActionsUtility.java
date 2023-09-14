package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testbase.WebTestBase;

public class ActionsUtility extends WebTestBase {

    public static Actions actions;

    public static void dragAndDropOfElement(WebElement srcElement, WebElement destElement){

        actions = new Actions(driver);
        actions.dragAndDrop(srcElement, destElement).perform();
    }

    public static void mouseHoverElement(WebElement element){
        actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
}
