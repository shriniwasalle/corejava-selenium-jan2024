package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumIdAndClassCssSelector {
    @Test
    public void UsingCssSelector() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement txtUserName = driver.findElement(By.cssSelector("input#user-name"));
        txtUserName.sendKeys("standard_user1");

        WebElement txtPassword = driver.findElement(By.cssSelector("#password"));
        txtPassword.sendKeys("secret_sauce");

        WebElement btnClick = driver.findElement(By.cssSelector("#login-button"));
        btnClick.click();

        WebElement error = driver.findElement(By.cssSelector("h3[data-test='error']"));

        String actualError = error.getText();

        String expectedError = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualError, expectedError);

    }
}
