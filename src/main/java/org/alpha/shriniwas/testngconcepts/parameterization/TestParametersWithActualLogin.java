package org.alpha.shriniwas.testngconcepts.parameterization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersWithActualLogin {

    @Test
    @Parameters({"username", "password"})
    public void verifyLogin(String userName, String password) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals("", "");
    }
}
