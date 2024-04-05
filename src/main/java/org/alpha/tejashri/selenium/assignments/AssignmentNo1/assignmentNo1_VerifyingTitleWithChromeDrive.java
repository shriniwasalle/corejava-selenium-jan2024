package org.alpha.tejashri.selenium.assignments.AssignmentNo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentNo1_VerifyingTitleWithChromeDrive {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title : " +actualTitle);

        //Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!

        if (actualTitle.equals("Flipkart"))
            System.out.println("Test case Pass");
        else System.out.println("Test case Fail");

        driver.close();
    }
}
