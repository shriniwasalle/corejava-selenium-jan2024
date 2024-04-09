package org.alpha.tejashri.selenium.concepts.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumLocators_cssSelector {

    @Test
    public void verifyCssSelector() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        //8. cssSelector locator with id (#) attribute, Here hash (#) is used as an id attribute
        WebElement textUserName = driver.findElement(By.cssSelector("input#user-name"));
        //WebElement textUserName = driver.findElement(By.cssSelector("#user-name"));//without tagName
        textUserName.sendKeys("standard_user");

        //8. cssSelector locator with child attribute
        WebElement textPassword = driver.findElement(By.cssSelector("form>div:nth-child(2)>input"));
        textPassword.sendKeys("secret_sauce");

        Thread.sleep(2000);

        //8. cssSelector locator with class (.) attribute. Here dot (.)  is used as a class attribute
        WebElement btnLogin = driver.findElement(By.cssSelector("input.submit-button.btn_action"));
        //WebElement btnLogin = driver.findElement(By.cssSelector(".submit-button.btn_action"));// without tagName
        btnLogin.click();

        String expectedUrl = "https://www.saucedemo.com/inventory.html";

        String actualUrl = driver.getCurrentUrl();
        System.out.println("Actual URL : " + actualUrl);

        Assert.assertEquals(actualUrl, expectedUrl);

        driver.close();
    }
}
