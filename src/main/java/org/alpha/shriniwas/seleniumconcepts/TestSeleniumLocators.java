package org.alpha.shriniwas.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumLocators {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/"); // Enter URL

        driver.manage().window().maximize();

        // 1. id
        WebElement txtUserName = driver.findElement(By.id("user-name"));
        txtUserName.sendKeys("standard_user"); // Enter UserName

        Thread.sleep(5000);

        // 2. name
        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("secret_sauce"); // Enter Password

        Thread.sleep(5000); // 5000 m sec = 5 sec

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click(); // Click on Login button

        String expectedUrl = "https://www.saucedemo.com/inventory.html";

        String actualUrl = driver.getCurrentUrl();
        System.out.println("Actual Url: " +actualUrl);

        // Testing
        if(actualUrl.equalsIgnoreCase(expectedUrl))
            System.out.println("Test Case Pass");
        else
            System.out.println("Test Case Fail");

        driver.close();
    }
}
