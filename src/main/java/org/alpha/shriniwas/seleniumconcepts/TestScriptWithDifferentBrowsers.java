package org.alpha.shriniwas.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestScriptWithDifferentBrowsers {

    static WebDriver driver;

    public static final String CONFIG_FILE_PATH = "D:\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\shriniwas\\seleniumconcepts\\automation_config.properties";

    public static void initBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
    }

    public static String getPropertiesValue(String key) throws IOException {
        File file = new File(CONFIG_FILE_PATH);
        FileInputStream fileInputStream = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileInputStream);

        return prop.getProperty(key); // It will return value of property
    }

    public static void main(String[] args) throws IOException {

        String browserValue = getPropertiesValue("browser");
        String urlValue = getPropertiesValue("url");

        initBrowser(browserValue);
        driver.get(urlValue);


        String actualTitle = driver.getTitle(); // Google
        String expectedTitle = "Google";

        if(actualTitle.equals(expectedTitle))
            System.out.println("Test Case Pass");
        else
            System.out.println("Test Case Fail");

        driver.close();
    }
}
