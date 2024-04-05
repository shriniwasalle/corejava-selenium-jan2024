package org.alpha.tejashri.selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSeleniumLocators_partialLinkText {
    @Test
    public void verifyLocators(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        //6.partialLinkText Locator : It will work only on links i.e. <a href="....">ABCD</a>
        WebElement partLnkTxt = driver.findElement(By.partialLinkText("How Search"));//with partial text - it works
        partLnkTxt.click();

        driver.close();
    }
}
