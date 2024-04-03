package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestSeleniumLocators1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // .className

        List<WebElement> txtBoxes = driver.findElements(By.className("input_error"));
        txtBoxes.get(0).sendKeys("standard_user");
        WebElement userPassword = txtBoxes.get(1);
        userPassword.sendKeys("secret_sauce");

        Thread.sleep(2000);// 2000 m sec= 2second when we want to set time

        WebElement btnLogin = driver.findElement(By.id("login-button"));//enter button
        btnLogin.click();

        driver.close();
    }
}
