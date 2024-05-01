package org.alpha.tejashri.selenium.concepts.windowhandle;

import org.alpha.tejashri.selenium.BaseCodeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TestMTAMBWH extends BaseCodeTest {
    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = initBrowser("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette", "chrome");
    }

    @Test
    public void verifyMultipleTabsAndMultipleBrowsersWindowHandle() throws InterruptedException {
        String parentWindow = driver.getWindowHandle(); //To get the unique id of the Parent Window

        System.out.println("Parent Window Id : " + parentWindow);// parent id -123

        driver.findElement(By.id("newTabsWindowsBtn")).click(); //This button is used for opening multiple tabs in the existing browser and multiple browser windows

        //After clicking on that button, will open 4 Child Windows
        //Now 5 windows are open, so use set<String>
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Multiple Window Id's : " + windows);// [parent id-123, child1 id-111, child2 id-222, child1 id-333, child1 id-444]-order not preserved
        System.out.println("Total Windows : " +windows.size());//5

        System.out.println("Iterating the Window Id's with for each loop");

        //to iterate the window ids with for each loop
        for (String window : windows) {
            driver.switchTo().window(window);

            //Checking the condition of parent & child Ids
            if (!parentWindow.equals(window)) {
                driver.switchTo().window(window);// To Switch the focus to Child Window
                System.out.println("Child Window Title : " + driver.getTitle());
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("Parent Window Title : " + driver.getTitle());
    }
}