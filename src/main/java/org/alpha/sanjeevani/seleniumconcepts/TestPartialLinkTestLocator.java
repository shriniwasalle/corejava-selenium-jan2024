package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPartialLinkTestLocator {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

        // It will work only on links
        WebElement lnkGmail= driver.findElement(By.partialLinkText("How Search"));
       lnkGmail.click();

       driver.close();
    }

}
//In partialLinkText we can provide half text that means  How Search instead of "How Search works".

