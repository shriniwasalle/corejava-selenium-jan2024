package org.alpha.tejashri.selenium.firefoxdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWbDriverManagerInFirefox {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);

        if (title.equals("Google"))
            System.out.println("Test case Pass");
        else System.out.println("Test case Fail");

        driver.close();
    }
}
