package org.alpha.tejashri.selenium.assignments.AssignmentNo7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class IphoneSearchPage {

    private final WebDriver driver;
    private final By firstSearch = By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']");

    //created parametrised constructor
    public IphoneSearchPage(WebDriver driver) {
        this.driver = driver;
    }


    public void getFirstResult() {
        WebElement fSearch = driver.findElement(firstSearch);
        fSearch.click();
    }

    public void verifyWindowHandle() {
        String parentTabWindow = driver.getWindowHandle(); // To get the unique id of the Tab window

        //System.out.println("Parent Tab Window Id : " + parentTabWindow);
        System.out.println("Parent Tab Window Title : " + driver.getTitle());

        //After clicking on that button, new 1 child tab will open in the existing browser window
        //Now 2 tab windows are open, so use set<String>
        Set<String> tabWindows = driver.getWindowHandles();
        //System.out.println("Multiple Tab Window Id's : " + tabWindows);

        System.out.println("Iterating the Tab Window Id's with for each loop");
        //to iterate the Tab window ids with for each
        for (String tabWindow : tabWindows) {
            //System.out.println(tabWindow);

            //Checking the condition of parent & child Ids
            if (!parentTabWindow.equals(tabWindow)) {
                driver.switchTo().window(tabWindow);//To Switch the focus to child Tab Window

                System.out.println("Child Tab Window Title : " + driver.getTitle());
            }
        }
    }
}
