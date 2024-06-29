package org.alpha.sanjeevani.assignment.assignment8.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest8 {
   WebDriver driver;
    public WebDriver initBrowser(String url, String browser){

        if(browser.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

        }
        if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();

        }
        if (browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();

        }
           driver.get(url);
           driver.manage().window().maximize();
           return driver;
    }
}
