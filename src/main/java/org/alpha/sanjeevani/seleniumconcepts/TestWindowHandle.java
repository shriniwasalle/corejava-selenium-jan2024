package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Set;

public class TestWindowHandle extends BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void init() throws MalformedURLException {
        driver = initBrowser("https://www.hyrtutorials.com/p/window-handles-practice.html", "chrome");
    }
    @Test
    public void verifyWindowHandle() throws InterruptedException {

        String parentWindow = driver.getWindowHandle();//To handle the unique id of the window
        System.out.println("parent Window id " + parentWindow);// parent window id E09

        driver.findElement(By.id("newWindowBtn")).click();

        Set<String> windows = driver.getWindowHandles();

        System.out.println("multiple ids of the Window" + windows);//parent window id E09 and 1CB

        for (String window : windows) {
            System.out.println(window);

            //window!=parentWindow ------>switch The focus to the window
            //window==parentWindow ------> do not switch The focus to the window/ skip
            //parentWindow.equals(window)  ===> !E09 equals (E09)= !true=====>false
            //parentWindow.equals(window)  ===> !E09 equals (1CB)= !true=====>false

            if (!parentWindow.equals(window)) {
                driver.switchTo().window(window);
                System.out.println("child window title" + driver.getTitle());//switch focus to the child window
                Thread.sleep(2000);
                driver.findElement(By.name("fName")).sendKeys("sanjeevani");
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("title of parent window" + driver.getTitle());

        //driver.close();it will close the current focused window
        driver.quit();//it will close all the windows opened by driver
    }
}
