package org.alpha.darshan.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestVerifyTitleCharacterValue {

   static WebDriver driver;

    public static void browserInit(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
    }
    public static String getValue(String key) throws IOException {
        File file = new File("D:\\softwareTesting\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\darshan\\selenium\\assignment\\config.properties");
        FileInputStream fileInputStream= new FileInputStream(file);
        Properties pr= new Properties();
        pr.load(fileInputStream);
        return pr.getProperty(key);
    }
    @Test
    public void verifyTitleValue() throws IOException {

       String browserValue= getValue("browser");
       String urlValue= getValue("urlverifyTitle");
        browserInit(browserValue);
        driver.get(urlValue);
        driver.manage().window().maximize();
        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);

     if (actualTitle.length()>=10)
         System.out.println("Title has more than 10 Character");
     else
         System.out.println("Title has less than 10 character");
    }

    public static class TestVerifyRegistration {

        @Test
        public void logInDetails() throws InterruptedException {

            WebDriverManager.chromedriver().setup();

            WebDriver driver= new ChromeDriver();

            driver.get("https://demo.opencart.com/");

            driver.manage().window().maximize();

            driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();

            driver.findElement(By.linkText("Login")).click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[text()=\"Register\"][@class=\"dropdown-item\"]")).click();


        }

    }
}
