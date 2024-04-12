package org.alpha.darshan.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class TestLinkText {

    public void verifyLinkText(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement gmaillink= driver.findElement(By.linkText("Gmail"));
        
        gmaillink.click();


    }
}
