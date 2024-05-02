package org.alpha.shruti.SeleniumConcept;


import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstScript {


    public static void main(String[] args){
        System.setProperty("Web Driver.chrome.driver", "C:\\Users\\soura\\Downloads\\chromedriver-win64");

        //Creating the object of ChromeDriver class
        ChromeDriver driver = new ChromeDriver();

        //Open Website
        driver.get("https://www.saucedemo.com/");
    }

}
