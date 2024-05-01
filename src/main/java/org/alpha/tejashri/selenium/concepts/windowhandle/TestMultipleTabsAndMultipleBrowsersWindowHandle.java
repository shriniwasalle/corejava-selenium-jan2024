package org.alpha.tejashri.selenium.concepts.windowhandle;

import org.alpha.tejashri.selenium.BaseCodeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestMultipleTabsAndMultipleBrowsersWindowHandle extends BaseCodeTest {
    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = initBrowser("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette", "chrome");
    }

    @AfterMethod
    public void closeBrowser() {
        //driver.quit();
    }

    @Test
    public void verifyMultipleTabsAndMultipleBrowsersWindowHandle() throws InterruptedException {

        //Fluent Wait added
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(50));
        fluentWait.pollingEvery(Duration.ofSeconds(5));
        fluentWait.ignoring(Exception.class);

        String parentWindow = driver.getWindowHandle(); //To get the unique id of the Parent Window

        System.out.println("Parent Window Id : " + parentWindow);// parent id-123
        System.out.println("---------------------------------------------------");

        driver.findElement(By.id("newTabsWindowsBtn")).click(); //This button is used for opening multiple tabs in the existing browser and multiple browser windows

        ///After clicking on that button, will open 4 Child Windows
        //Now 5 windows are open, so use set<String>
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Multiple Window Id's : " + windows);// [parent id-123, child1 id-111, child2 id-222, child1 id-333, child1 id-444]-order not preserved
        System.out.println("Total Windows : " + windows.size());
        System.out.println("---------------------------------------------------");

        System.out.println("Iterating the Window Id's with for each loop");
        //to iterate the window ids with for each loop
        for (String window : windows) {
            driver.switchTo().window(window);

            //Checking the condition of parent & child Ids
            if (!parentWindow.equals(window)) {
                driver.switchTo().window(window);// To Switch the focus to Child Windows

                //Checking the condition of Child Title
                if (driver.getTitle().equals("XPath Practice - H Y R Tutorials")) {
                    driver.switchTo().window(window);

                    //Child Browser Window 2 - XPath Practice - H Y R Tutorials
                    String title = driver.getTitle();
                    System.out.println("Child Window Browser 2 : Title : " + title);

                    driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("Abc");
                    driver.findElement(By.xpath("//input[@maxlength='15']")).sendKeys("Xyz");
                    driver.findElement(By.xpath("//form/div[1]/input[3]")).sendKeys("abc.xyz@example.com");
                    driver.findElement(By.xpath("//form/div[1]/div[2]/input")).sendKeys("abc123xyz");
                    driver.findElement(By.xpath("//form/div[1]/input[4]")).sendKeys("abc123xyz");
                    fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Register']"))).click();

                    String heading = driver.findElement(By.xpath("//form/div[1]/h1")).getText();
                    System.out.println("Heading : " +heading);

                    //Assertions
                    Assert.assertEquals(title, "XPath Practice - H Y R Tutorials");
                    Assert.assertEquals(heading, "Register");

                    //driver.close();//To close the current focused Browser window ie child Browser Window 1 only
                    System.out.println("---------------------------------------------------");
                } else
                    driver.switchTo().window(window);

                if (driver.getTitle().equals("Basic Controls - H Y R Tutorials")) {
                    driver.switchTo().window(window);

                    //Child Browser window 1 - Basic Controls - H Y R Tutorials
                    String title = driver.getTitle();
                    System.out.println("Child Tab Window 1 : Title : " + title);

                    driver.findElement(By.id("firstName")).sendKeys("Abc");
                    driver.findElement(By.id("lastName")).sendKeys("Xyz");

                    fluentWait.until(ExpectedConditions.elementToBeClickable(By.id("femalerb"))).click();
                    fluentWait.until(ExpectedConditions.elementToBeClickable(By.id("englishchbx"))).click();

                    driver.findElement(By.id("email")).sendKeys("abc.xyz@example.com");
                    driver.findElement(By.id("password")).sendKeys("abc123xyz");
                    driver.findElement(By.id("registerbtn")).click();

                    String registrationMssg = driver.findElement(By.id("msg")).getText();
                    System.out.println("Registration Completion Massage : " + registrationMssg);

                    //Assertions
                    Assert.assertEquals(title, "Basic Controls - H Y R Tutorials");
                    Assert.assertEquals(registrationMssg, "Registration is Successful");

                    //driver.close();//To close the current focused Browser window ie child Browser Window 2 only
                    System.out.println("---------------------------------------------------");
                } else

                    driver.switchTo().window(window);

                if (driver.getTitle().equals("Contact Me - H Y R Tutorials")) {
                    driver.switchTo().window(window);

                    //Child Browser window 1 - Contact Me - H Y R Tutorials
                    String title = driver.getTitle();
                    System.out.println("Child Browser Window 1 : Title : " + title);

                    driver.findElement(By.id("ContactForm1_contact-form-name")).sendKeys("Abc");
                    driver.findElement(By.id("ContactForm1_contact-form-email")).sendKeys("abc.xyz@example.com");

                    driver.findElement(By.id("ContactForm1_contact-form-email-message")).sendKeys("Inside the contact me page sending the massage");

                    String heading = driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
                    System.out.println("Heading : " +heading);

                    //Assertions
                    Assert.assertEquals(heading, "Contact Me");
                    Assert.assertEquals(title, "Contact Me - H Y R Tutorials");

                    //driver.close();//To close the current focused Browser window ie child Browser Window 1 only

                    System.out.println("---------------------------------------------------");
                } else
                    driver.switchTo().window(window);

                if (driver.getTitle().equals("AlertsDemo - H Y R Tutorials")) {
                    driver.switchTo().window(window);

                    //Child Tab window 2 - AlertsDemo - H Y R Tutorials
                    String title = driver.getTitle();
                    System.out.println("Child Tab Window 2 : Title : " + title);

                    Thread.sleep(2000);

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

                    String popupBoxOutput = driver.findElement(By.id("output")).getText();
                    System.out.println("Popup Box Output Massage  : " + popupBoxOutput);

                    //Assertions
                    Assert.assertEquals(title, "AlertsDemo - H Y R Tutorials");
                    Assert.assertEquals(popupBoxOutput, "You entered text Automation in propmt popup");

                    //driver.close();//To close the current focused Tab window ie child Tab Window 2 only
                    System.out.println("---------------------------------------------------");

                }
            }
        }

        System.out.println("---------------------------------------------------");
        driver.switchTo().window(parentWindow);
        System.out.println("Parent Window Title : " + driver.getTitle());

        //driver.close();// To close the current focused window ie parent window only
        //driver.quit();// To close the multiple Browser opened by driver ie both parent & child windows
    }
}