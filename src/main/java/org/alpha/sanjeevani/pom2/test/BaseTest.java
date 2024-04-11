package org.alpha.sanjeevani.pom2.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    public WebDriver initBrowser(String url, String browser) {
        WebDriver driver=null;

        if (browser.equalsIgnoreCase("Chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }
}
