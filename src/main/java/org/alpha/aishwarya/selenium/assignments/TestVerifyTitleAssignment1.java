package org.alpha.aishwarya.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestVerifyTitleAssignment1 {

    @Test
    public void getTitle(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        String actualtitle = driver.getTitle();
        System.out.println(actualtitle);

        String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

        if (actualtitle.equals(expectedtitle))
            System.out.println("Test case Pass");
        else System.out.println("Test case Fail");





    }




}
