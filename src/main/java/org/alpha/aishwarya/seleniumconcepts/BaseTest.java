package org.alpha.aishwarya.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    WebDriver driver;

    // driver return keala ahe mhun "driver" cha return type "WebDriver" aahe so void chya thikani lihla aahe
    public WebDriver initBrowser(String url, String browser) {   // Multiple param use: baherun access kraycha aahe

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup(); // driver Automatically Download in the local system
          driver = new ChromeDriver();
           // driver.get(url); // Parameter pass keala aahe method String url
            //return driver;  // driver access kracha aahe baher chya classes mhun return keala ahe.
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
             driver = new EdgeDriver();

        }
        driver.get(url);
        return driver;
    }
}


