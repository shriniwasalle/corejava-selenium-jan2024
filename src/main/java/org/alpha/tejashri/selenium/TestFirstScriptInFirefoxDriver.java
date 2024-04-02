package org.alpha.tejashri.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirstScriptInFirefoxDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Tejashri\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println("Title : " + title);//Swag Labs

        System.out.println("Current Url : " + driver.getCurrentUrl());

        String pageSource = driver.getPageSource();
        System.out.println("Page Source : " + pageSource);

        driver.close();
        driver.quit();
    }
}
