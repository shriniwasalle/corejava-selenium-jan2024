package org.alpha.aishwarya.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumLoginNegativeTestUsingTestng {

    @Test  // In TestNg main method NOT allowed
    public void verifyLoginWithInvalidCreds() throws InterruptedException {  // Method creation
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/"); // Enter URL

        driver.manage().window().maximize();

        // xpath
        WebElement txtUserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        txtUserName.sendKeys("standard_user"); // Enter UserName

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("secret_sauce123"); // Enter Password

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click(); // Click on Login button

        // Xpath Syntax -> //tagName[@attributeName = "attribute-value"]
        // xpath : //h3[@data-test = "error"]

        WebElement error = driver.findElement(By.xpath("//h3[@data-test = 'error']"));

        String actualErrorText = error.getText();
        String expectedErrorText = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualErrorText, expectedErrorText); // actual, expected // Using Assert class we compare actual and Expected result

        driver.close();
    }
}

/**
 * -----OUTPUT-----
 * Opened Chrome Browser and Entered Correct UserName and incorrect Password
 * SLF4J(W): No SLF4J providers were found.
 * SLF4J(W): Defaulting to no-operation (NOP) logger implementation
 * SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
 * Starting ChromeDriver 123.0.6312.86 (9b72c47a053648d405376c5cf07999ed626728da-refs/branch-heads/6312@{#698}) on port 10923
 * Only local connections are allowed.
 * Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
 * ChromeDriver was started successfully.
 * Apr 02, 2024 12:37:11 AM org.openqa.selenium.remote.ProtocolHandshake createSession
 * INFO: Detected dialect: W3C
 * <p>
 * ===============================================
 * Default Suite
 * Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
 * ===============================================
 */