package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstScript {
    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeDriver driver=new ChromeDriver();//creating object of ChromeDriver class

        //open website
        driver.get("https://www.saucedemo.com/");

        //maximize the window
        driver.manage().window().maximize();

        //To get the title
        String title= driver.getTitle();
        System.out.println("Title :"+title);

        //closing the browser
      // driver.quit(); used for multiple windows/browser close
    }
}
