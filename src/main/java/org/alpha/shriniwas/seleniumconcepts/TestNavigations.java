package org.alpha.shriniwas.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestNavigations extends BaseTest {

    WebDriver driver;
    @BeforeMethod
    public void init() throws MalformedURLException {
        driver = initBrowser("https://www.saucedemo.com/", "chrome");
    }

    @Test
    public void verifyNavigationMethods() throws InterruptedException {
        WebElement txtUserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        txtUserName.sendKeys("standard_user"); // Enter UserName

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("secret_sauce"); // Enter Password

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click(); // Click on Login button

        Thread.sleep(2000);

        WebDriver.Navigation navigate = driver.navigate();
        navigate.back();

        Thread.sleep(2000);
        navigate.forward();

        Thread.sleep(2000);
        navigate.refresh();
    }
}
