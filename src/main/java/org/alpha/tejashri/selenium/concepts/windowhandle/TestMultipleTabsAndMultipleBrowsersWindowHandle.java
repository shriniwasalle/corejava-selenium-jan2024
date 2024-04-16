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
        String parentWindow = driver.getWindowHandle(); //To get the unique id of the Parent Window

        System.out.println("Parent Window Id : " + parentWindow);// parent id -123
        System.out.println("---------------------------------------------------");

        driver.findElement(By.id("newTabsWindowsBtn")).click(); //This button is used for opening multiple tabs in the existing browser and multiple browser windows

        //After clicking on that button, also open 2 Child Windows
        //Now 3 windows are open, so use set<String>
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Multiple Window Id's : " + windows);// [parent id-123, child1 id-456, child2 id-789]-order not preserved
        System.out.println("---------------------------------------------------");

        System.out.println("Iterating the Window Id's with for each loop");
        //to iterate the window ids with for each loop
        for (String window : windows) {
            System.out.println(window);
            driver.switchTo().window(window);
            System.out.println("---------------------------------------------------");

            //Checking the condition of parent & child Ids
            if (!parentWindow.equals(window)) {
                driver.switchTo().window(window);// To Switch the focus to Child Windows

                //Checking the condition of Child Title
                if (driver.getTitle().equals("Basic Controls - H Y R Tutorials")) {
                    driver.switchTo().window(window);

                    //Checking the condition of Child Title
                    if (driver.getTitle().equals("Contact Me - H Y R Tutorials")) {
                        driver.switchTo().window(window);

                        //Child Browser Window 2 - XPath Practice - H Y R Tutorials
                        System.out.println("Child Window Browser 2 : Title : " + driver.getTitle());

                        Thread.sleep(2000);

                        driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/input[1]")).sendKeys("Abc");
                        driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/input[2]")).sendKeys("Xyz");
                        driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/input[3]")).sendKeys("abc.xyz@example.com");
                        driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/div[2]/input")).sendKeys("abc123xyz");
                        driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/input[4]")).sendKeys("abc123xyz");
                        driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/div[3]/button[1]")).click();

                        //driver.close();//To close the current focused Browser window ie child Browser Window 1 only

                    } else {
                        driver.switchTo().window(window);
                        //Child Browser window 1 - Basic Controls - H Y R Tutorials
                        System.out.println("Child Tab Window 1 : Title : " + driver.getTitle());

                        driver.findElement(By.id("firstName")).sendKeys("Abc");
                        driver.findElement(By.id("lastName")).sendKeys("Xyz");
                        driver.findElement(By.id("femalerb")).click();
                        driver.findElement(By.id("englishchbx")).click();

                        driver.findElement(By.id("email")).sendKeys("abc.xyz@example.com");
                        driver.findElement(By.id("password")).sendKeys("abc123xyz");
                        driver.findElement(By.id("registerbtn")).click();

                        Thread.sleep(2000);

                        WebElement registrationMssg = driver.findElement(By.id("msg"));
                        System.out.println("Registration Completion Massage : " + registrationMssg.getText());


                        //driver.close();//To close the current focused Browser window ie child Browser Window 2 only

                    }

                    driver.switchTo().window(window);
                    //Child Browser window 1 - Contact Me - H Y R Tutorials
                    System.out.println("Child Browser Window 1 : Title : " + driver.getTitle());

                    Thread.sleep(2000);

                    driver.findElement(By.id("ContactForm1_contact-form-name")).sendKeys("Abc");
                    driver.findElement(By.id("ContactForm1_contact-form-email")).sendKeys("abc.xyz@example.com");

                    driver.findElement(By.id("ContactForm1_contact-form-email-message")).sendKeys("Inside the contact me page sending the massage");

                    //driver.close();//To close the current focused Browser window ie child Browser Window 1 only

                } else {

                    driver.switchTo().window(window);
                    //Child Tab window 2 - AlertsDemo - H Y R Tutorials
                    System.out.println("Child Tab Window 2 : Title : " + driver.getTitle());

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

                    Thread.sleep(2000);

                    WebElement popupBoxOutput = driver.findElement(By.id("output"));
                    System.out.println("Popup Box Output Massage  : " + popupBoxOutput.getText());

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