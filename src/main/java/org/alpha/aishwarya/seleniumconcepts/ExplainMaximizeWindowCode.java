package org.alpha.aishwarya.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplainMaximizeWindowCode {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Automation/drivers/chromedriver.exe"); // Access the path of driver
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        WebDriver.Options options = driver.manage();// return type= WebDriver.Options (Becz Options is an inner Interface of WebDriver)
        WebDriver.Window win = options.window(); // Return type of window() = WebDriver.Window (Window also a Interface in Webdriver)
        win.maximize(); // and Window interface mdhye maximize method ahe so called & -- minimize() = void return type that's we can't store this method in Variable..

        System.out.println("Understanding maximize() method ");

        driver.manage().window().fullscreen();  // top tab line+ close,minimize and maximize icons not displayed while opening webpage in full screen
        System.out.println("Testing full Screen size of WebPage");

        String currenturl = driver.getCurrentUrl();
        System.out.println("Current URL " + currenturl);

        String pagesource = driver.getPageSource();
        System.out.println("HTML Source code printed " + pagesource);

        // driver.close();
    }
}


/**
 * Starting ChromeDriver 123.0.6312.58 (6b4b19e9dfbb93aa414dc045bd445287977d8d7a-refs/branch-heads/6312_46@{#3}) on port 44024
 * Only local connections are allowed.
 * Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
 * ChromeDriver was started successfully.
 * Mar 29, 2024 1:26:20 AM org.openqa.selenium.remote.ProtocolHandshake createSession
 * INFO: Detected dialect: W3C
 * Understanding maximize() method
 * Testing full Screen size of WebPage
 * Current URL https://www.flipkart.com/
 * <p>
 * HTML page code Soruce open
 */