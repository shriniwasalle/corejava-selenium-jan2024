package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestNavigation extends BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void init() throws MalformedURLException {
        driver = initBrowser("https://www.saucedemo.com/", "chrome");

    }
    @Test

    public void verifyNavigation() throws InterruptedException {
        WebElement txtUserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        txtUserName.sendKeys("standard_user");
        //name
        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("secret_sauce");

        WebElement btn = driver.findElement(By.id("login-button"));
        btn.click();

        Thread.sleep(3000);

        WebDriver.Navigation navigate=driver.navigate();
        navigate.back();

        Thread.sleep(3000);
        navigate.forward();

        Thread.sleep(3000);
        navigate.refresh();
    }

}
