package org.alpha.tejashri.selenium.concepts.windowhandle;

import org.alpha.tejashri.selenium.BaseCodeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TestMultipleBrowsersWindowHandle extends BaseCodeTest {
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
        String parentBrowserWindow = driver.getWindowHandle(); //To get the unique id of the Parent Browser Window

        System.out.println("Parent Browser Window Id : " + parentBrowserWindow);// parent id -123
        System.out.println("---------------------------------------------------");

        driver.findElement(By.id("newWindowsBtn")).click(); //This button is used for opening multiple browser windows

        //After clicking on that button, also open 2 Child Browser Windows
        //Now 3 Browser windows are open, so use set<String>
        Set<String> browserWindows = driver.getWindowHandles();
        System.out.println("Multiple Browser Window Id's : " + browserWindows);// [parent id-123, child1 id-456, child2 id-789]-order not preserved
        System.out.println("---------------------------------------------------");

        System.out.println("Iterating the Browser Window Id's with for each loop");
        //to iterate the browser window ids with for each loop
        for (String browserWindow : browserWindows) {
            System.out.println(browserWindow);
            driver.switchTo().window(browserWindow);
            System.out.println("---------------------------------------------------");

            //Checking the condition of parent & child Ids
            if (!parentBrowserWindow.equals(browserWindow)) {
                driver.switchTo().window(browserWindow);// To Switch the focus to Child Browser Windows

                //Checking the condition of Child Title
                if (driver.getTitle().equals("Basic Controls - H Y R Tutorials")) {

                    //Child Browser window 1 - Basic Controls - H Y R Tutorials
                    System.out.println("Child Browser Window 1 : Title : " + driver.getTitle());

                    driver.findElement(By.id("firstName")).sendKeys("Abc");
                    driver.findElement(By.id("lastName")).sendKeys("Xyz");
                    driver.findElement(By.id("femalerb")).click();
                    driver.findElement(By.id("englishchbx")).click();

                    driver.findElement(By.id("email")).sendKeys("abc.xyz@example.com");
                    driver.findElement(By.id("password")).sendKeys("abc123xyz");
                    driver.findElement(By.id("registerbtn")).click();

                    WebElement registrationMssg = driver.findElement(By.id("msg"));
                    System.out.println("Registration Completion Massage : " + registrationMssg.getText());

                    //driver.close();//To close the current focused Browser window ie child Browser Window 1 only

                } else {
                    //Child Browser Window 2 - XPath Practice - H Y R Tutorials
                    System.out.println("Child Window Browser 2 : Title : " + driver.getTitle());

                    driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/input[1]")).sendKeys("Abc");
                    driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/input[2]")).sendKeys("Xyz");
                    driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/input[3]")).sendKeys("abc.xyz@example.com");
                    driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/div[2]/input")).sendKeys("abc123xyz");
                    driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/input[4]")).sendKeys("abc123xyz");
                    driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/div[3]/button[1]")).click();

                    //driver.close();//To close the current focused Browser window ie child Browser Window 2 only
                }
            }
        }

        System.out.println("---------------------------------------------------");
        driver.switchTo().window(parentBrowserWindow);
        System.out.println("Parent Browser Window Title : " + driver.getTitle());

        //driver.close();// To close the current focused Browser window ie parent Browser window only
        //driver.quit();// To close the multiple Browser windows opened by driver ie both parent & child Browser windows
    }
}

