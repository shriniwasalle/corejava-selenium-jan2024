package org.alpha.tejashri.selenium.concepts.windowhandle;

import org.alpha.tejashri.selenium.BaseCodeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSingleBrowserWindowHandle extends BaseCodeTest {
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
    public void verifySingleWindowHandle() {
        String parentBrowserWindow = driver.getWindowHandle(); //To get the unique id of the Browser window

        System.out.println("Parent Browser Window Id : " + parentBrowserWindow);// parent id -123
        System.out.println("---------------------------------------------------");

        driver.findElement(By.id("newWindowBtn")).click(); //This button is used for opening a new browser window

        //After clicking on that button, child Browser window will also open
        //Now 2 Browser windows are open, so use set<String>
        Set<String> BrowserWindows = driver.getWindowHandles();
        System.out.println("Multiple Window Id's : " + BrowserWindows);// [parent id-123, child id-456]-order not preserved
        System.out.println("---------------------------------------------------");

        System.out.println("Iterating the Browser Window Id's with for each loop");
        //to iterate the Browser window ids with for each loop
        for (String BrowserWindow : BrowserWindows) {
            System.out.println(BrowserWindow);

            //Check the condition that
            // BrowserWindow != parentBrowserWindow --> Switch the focus to childBrowserWindow
            // BrowserWindow == parentBrowserWindow --> Don't Switch/skip

            //!parentBrowserWindow.equals(BrowserWindow) --> Switch
            //parentBrowserWindow.equals(BrowserWindow) -->  skip

            //example ids
            // !465.equals(123) --> !true = false --> Switch the focus to childBrowserWindow
            //123.equals123 --> true --> Don't Switch/skip

            System.out.println("---------------------------------------------------");
            //Checking the condition of parent & child Ids
            if (!parentBrowserWindow.equals(BrowserWindow)) {
                driver.switchTo().window(BrowserWindow);// To Switch the focus to child Browser Window
                System.out.println("Child Browser Window Title : " + driver.getTitle());

                driver.findElement(By.id("firstName")).sendKeys("Abc");
                driver.findElement(By.id("lastName")).sendKeys("Xyz");
                driver.findElement(By.id("femalerb")).click();
                driver.findElement(By.id("englishchbx")).click();

                driver.findElement(By.id("email")).sendKeys("abc.xyz@example.com");
                driver.findElement(By.id("password")).sendKeys("abc123xyz");
                driver.findElement(By.id("registerbtn")).click();

                WebElement registrationMssg = driver.findElement(By.id("msg"));
                String actualRegistrationMssg = registrationMssg.getText();
                System.out.println("Registration Completion Massage : " + actualRegistrationMssg);

                String expectedRegistrationMssg = "Registration is Successful";

                Assert.assertEquals(actualRegistrationMssg, expectedRegistrationMssg);

                //driver.close();//To close the current focused window ie child Browser Window only
            }
        }

        System.out.println("---------------------------------------------------");
        driver.switchTo().window(parentBrowserWindow);
        System.out.println("Parent Browser Window Title : " + driver.getTitle());

        //driver.close();// To close the current focused window ie parent Browser window only
        //driver.quit();// To close the multiple windows opened by driver ie both parent & child Browser windows
    }
}
