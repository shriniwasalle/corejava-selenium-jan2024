package org.alpha.sanjeevani.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAssignment1VerifyTitleOfApplication1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        //String currentUrl=driver.getCurrentUrl();
        //System.out.println(currentUrl);

        driver.manage().window().maximize();

       String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
       String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

        if (actualTitle.equalsIgnoreCase(expectedTitle)) System.out.println("Test Pass");
        else System.out.println("Test fail");

       driver.close();
    }

}
