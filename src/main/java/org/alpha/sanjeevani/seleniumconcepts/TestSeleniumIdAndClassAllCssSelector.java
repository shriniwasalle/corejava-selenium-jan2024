package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumIdAndClassAllCssSelector {
    @Test
    public void UsingCssSelector() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement txtUserName = driver.findElement(By.cssSelector(".input_error.form_input[placeholder='Username']"));
        txtUserName.sendKeys("standard_user");

        WebElement txtPassword = driver.findElement(By.cssSelector(".input_error.form_input[placeholder='Password']"));
        txtPassword.sendKeys("secret_sauce1");

        WebElement btnClick = driver.findElement(By.cssSelector("input[data-test='login-button']"));
        btnClick.click();

        WebElement error = driver.findElement(By.cssSelector("h3[data-test='error']"));

        String actualError = error.getText();

        String expectedError = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualError, expectedError);

    }
}
