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

public class TestMultipleTabsInBrowserWindowHandle extends BaseCodeTest {

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

        driver.findElement(By.id("newTabsBtn")).click(); //This button is used for opening multiple tabs in the existing browser

        //After clicking on that button, 2 child tab will open in the existing browser window
        //Now 3 tab windows are open, so use set<String>
        Set<String> tabWindows = driver.getWindowHandles();
        System.out.println("Multiple Tag Window Id's : " + tabWindows);// [parent id-123, child1 id-456, child2 id-789]-order not preserved
        System.out.println("---------------------------------------------------");

        System.out.println("Iterating the Tab Window Id's with for each loop");
        //to iterate the Tab window ids with for each loop
        for (String tabWindow : tabWindows) {
            System.out.println(tabWindow);
            System.out.println("---------------------------------------------------");

            //Checking the condition of parent & child Ids
            if (!parentTabWindow.equals(tabWindow)) {
                driver.switchTo().window(tabWindow);// To Switch the focus to child Tab Windows

                //Checking the condition of child title
                if (driver.getTitle().equals("Basic Controls - H Y R Tutorials")) {

                    //Child Tab window 1 - Basic Controls - H Y R Tutorials
                    System.out.println("Child Tab Window 1 : Title : " + driver.getTitle());

                    driver.findElement(By.id("firstName")).sendKeys("Abc");
                    driver.findElement(By.id("lastName")).sendKeys("Xyz");
                    driver.findElement(By.id("femalerb")).click();
                    driver.findElement(By.id("englishchbx")).click();
                    driver.findElement(By.id("email")).sendKeys("abc.xyz@example.com");
                    driver.findElement(By.id("password")).sendKeys("abc123xyz");
                    driver.findElement(By.id("registerbtn")).click();

                    WebElement registrationMssg = driver.findElement(By.id("msg"));
                    System.out.println("Registration Completion Massage : " + registrationMssg.getText());

                    //driver.close();//To close the current focused Tab window ie child tab Window 1 only
                }

                else {

                    //Child Tab window 2 - AlertsDemo - H Y R Tutorials
                    System.out.println("Child Tab Window 2 : Title : " + driver.getTitle());

                    driver.findElement(By.id("alertBox")).click();

                    Alert al = driver.switchTo().alert();
                    System.out.println("Text of Alert box :  " + al.getText());
                    al.accept();

                    Thread.sleep(2000);

                    driver.findElement(By.id("confirmBox")).click();
                    System.out.println("Text of Confirm box :  " + al.getText());
                    al.dismiss();

                    Thread.sleep(2000);

                    driver.findElement(By.id("promptBox")).click();
                    System.out.println("Text of Prompt box :  " + al.getText());
                    al.sendKeys("Automation");
                    al.accept();

                    Thread.sleep(2000);

                    WebElement popupBoxOutput = driver.findElement(By.id("output"));
                    System.out.println("Popup Box Output Massage  : " +popupBoxOutput.getText());

                    //driver.close();//To close the current focused Tab window ie child Tab Window 2 only
                    System.out.println("---------------------------------------------------");
                }
            }
        }

        driver.switchTo().window(parentTabWindow);
        System.out.println("Parent Tab Window Title : " + driver.getTitle());

        //driver.close();// To close the current focused Tab window ie parent Tab window only
        //driver.quit();// To close the multiple Tab windows opened by driver ie both parent & child Tab windows
    }
}