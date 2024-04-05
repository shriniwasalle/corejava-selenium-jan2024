package org.alpha.tejashri.selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSeleniumLocators_tagName {
    @Test
    public void verifyLocators() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //7. tagName : used to find out multiple elements
        //If multiple elements then use List<WebElement> in that findElements()
        List<WebElement> txtBoxes = driver.findElements(By.tagName("input"));
        System.out.println(txtBoxes.size());//3

        txtBoxes.get(0).sendKeys("standard_user");
        txtBoxes.get(1).sendKeys("secret_sauce");
        txtBoxes.get(2).click();
        driver.close();
    }
}