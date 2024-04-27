package org.alpha.shriniwas.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class TestChromeOptions extends BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void init() throws MalformedURLException {
        driver = initBrowser("https://google.com/", "chrome");
    }

    @Test
    public void verifyScreenshots() throws IOException {

    }
}