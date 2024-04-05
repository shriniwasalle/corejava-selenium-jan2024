package org.alpha.tejashri.selenium.assignments.AssignmentNo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignmentNo1_VerifyingTitleWithFirefoxDrive {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title : " +actualTitle);

        String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

        if (expectedTitle.equals(actualTitle))
            System.out.println("Test case Pass");
        else System.out.println("Test case Fail");

        driver.close();
    }
}
