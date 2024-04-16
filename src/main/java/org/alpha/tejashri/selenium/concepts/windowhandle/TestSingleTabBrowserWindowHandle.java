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

public class TestSingleTabBrowserWindowHandle extends BaseCodeTest {

    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = initBrowser("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette", "chrome");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void verifySingleWindowHandle() throws InterruptedException {
        String parentTabWindow = driver.getWindowHandle(); // To get the unique id of the Tab window

        System.out.println("Parent Tab Window Id : " + parentTabWindow);// parent id -123
        System.out.println("---------------------------------------------------");

        driver.findElement(By.id("newTabBtn")).click(); //This button is used for opening a new tab in the existing browser window

        //After clicking on that button, new 1 child tab will open in the existing browser window
        //Now 2 tab windows are open, so use set<String>
        Set<String> tabWindows = driver.getWindowHandles();
        System.out.println("Multiple Tag Window Id's : " + tabWindows);// [parent id-123, child id-456]-order not preserved
        System.out.println("---------------------------------------------------");

        System.out.println("Iterating the Tab Window Id's with for each loop");
        //to iterate the Tab window ids with for each
        for (String tabWindow : tabWindows) {
            System.out.println(tabWindow);

            //Check the condition that
            // tabWindow != parentTabWindow --> Switch the focus to childTabWindow
            // tabWindow == parentTabWindow --> Don't Switch/skip

            //!parentTabWindow.equals(tabWindow) --> Switch
            //parentTabWindow.equals(tabWindow) -->  skip

            //example ids
            // !465.equals(123) --> !true = false --> Switch the focus to childTabWindow
            //123.equals123 --> true --> Don't Switch/skip

            System.out.println("---------------------------------------------------");
            //Checking the condition of parent & child Ids
            if (!parentTabWindow.equals(tabWindow)) {
                driver.switchTo().window(tabWindow);//To Switch the focus to child Tab Window

                System.out.println("Child Tab Window Title : " + driver.getTitle());

                driver.findElement(By.id("alertBox")).click();

                Alert al = driver.switchTo().alert();

                Thread.sleep(2000);

                System.out.println("Text of Alert box :  " + al.getText());
                al.accept();

                driver.findElement(By.id("confirmBox")).click();
                System.out.println("Text of Confirm box :  " + al.getText());
                al.dismiss();

                Thread.sleep(2000);

                driver.findElement(By.id("promptBox")).click();
                System.out.println("Text of Prompt box :  " + al.getText());
                al.sendKeys("Automation");

                Thread.sleep(2000);

                al.accept();

                WebElement popupBoxOutput = driver.findElement(By.id("output"));
                System.out.println("Popup Box Output Massage  : " + popupBoxOutput.getText());

                //driver.close();//To close the current focused Tab window ie child Tab Window only
            }
        }

        System.out.println("---------------------------------------------------");
        driver.switchTo().window(parentTabWindow);
        System.out.println("Parent Tab Window Title : " + driver.getTitle());

        //driver.close();// To close the current focused Tab window ie parent Tab window only
        //driver.quit();// To close the multiple Tab windows opened by driver ie both parent & child Tab windows
    }
}