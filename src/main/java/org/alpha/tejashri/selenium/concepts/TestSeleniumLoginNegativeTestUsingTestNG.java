package org.alpha.tejashri.selenium.concepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestSeleniumLoginNegativeTestUsingTestNG {

    public void verifyLoginWithInvalidCreds() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement textUserName = driver.findElement(By.id("user-name"));
        textUserName.sendKeys("standard_user");//Enter username

        WebElement textPassword = driver.findElement(By.name("password"));
        textPassword.sendKeys("secret_sauc");//Entered wrong password

        WebElement btnLogin = driver.findElement(By.name("login-button"));
        btnLogin.click();//click on login button

        WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String actualErrorText = error.getText();//Epic sadface.... --> <h3> Epic sadface.... </h3>
        System.out.println("Actual Error Text : " +actualErrorText);//Epic sadface: Username and password do not match any user in this service

        String expectedErrorText = "Epic sadface: Username and password do not match any user in this service";

        // TestNG Testing instead of using if else condition testing
        Assert.assertEquals(actualErrorText, expectedErrorText);
        driver.close();
    }
}
