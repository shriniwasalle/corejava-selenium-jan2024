package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSeleniumLocatorXpath {
    @Test
    public  void xpathConcepts() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // .Types of Xpath

        // 1.Absolute Xpath
   // 1. Absolute Xpath :
 /*/html/body/div[1]/div/div[2]/div[1]/div/div/form/div[1]/input
                /html/body/div[1]/div/div[2]/div[1]/div/div/form/div[2]/input

                /html/body/div[1]/div/div[2]/div[1]/div/div/form/input
                /html/body/div[1]/div/div[2]/div[1]/div/div/form/input[@data-test="login-button"]
*/
       // WebElement lnkText=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/form/div[1]/input"));

        // 2.Relative Xpath
        //input[@placeholder="Username"]

        WebElement lnkText=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        lnkText.click();

        driver.close();
    }

}
