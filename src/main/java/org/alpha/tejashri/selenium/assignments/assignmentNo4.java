package org.alpha.tejashri.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

        driver.close();
    }
}