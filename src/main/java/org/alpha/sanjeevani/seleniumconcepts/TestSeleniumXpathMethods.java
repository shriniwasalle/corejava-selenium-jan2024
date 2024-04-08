package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumXpathMethods extends BaseTest{
    @Test
    public void applyMethod(){
        WebDriver driver=initBrowser("https://www.saucedemo.com/","chrome");

        WebElement txtUserName=driver.findElement(By.xpath("//input[contains(@name,'user-name')]"));
        txtUserName.sendKeys("standard_user");

        WebElement txtPassword=driver.findElement(By.id("password"));
        txtPassword.sendKeys("secret_sauce1");

        WebElement btn=driver.findElement(By.name("login-button"));
        btn.click();

        WebElement error=driver.findElement(By.xpath("//h3[(@data-test='error')]"));
        String actualError=error.getText();
        //System.out.println(error.getText());
        String expectedError="Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualError,expectedError);
        driver.close();

    }
}
