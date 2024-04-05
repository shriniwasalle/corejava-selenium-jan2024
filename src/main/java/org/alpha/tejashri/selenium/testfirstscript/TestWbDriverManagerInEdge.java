package org.alpha.tejashri.selenium.testfirstscript;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestWbDriverManagerInEdge {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");

        String actualTitle = driver.getTitle();//Google
        String expectedTitle = "Google";

        System.out.println(actualTitle);

        //In if else condition after if statement only 1 statement
        //then no need of { } parenthesis\brackets, also same for else
        if (actualTitle.equals(expectedTitle))
            System.out.println("Test case Pass");
        else System.out.println("Test case Fail");

        driver.close();
    }
}
