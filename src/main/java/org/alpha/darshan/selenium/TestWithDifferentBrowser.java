package org.alpha.darshan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestWithDifferentBrowser {

    static WebDriver driver;
     public static final  String CONFIG_URL_FILEPATH="D:\\softwareTesting\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\darshan\\selenium\\config.properties";
    public static void initBrowser(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new ChromeDriver();
        }
    }
    public static void main(String[] args) throws IOException {

        File file = new File(CONFIG_URL_FILEPATH);
        FileInputStream fileInputStream = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileInputStream);
        String browserValue = prop.getProperty("browser");
        String urlValue = prop.getProperty("url");
        initBrowser(browserValue);
        driver.get(urlValue);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        if (actualTitle.equals(expectedTitle))
            System.out.println("Test Case Pass");
        else
            System.out.println("Test Case Fail");
    }

}

