package org.alpha.shriniwas.seleniumconcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstScript {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\drivers\\chromedriver.exe");

        // Creating the Object of ChromeDriver class
        ChromeDriver driver = new ChromeDriver();

        // Open Website
        driver.get("https://www.amazon.in/");

        // Maximize the window
        driver.manage().window().maximize();

        // Get the title
        String title = driver.getTitle(); // <title>Google</title>
        System.out.println("Title: " +title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current Url: " +currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        // Closing the browser
        driver.close(); // To Close single window/browser
        // driver.quit(); To Close multiple windows/browsers
    }
}
