package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleOfApplication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.co.in/");

        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        if (actualTitle.equalsIgnoreCase(expectedTitle)) System.out.println("Test Pass");
        else System.out.println("Test fail");

        driver.close();
    }

}
