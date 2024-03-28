package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriverManager {
    public static void main(String[] args) {

         WebDriverManager.chromedriver().setup(); //setup(): This method instructs the WebDriverManager to set up the necessary WebDriver binaries.It automatically downloads the appropriate version of the Chrome driver

        //WebDriverManager.edgedriver().setup();/also we can create like this

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        String actualTitle = driver.getTitle();//Google
        String expectedTitle = "Google";

        if (actualTitle.equals(expectedTitle))

            System.out.println("Test case pass");

         else

            System.out.println("Test case fail");

        driver.close();
    }
}
