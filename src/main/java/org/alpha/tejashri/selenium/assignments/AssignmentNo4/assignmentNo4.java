package org.alpha.tejashri.selenium.assignments.AssignmentNo4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assignmentNo4 {

    @Test
    public void verifyTitleChar() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();

        System.out.println("Title : " + driver.getTitle());

        String title = driver.getTitle();

        System.out.println("Total Characters in Title : " + title.toCharArray().length);

        if (title.toCharArray().length >= 10) {
            System.out.println("Title has more than 10 char");
        } else {
            System.out.println("Title has less than 10 char");
        }

        //Assertions
        Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

        driver.close();
    }
}