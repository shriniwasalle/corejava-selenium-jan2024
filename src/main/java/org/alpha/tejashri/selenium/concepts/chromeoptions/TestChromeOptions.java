package org.alpha.tejashri.selenium.concepts.chromeoptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestChromeOptions {
    @Test
    public void verifyChromeOptions() {

        //ChromeOptions is an in selenium.chrome
        //Created the object of ChromeOptions
        ChromeOptions options = new ChromeOptions();

        //1. To disable Info Bar using Collections.singletonList() method
        //options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

        //To disable Info Bar using Arrays.asList() method
        //options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));

        //To disable Info Bar using String[]
        //String [] strArr ={"enable-automation"};
        //options.setExperimentalOption("excludeSwitches", strArr);

        //without storing in another variable
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        //Headless --> Execute Script without opening the browser window
        //Headed --> Execute Script with opening the browser window

        //2. Headless Mode
        //options.addArguments("--headless");
        //options.addArguments("headless");

        //Incognito Mode --> Chrome won’t save: Your browsing history, Cookies and site data, Information entered in forms

        //3. Open in Incognito Mode
        //options.addArguments("incognito");

        //4.To maximize window using chrome options
        options.addArguments("--start-maximized");


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        //driver.manage().window().maximize();

        driver.close();
    }
}