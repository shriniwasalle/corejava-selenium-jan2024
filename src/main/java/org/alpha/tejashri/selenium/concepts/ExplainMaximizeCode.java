package org.alpha.tejashri.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplainMaximizeCode {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Tejashri\\Drivers\\chromedriver.exe");

        //Creating the object of ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        //Open Website
        driver.get("https://www.saucedemo.com/");

        //Explanation of maximize the browser window size
        WebDriver.Options opt = driver.manage();
        WebDriver.Window win = opt.window();
        win.maximize();// maximize the browser window size

        //Directly to maximize the window screen size
        driver.manage().window().maximize();

        //Explanation of full screen (Minimize, maximize, Close ect controls won't be visible)
        WebDriver.Options options = driver.manage();
        WebDriver.Window window = options.window();
        window.fullscreen();//fullscreen the browser window size

        //Directly to fullscreen the window screen size
        driver.manage().window().fullscreen();
    }
}
