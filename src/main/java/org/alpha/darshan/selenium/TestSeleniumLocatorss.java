package org.alpha.darshan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumLocatorss {

    public  static WebDriver driver;
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        driver= new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        String userName="standard_user";
        String userPass="secret_sauce";

       WebElement textUserName= driver.findElement(By.id("user-name"));
       textUserName.sendKeys(userName);
        WebElement txtPassword=  driver.findElement(By.id("password"));
        txtPassword.sendKeys(userPass);
        WebElement logInBtn= driver.findElement(By.id("login-button"));
        logInBtn.click();

    }
}
