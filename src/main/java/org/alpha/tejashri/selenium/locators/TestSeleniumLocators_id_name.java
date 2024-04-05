package org.alpha.tejashri.selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumLocators_id_name {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Can store in a variable also
        // String userName = "standard_user";
        // String password = "secret_sauce";

        //1. id locator
        WebElement textUserName = driver.findElement(By.id("user-name"));
        textUserName.sendKeys("standard_user");//Enter username

        //2. name locator
        WebElement textPassword = driver.findElement(By.name("password"));
        textPassword.sendKeys("secret_sauce");//Enter password

        WebElement btnLogin = driver.findElement(By.name("login-button"));

        //Thread.sleep() will throws InterruptedException in main method
        Thread.sleep(5000);// 5000 milli Seconds = 5 Seconds will wait

        btnLogin.click();// Click on login button

        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        System.out.println("Actual URL : " + actualUrl);

        //Testing with if else condition
        if (expectedUrl.equals(actualUrl))
            System.out.println("Test Case Pass");
        else System.out.println("Test Case Fail");

        driver.close();
    }
}
