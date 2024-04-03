package org.alpha.darshan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplainMaximizeCode {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");

       WebDriver.Options options= driver.manage();//options is inner interface of webdriver interface
      WebDriver.Window window=  options.window();
      window.maximize();
    }
}
