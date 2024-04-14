package org.alpha.tejashri.selenium.concepts.windowhandle;

import org.alpha.tejashri.selenium.BaseCodeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSingleBrowserWindowHandle extends BaseCodeTest {
    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = initBrowser("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette", "chrome");
    }

    @Test
    public void verifySingleWindowHandle() {
        String parentWindow = driver.getWindowHandle(); // To get the unique id of the window

        System.out.println("Parent Window Id : " + parentWindow);// parent id -123

        driver.findElement(By.id("newWindowBtn")).click(); //This button is used for opening a new browser window

        //After clicking on that button, child window will also open
        //Now 2 windows are open, so use set<String>
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Multiple Window Id's : " + windows);// [parent id-123, child id-456]-order not preserved

        //to iterate the window ids with for each
        for (String window : windows) {
            System.out.println(window);

            //Check the condition that
            // window != parentWindow --> Switch the focus to childWindow
            // window == parentWindow --> Don't Switch/skip

            //!parentWindow.equals(window) --> Switch
            //parentWindow.equals(window) -->  skip

            //example ids
            // !465.equals(123) --> !true = false --> Switch the focus to childWindow
            //123.equals123 --> true --> Don't Switch/skip

            //Checking the condition
            if (!parentWindow.equals(window)) {
                driver.switchTo().window(window);// To Switch the focus to child Window
                driver.manage().window().maximize();//To maximize the child window
                System.out.println("Child Window Title : " + driver.getTitle());

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

                //driver.close();//To close the current focused window ie child Window only
            }
        }

        driver.switchTo().window(parentWindow);
        System.out.println("Parent Window Title : " + driver.getTitle());

        //driver.close();// To close the current focused window ie parent window only
        driver.quit();// To close the multiple windows opened by driver ie both parent & child window
    }
}
