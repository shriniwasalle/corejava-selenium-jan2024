package org.alpha.aishwarya.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumLoginNegativeTestCase {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/"); // Enter URL

        driver.manage().window().maximize();

        // xpath
        WebElement txtUserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        txtUserName.sendKeys("standard_user"); // Enter UserName

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("secret_sauce88888"); // Enter Password --> TC 2 -> wrong Password Enter & Check Result

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click(); // Click on Login button

        // Xpath Syntax -> //tagName[@attributeName = "attribute-value"]
        // HTML Command: <h3 data-test="error"> SagaCandy </h3> ---> xpath : //h3[@data-test = "error"]

        WebElement error = driver.findElement(By.xpath("//h3[@data-test = 'error']")); // Validation Message Text

        String actualErrorText = error.getText();
        String expectedErrorText = "Epic sadface: Username and password do not match any user in this services"; // TC = Wrong Error message displayed that's why TC failed.

        if (actualErrorText.equalsIgnoreCase(expectedErrorText))
            System.out.println("Test Case Pass");
        else System.out.println("Test Case Fail");

        //driver.close();
    }
}


/**
 * ----OUPUT----
 * SLF4J(W): No SLF4J providers were found.
 * SLF4J(W): Defaulting to no-operation (NOP) logger implementation
 * SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
 * Starting ChromeDriver 123.0.6312.86 (9b72c47a053648d405376c5cf07999ed626728da-refs/branch-heads/6312@{#698}) on port 43977
 * Only local connections are allowed.
 * Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
 * ChromeDriver was started successfully.
 * Apr 02, 2024 12:28:52 AM org.openqa.selenium.remote.ProtocolHandshake createSession
 * INFO: Detected dialect: W3C
 * Test Case Fail
 */

