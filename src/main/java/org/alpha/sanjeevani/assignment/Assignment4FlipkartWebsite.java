package org.alpha.sanjeevani.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment4FlipkartWebsite {
    @Test
    public void verifyTitle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();

        System.out.println("Title verification completed successfully.");

        Assert.assertTrue(driver.getTitle().length()>10);
       // Assert.assertTrue(actualTitle.length()>10,"Title has more than 10 characters");


        System.out.println("Title has more than 10 characters");
        driver.close();
    }
    }
