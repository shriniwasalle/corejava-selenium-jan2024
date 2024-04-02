package org.alpha.tejashri.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestSeleniumLoginNegativeTestUsingTestNG {

    public void verifyLoginWithInvalidCreds() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement textUserName = driver.findElement(By.id("user-name"));
        textUserName.sendKeys("standard_user");//Enter username

        WebElement textPassword = driver.findElement(By.name("password"));
        textPassword.sendKeys("secret_sauc");//Enter password

        WebElement btnLogin = driver.findElement(By.name("login-button"));
        btnLogin.click();

        WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String actualErrorText = error.getText();//Epic sadface.... --> <h3> Epic sadface.... </h3>
        System.out.println("Actual Error Text : " +actualErrorText);//Epic sadface: Username and password do not match any user in this service

        String expectedErrorText = "Epic sadface: Username and password do not match any user in this service";

        // With TestNG Testing Error Text
        Assert.assertEquals(actualErrorText, expectedErrorText);
        driver.close();
    }
}
