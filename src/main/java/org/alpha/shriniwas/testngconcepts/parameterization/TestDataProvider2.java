package org.alpha.shriniwas.testngconcepts.parameterization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDataProvider2 {

    @Test(dataProvider = "getObject2DArrayData", dataProviderClass = DataProviderValuesClass.class)
    public void verifyLogin(String userName, String password, String type) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(userName); // standard_user
        driver.findElement(By.id("password")).sendKeys(password); // secret_sauce
        driver.findElement(By.id("login-button")).click();

        switch (type) {
            case "valid" -> {
                String actualTitle = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
                String expectedTitle = "Products";
                Assert.assertEquals(actualTitle, expectedTitle);
            }
            case "locked_out" -> {
                String actualErrorMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
                Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
            }
            case "invalid" -> {
                String actualErrorMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
                Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
            }
        }

        driver.close();
    }

    @Test(dataProvider = "getObjectArrayData", dataProviderClass = DataProviderValuesClass.class)
    public void verifyBrowsers(String browser) {

        WebDriver driver = null;

        switch (browser) {
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            case "edge" -> {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
        }

        driver.get("https://www.saucedemo.com/");
    }

}
