package org.alpha.darshan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestWithDiffBrowser {

    static WebDriver driver;

    public static final String file_path="D:\\softwareTesting\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\darshan\\selenium\\config.properties";



    public static void browserInit(String browser) {
        if (browser.equals("chrome")) {

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();

            driver.manage().window().maximize();


        } else if (browser.equals("firefox")) {
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
            driver.manage().window().maximize();


        } else if (browser.equals("Edge")) {
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }
    }
    public static String getValue(String key) throws IOException {

        File file= new File(file_path);
        FileInputStream fileInputStream= new FileInputStream(file);
        Properties pr= new Properties();
        pr.load(fileInputStream);
        return pr.getProperty(key);
    }


    public static void main(String[] args) throws IOException {

            String browserValue=  getValue("browser");
            String urlValue=getValue("url");


        browserInit(browserValue);
        driver.get(urlValue);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        if (actualTitle.equals(expectedTitle))
            System.out.println("Test Case pass");
        else System.out.println("Test Case Fail");
    }
}


