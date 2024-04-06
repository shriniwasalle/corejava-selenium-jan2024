package org.alpha.shriniwas.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSeleniumLocatorsXpath {
    @Test
    public void xpathConcept() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/"); // Enter URL
        // driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        

        // Types of Xpath
        // 1. Absolute Xpath :
        // /html/body/div[1]/div/div[2]/div[1]/div/div/form/div[1]/input
        // /html/body/div[1]/div/div[2]/div[1]/div/div/form/div[2]/input
        // /html/body/div[1]/div/div[2]/div[1]/div/div/form/input

        // /html/body/div[1]/div/div[2]/div[1]/div/div/form/input[@data-test="login-button"]

        // 2. Relative Xpath
        // //input[@placeholder="Username"]




    }
}
