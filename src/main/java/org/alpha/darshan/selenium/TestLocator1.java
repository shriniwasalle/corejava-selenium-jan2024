package org.alpha.darshan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestLocator1 {

    @Test
    public void  verifyLocators(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();

        List<WebElement> userName= driver.findElements(By.className("form_input"));

        userName.get(0).sendKeys("standard_user");

       userName.get(1).sendKeys("secret_sauce");

       //password.get(1).sendKeys("secret_sauce");

       driver.findElement(By.id("login-button")).click();

    }
}
