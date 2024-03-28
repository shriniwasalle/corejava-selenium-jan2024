package org.alpha.sanjeevani.seleniumconcepts;

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

public class TestScriptWithDifferentBrowsers1 {
    static WebDriver driver;

    public static void initBrowser(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
    }

    public static void main(String[] args) throws IOException {
        String browser = "chrome";
        File file = new File("C:\\Users\\Dell\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\sanjeevani\\seleniumconcepts\\automationconfig.properties");

        FileInputStream FileInputStream = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(FileInputStream);
        String browserValue = prop.getProperty("browser");
        System.out.println("browser Value :: " + browserValue);

        String browserUrl = prop.getProperty("url");
        System.out.println("browser url :: " + browserUrl);

        initBrowser(browserValue);

        driver.get("https://www.google.com/");
        String actualTitle = driver.getTitle();//Google
        String expectedTitle = "Google";

        driver.manage().window().maximize();

        if (actualTitle.equals(expectedTitle))
            System.out.println("Test case pass");
        else
            System.out.println("Test case fail");
        driver.close();
    }
}
