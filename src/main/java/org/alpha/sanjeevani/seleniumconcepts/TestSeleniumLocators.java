package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumLocators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        String userName="standard_user";
        String passWard="secret_sauce";

        WebElement txtuserName=driver.findElement(By.id("user-name"));
        txtuserName.sendKeys("standard_user");

        WebElement txtPassward=driver.findElement(By.name("password"));
        txtPassward.sendKeys("secret_sauce");

    }
}
