package org.alpha.tejashri.selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSeleniumLocators_className {
    @Test
    public void verifyLocators() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //3. className locator
        //If multiple elements then use List<WebElement> in that findElements()
        List<WebElement> txtBoxes = driver.findElements(By.className("input_error"));//{webElement, webElement}
        System.out.println("Total WedElements : " + txtBoxes.size());

        WebElement userName = txtBoxes.get(0);
        userName.sendKeys("standard_user");

        //WebElement password = txtBoxes.get(1);
        //without storing in an another variable
        txtBoxes.get(1).sendKeys("secret_sauce");

        WebElement btnLogin = driver.findElement(By.className("submit-button"));
        btnLogin.click();

        driver.close();

    }
}
