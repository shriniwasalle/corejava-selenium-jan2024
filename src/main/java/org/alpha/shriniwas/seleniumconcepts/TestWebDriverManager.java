package org.alpha.shriniwas.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebDriverManager {

    public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
        // WebDriverManager.firefoxdriver().setup();
        // WebDriverManager.edgedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        String actualTitle = driver.getTitle(); // Google
        String expectedTitle = "Google";

        if(actualTitle.equals(expectedTitle))
            System.out.println("Test Case Pass");
        else
            System.out.println("Test Case Fail");

        driver.close();
    }
}
