package org.alpha.aishwarya.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // Downloading Lastest Version Browser driver

        WebDriver driver = new ChromeDriver(); // Creating Chrome browser Object

        driver.get("https://www.saucedemo.com/"); // Enter URL

        driver.manage().window().maximize();

        // 1. Using id locator : inspect
        WebElement txtUserName = driver.findElement(By.id("user-name"));// WebElement return type of FindElement
        txtUserName.sendKeys("standard_user"); // Enter UserName

        //Thread.sleep(5000);

        // 2. Using name Locator
        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("secret_sauce"); // Enter Password

        // Thread.sleep(5000); // 5000 m sec = 5 sec

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click(); // Click on Login button

        String expectedUrl = "https://www.saucedemo.com/inventory.html";

        String actualUrl = driver.getCurrentUrl(); // Current Browser Url Find
        System.out.println("Actual Url: " + actualUrl);

        // Testing using Expected and Actual Result
        if (actualUrl.equalsIgnoreCase(expectedUrl))
            System.out.println("Test Case Pass");
        else
            System.out.println("Test Case Fail");

        driver.close();
    }
}

/** ----OUTPUT----
 * SLF4J(W): No SLF4J providers were found.
 * SLF4J(W): Defaulting to no-operation (NOP) logger implementation
 * SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
 * Starting ChromeDriver 123.0.6312.86 (9b72c47a053648d405376c5cf07999ed626728da-refs/branch-heads/6312@{#698}) on port 40988
 * Only local connections are allowed.
 * Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
 * ChromeDriver was started successfully.
 * Apr 02, 2024 12:13:14 AM org.openqa.selenium.remote.ProtocolHandshake createSession
 * INFO: Detected dialect: W3C
 * Actual Url: https://www.saucedemo.com/inventory.html
 * Test Case Pass
 */

