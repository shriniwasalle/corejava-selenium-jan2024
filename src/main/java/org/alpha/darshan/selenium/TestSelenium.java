package org.alpha.darshan.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\softwareTesting\\driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.close();
    }
}
