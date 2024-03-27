package org.alpha.tejashri.selenium.chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Tejashri\\Drivers\\chromedriver.exe");

        //Creating the object of ChromeDriver
        WebDriver driver = new ChromeDriver();//WebDriver is parent of ChromeDrive
        //WebDriver -> Interface, ChromeDriver -> class

        //Open Website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //To maximize the window size
        driver.manage().window().maximize();

        //To fullscreen the window size
        //driver.manage().window().fullscreen();

        //Get the Title of the windows/browsers
        String title = driver.getTitle();//<title>OrangeHRM<title>
        System.out.println("Title : " + title);

        //To Check the Current Url
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //To Check the Page Source/html file
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        //Closing the browser
        driver.close();

        // To close multiple windows/browsers
        driver.quit();
    }
}
