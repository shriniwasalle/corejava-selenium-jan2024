package org.alpha.tejashri.selenium.edgedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class TestFirstScriptInEdgeDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "D:\\Tejashri\\Drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println("Title : " + title);//Google

        System.out.println("Current Url : " + driver.getCurrentUrl());

        System.out.println("Page Source : " + driver.getPageSource());

        driver.close();
        driver.quit();
    }
}
