package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestTagNameLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // .tagName

        List<WebElement> txtBoxes = driver.findElements(By.tagName("input"));
        System.out.println(txtBoxes.size());

        txtBoxes.get(0).sendKeys("standard_user");

        txtBoxes.get(1).sendKeys("secret_sauce");

        txtBoxes.get(2).click();

        //driver.close();
    }
}
