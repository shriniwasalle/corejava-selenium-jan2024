package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumLoginNegativeTestUsingTestng1 {
    @Test
    public void verifyLoginWithInvalidCreds() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();
     //id
        WebElement txtUserName=driver.findElement(By.id("user-name"));
        txtUserName.sendKeys("standard_user@1");

        //id
        WebElement txtPassward=driver.findElement(By.id("password"));
        txtPassward.sendKeys("secret_sauce");

      WebElement btn=driver.findElement(By.name("login-button"));
     btn.click();
//Using xpath
        WebElement error= driver.findElement(By.xpath("//h3[@data-test='error']"));

        String actualError=error.getText();
        String expectedError="Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualError,expectedError);
        driver.close();
    }
}
 //we put invalid username="standard_user@1" insteadOf "standard_user"