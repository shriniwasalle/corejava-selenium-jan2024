package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumLoginNegativeTestUsingTestng {
    @Test
    public void verifyLoginWithInvalidCreds() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        //xpath
        WebElement txtUserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        txtUserName.sendKeys("standard_user");
        //name
        WebElement txtPassward = driver.findElement(By.name("password"));
        txtPassward.sendKeys("secret_sauce@2");

        WebElement btn = driver.findElement(By.id("login-button"));
        btn.click();

        //xpath syntax= --> //tagName[@attributeName="attribute-value"]
        //<h3>data-test="error"</h3>
        WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));

        String actualError = error.getText();
        String expectedError = "Epic sadface: Username and password do not match any user in this service";

       /* if (actualErrorTest.equalsIgnoreCase(expectedError)) System.out.println("Test Pass");
        else System.out.println("Test Fail");
*/
        Assert.assertEquals(actualError,expectedError);
        driver.close();
    }
}
//we put invalid passWard="secret_sauce@2" insteadOf secret_sauce"