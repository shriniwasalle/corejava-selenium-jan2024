package org.alpha.darshan.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestVerifyTheTitle {

    static WebDriver driver;

    public  final static String file_path_value="D:\\\\softwareTesting\\\\corejava-selenium-jan2024\\\\src\\\\main\\\\java\\\\org\\\\alpha\\\\darshan\\\\selenium\\\\assignment\\\\config.properties";
    public static void browserInit(String browser){


        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
        }if (browser.equalsIgnoreCase("Edge")){
            WebDriverManager.edgedriver().setup();
            driver= new EdgeDriver();
        }
    }

    public static String getValue(String key) throws IOException {
        File file= new File(file_path_value);

        FileInputStream fileInputStream= new FileInputStream(file);

        Properties pr= new Properties();

        pr.load(fileInputStream);

        return pr.getProperty(key);
    }


    @Test
    public void getTitleVerification() throws IOException {


       String browserValue= getValue("browser");
       String urlValue= getValue("urlverifyTitle");

        browserInit(browserValue);

        driver.get(urlValue);

        String actualTitle= driver.getTitle();

        System.out.println(actualTitle);

        String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

        if (actualTitle.equals(expectedTitle))
            System.out.println("Test Case Pass");
        else
            System.out.println("TestCase Fail");
    }

}
