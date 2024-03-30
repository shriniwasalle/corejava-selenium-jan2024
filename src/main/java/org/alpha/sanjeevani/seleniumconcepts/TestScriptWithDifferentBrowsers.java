package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScriptWithDifferentBrowsers {
    public static void main(String[] args) {

        String browser = "chrome";

        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com/");
            String actualTitle = driver.getTitle();//Google
            String expectedTitle = "Google";

            if (actualTitle.equals(expectedTitle))
                System.out.println("Test case pass");

            else
                System.out.println("Test case fail");

                 driver.close();

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();

            WebDriver driver = new FirefoxDriver();

            driver.get("https://www.google.com/");
            String actualTitle = driver.getTitle();//Google
            String expectedTitle = "Google";

            if (actualTitle.equals(expectedTitle))
                System.out.println("Test case pass");
            else
                System.out.println("Test case fail");

            driver.close();

        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.google.com/");
            String actualTitle = driver.getTitle();//Google
            String expectedTitle = "Google";

            if (actualTitle.equals(expectedTitle))
                System.out.println("Test case pass");

            else
                System.out.println("Test case fail");


        }
    }
}

