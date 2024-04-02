package org.alpha.tejashri.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWbDriverManagerInChromeDriver {
    public static void main(String[] args) {
        //Directly will set the updated version of driver by using WebDriverManager, no need to set hard coded set property
        //Automatic downloaded driver path in our local. Check in-> C:\Users\parth\.cache\selenium\chromedriver\win64\123.0.6312.86

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);

        //In if else condition after if statement only 1 statement
        //then no need of { } parenthesis\brackets, also same for else
        if (title.equals("Google"))
            System.out.println("Test case Pass");
        else System.out.println("Test case Fail");

        driver.close();
    }
}
