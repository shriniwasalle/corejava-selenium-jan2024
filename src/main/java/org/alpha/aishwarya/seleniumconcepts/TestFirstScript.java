package org.alpha.aishwarya.seleniumconcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Automation/drivers/chromedriver.exe"); // Access the path of driver
        ChromeDriver driver = new ChromeDriver(); // Opening Blank chrome Browser
        //driver.get("https://www.w3schools.com/"); // open Website 1
        //driver.get("https://saucedemo.com");   // sauce demo site open 2
        driver.get("https://www.flipkart.com/"); // Site3: flipcart


        driver.manage().window().maximize(); // Maximaize window or Browser, intially it display like Tab view

        String title = driver.getTitle();  // find page title = Swag Labs print
        System.out.println("Title of Page: " + title);

        //driver.close(); // 1 browser close at a time

        // driver.quit(); used to close Multiple browser close


    }
}
/** ---OutPut----
 * Starting ChromeDriver 123.0.6312.58 (6b4b19e9dfbb93aa414dc045bd445287977d8d7a-refs/branch-heads/6312_46@{#3}) on port 33534
 * Only local connections are allowed.
 * Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
 * ChromeDriver was started successfully.
 * Mar 29, 2024 1:10:25 AM org.openqa.selenium.remote.ProtocolHandshake createSession
 * INFO: Detected dialect: W3C
 * Title of Page: Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!
 */
























