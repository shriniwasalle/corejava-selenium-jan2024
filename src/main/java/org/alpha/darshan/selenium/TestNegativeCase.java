package org.alpha.darshan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class TestNegativeCase {

    static WebDriver driver;

    public static void browserInit(String browser) {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
    }


    @Test
    public void negativeTest() throws IOException {

        File file = new File("D:\\softwareTesting\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\darshan\\selenium\\config.properties");

        FileInputStream fileInputStream = new FileInputStream(file);

        Properties pr = new Properties();

        pr.load(fileInputStream);

        String browserValue = pr.getProperty("browserLocator");

        browserInit(browserValue);

        String getUrlValue = pr.getProperty("urlLocator");


        driver.get(getUrlValue);

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("user-name"));

        userName.sendKeys("standard_user123");

        List<WebElement> passName = driver.findElements(By.className("form_input"));
        passName.get(1).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        WebElement error = driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));

        String actualErrorText = error.getText();

        String expectedErrorText = "Epic sadface: Username and password do not match any user in this service";
/*
        if (actualErrorText.equalsIgnoreCase(expectedErrorText))
            System.out.println("test pass");
        else
            System.out.println("test Fail");*/

        Assert.assertEquals(actualErrorText,expectedErrorText);
    }
}

