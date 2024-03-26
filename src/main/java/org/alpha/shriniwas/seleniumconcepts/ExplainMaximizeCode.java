package org.alpha.shriniwas.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplainMaximizeCode {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\drivers\\chromedriver.exe");

        // Creating the Object of ChromeDriver class
        WebDriver driver = new ChromeDriver(); // WebDriver => Interface, ChromeDriver => Class
        // ChromeDriver driver = new ChromeDriver();

        // Open Website
        driver.get("https://www.amazon.in/");

        // Maximize the window
        driver.manage().window().maximize();

        /* WebDriver.Options options = driver.manage();
        WebDriver.Window win = options.window();
        win.maximize();*/

        // driver.manage().window().fullscreen(); // It will open the browser in fullscreen mode (Minimize, Maximize, Close etc controls won't be visible)
    }
}
