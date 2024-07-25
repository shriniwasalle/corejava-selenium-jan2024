package org.alpha.sanjeevani.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        String userName="standard_user";
        String passWard="secret_sauce";
       // .id
        WebElement txtuserName=driver.findElement(By.id("user-name"));
        txtuserName.sendKeys("standard_user"); //enter standard_user

        // .name
        WebElement txtPassward=driver.findElement(By.name("password"));
        txtPassward.sendKeys("secret_sauce");// enter password

        Thread.sleep(2000);// 2000 m sec= 2second when we want to set time

       WebElement btnLogin= driver.findElement(By.id("login-button"));//enter button
        btnLogin.click();

        String expectedUrl="https://www.saucedemo.com/inventory.html";// enter URL

        String actualUrl=driver.getCurrentUrl();
        System.out.println("Actual Url"+actualUrl);

        if (actualUrl.equalsIgnoreCase(expectedUrl)) System.out.println("Test case pass");
        else System.out.println("Test case fail");

        driver.close();
    }
}
