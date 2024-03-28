package org.alpha.aishwarya.seleniumconcepts.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Automation/drivers/chromedriver.exe"); // Access the path of driver
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println("Flipcart page title: Browser:Chrome " + title);

        //driver.close();
    }

}

/**
 * ----OutPut----
 * Starting ChromeDriver 123.0.6312.58 (6b4b19e9dfbb93aa414dc045bd445287977d8d7a-refs/branch-heads/6312_46@{#3}) on port 6669
 * Only local connections are allowed.
 * Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
 * ChromeDriver was started successfully.
 * Mar 29, 2024 1:53:57 AM org.openqa.selenium.remote.ProtocolHandshake createSession
 * INFO: Detected dialect: W3C
 * Flipcart page title: Browser:Chrome Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!
 */