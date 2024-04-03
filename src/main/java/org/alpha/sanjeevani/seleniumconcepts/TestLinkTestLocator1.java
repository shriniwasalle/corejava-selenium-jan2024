package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLinkTestLocator1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

        // It will work only on links i.e <a href="http://www.ABCD">
        WebElement lnkGmail = driver.findElement(By.linkText("How Search works"));
        lnkGmail.click();

        driver.close();
    }
}
