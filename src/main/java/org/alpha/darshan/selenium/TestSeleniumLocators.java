package org.alpha.darshan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class TestSeleniumLocators {

    public static  WebDriver driver;

    static String file_path="D:\\\\softwareTesting\\\\corejava-selenium-jan2024\\\\src\\\\main\\\\java\\\\org\\\\alpha\\\\darshan\\\\selenium\\\\config.properties";
    public static void initBrowser(String browser){

        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();

            driver= new ChromeDriver();


        }else if (browser.equalsIgnoreCase("edge")){
            WebDriverManager.firefoxdriver().setup();

            driver= new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("egde")){
            WebDriverManager.edgedriver().setup();

            driver= new EdgeDriver();
        }
    }

    public static void main(String[] args) throws IOException {

        File file= new File(file_path);

        FileInputStream fileInputStream= new FileInputStream(file);

        Properties pr= new Properties();

        pr.load(fileInputStream);

        String browserL =pr.getProperty("browserLocator");
       String urlValue= pr.getProperty("urlLocator");
        initBrowser(browserL);
        
        driver.get(urlValue);
        driver.manage().window().maximize();

        WebElement userName= driver.findElement(By.id("user-name"));

        userName.sendKeys("standard_user");

       List<WebElement> userPassword= driver.findElements(By.className("form_input"));

       userPassword.get(1).sendKeys("secret_sauce");

       driver.findElement(By.id("login-button")).click();

    }
}
