package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Collections;

public class TestChromeOptions extends BaseTest{
    WebDriver driver;

    @BeforeMethod
    public void init() throws MalformedURLException {
        driver=initBrowser("https://www.google.com/","chrome");
    }
    @Test
    public void verifyChromeOptions(){}
}
