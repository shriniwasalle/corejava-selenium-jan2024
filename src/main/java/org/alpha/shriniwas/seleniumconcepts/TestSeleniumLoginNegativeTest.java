package org.alpha.shriniwas.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumLoginNegativeTest {

    public static void main(String[] args) throws InterruptedException {
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
        // <h3 data-test="error"> Shriniwas Alle </h3> ---> xpath : //h3[@data-test = "error"]

        WebElement error = driver.findElement(By.xpath("//h3[@data-test = 'error']"));

        String actualErrorText = error.getText();
        String expectedErrorText = "Epic sadface: Username and password do not match any user in this service";

        if (actualErrorText.equalsIgnoreCase(expectedErrorText)) System.out.println("Test Pass");
        else System.out.println("Test Fail");

        driver.close();
    }
}
