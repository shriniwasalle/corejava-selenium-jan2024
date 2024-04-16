package org.alpha.tejashri.selenium.concepts.navigations;

import org.alpha.tejashri.selenium.BaseCodeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestNavigations extends BaseCodeTest {
    WebDriver driver;

    @BeforeMethod
    public void init() throws MalformedURLException {
        driver = initBrowser("https://www.saucedemo.com/", "chrome");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void verifyNavigationMethods() throws InterruptedException {
        WebElement textUserName = driver.findElement(By.id("user-name"));
        textUserName.sendKeys("standard_user");//Enter username

        WebElement textPassword = driver.findElement(By.name("password"));
        textPassword.sendKeys("secret_sauce");//Enter password

        WebElement btnLogin = driver.findElement(By.name("login-button"));
        btnLogin.click();//Click on login btn

        Thread.sleep(2000);
        driver.navigate().back();//To go back to the previous web page

        Thread.sleep(2000);
        driver.navigate().forward();//To go to the next web page

        Thread.sleep(2000);
        driver.navigate().refresh();//To refresh the current web page
    }
}
