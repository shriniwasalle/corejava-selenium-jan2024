package org.alpha.tejashri.selenium.concepts.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSeleniumLocators_xpath {
    @Test
    public void xpathLocatorConcept() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        /*
        4. xpath Locator : in xpath index starts from 1 not 0

        Types of xpath
        1. Absolute xpath : Write from Start(root) tag to End tag step by step. Start from single /(slash)
        eg : /html/body/div[1]/div/div[2]/div[1]/div/div/form/div[1]/input

        2. Relative xpath : Write from any relative/required tag. Start from double //(slash)
        xpath syntax--> //tagName[@attributeName = 'attributeValue']
        eg : //input[@type='password']

        3. Combination of both Absolute & Relative xpath
        eg : /html/body/div[1]/div/div[2]/div[1]/div/div/form/input[@type='submit']
        */

        //1. Absolute xpath
        WebElement txtUserName = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/form/div[1]/input"));
        txtUserName.sendKeys("standard_user");

        //2. Relative xpath
        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("secret_sauce");

        //3. Combination of both Absolute & Relative xpath
        WebElement btnLogin = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/form/input[@type='submit']"));
        btnLogin.click();

        driver.close();
    }
}
