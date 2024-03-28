package org.alpha.tejashri.selenium.edgedriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestWbDriverManagerInEdge {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);

        if (title.equals("Google"))
            System.out.println("Test case Pass");
        else System.out.println("Test case Fail");

        driver.close();
    }
}
