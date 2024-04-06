package org.alpha.shriniwas.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSeleniumLocators1 {
    @Test
    public void verifyLocators() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/"); // Enter URL
        // driver.get("https://www.google.com/");

        driver.manage().window().maximize();

//        List<WebElement> txtBoxes = driver.findElements(By.className("input_error")); // { WebElement, WebElement }
//        System.out.println("Total WebElements : " +txtBoxes.size());
//
//        WebElement txtUserName = txtBoxes.get(0);
//        txtUserName.sendKeys("standard_user");
//
//        WebElement txtPassword = txtBoxes.get(1);
//        txtPassword.sendKeys("secret_sauce");

        /*List<String> list = new ArrayList<>();
        String str1 = list.get(0);
        String str2 = list.get(1);*/

        Thread.sleep(2000);

        // 4. linkText : It will work only on Links i.e <a href="">ABCD</a>
//        WebElement lnkGmail1 = driver.findElement(By.linkText("How Search works"));
//        lnkGmail.click();

        // 5. partialLinkText : It will work only on Links i.e <a href="">ABCD</a>
//        WebElement lnkGmail = driver.findElement(By.partialLinkText("Search works"));
//        lnkGmail.click();

        // 6. tagName
        List<WebElement> textBoxes = driver.findElements(By.tagName("input"));
        System.out.println(textBoxes.size());

        textBoxes.get(0).sendKeys("standard_user");
        textBoxes.get(1).sendKeys("secret_sauce");
        textBoxes.get(2).click();

        driver.close();
    }
}
