package org.alpha.shriniwas.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TestWindowHandle extends BaseTest {

    WebDriver driver;
    @BeforeMethod
    public void init() {
        driver = initBrowser("https://www.hyrtutorials.com/p/window-handles-practice.html", "chrome");
    }

    @Test
    public void verifyWindowHandle() throws InterruptedException {

        String parentWindow = driver.getWindowHandle(); // To get the unique id of the window

        System.out.println("Parent Window Id : " +parentWindow); // 8A6F

        driver.findElement(By.id("newWindowBtn")).click();

        Set<String> windows = driver.getWindowHandles();

        System.out.println("Multiple Window Ids : " +windows); // {8A6F, 4E20}

        for (String window : windows) {
            System.out.println(window);

            // window != parentWindow ==> Switch the Focus to window
            // window == parentWindow ==> Don't switch / Skip

            // parentWindow.equals(window) => !8A6F.equals(8A6F) => !true => false  => Don't switch
            // !parentWindow.equals(window) =>  !8A6F.equals(4E20) =>  !false => true => switch

            if(!parentWindow.equals(window)) {
                driver.switchTo().window(window); // Switch Focus to the Child window
                System.out.println("Child Window Title : " +driver.getTitle());
                Thread.sleep(2000);
                driver.findElement(By.name("fName")).sendKeys("Shriniwas");
                driver.close();
            }
        }

        driver.switchTo().window(parentWindow);

        System.out.println("Parent Title" +driver.getTitle());

        driver.close(); // It will close the current focused window
        // driver.quit(); // It will close all the windows opened by driver
    }
}
