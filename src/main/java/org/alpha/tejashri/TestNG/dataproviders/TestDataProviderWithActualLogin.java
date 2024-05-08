package org.alpha.tejashri.TestNG.dataproviders;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDataProviderWithActualLogin {

    @Test(dataProvider = "getIteratorObject2DArrayData", dataProviderClass = DataProviderValuesClass.class)
    public void verifyLogin(String userName, String password, String type) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        switch (type) {
            case "valid", "problem", "performance", "error", "visual" -> {

                String actualHeading = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
                String expectedHeading = "Products";
                Assert.assertEquals(actualHeading, expectedHeading);
            }
            case "locked_out" -> {

                String actualErrorMassage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedErrorMassage = "Epic sadface: Sorry, this user has been locked out.";
                Assert.assertEquals(actualErrorMassage, expectedErrorMassage);
            }
            case "invalid" -> {

                String actualErrorMassage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedErrorMassage = "Epic sadface: Username and password do not match any user in this service";
                Assert.assertEquals(actualErrorMassage, expectedErrorMassage);
            }
        }
        driver.close();
    }

    @Test(dataProvider = "getObjectArrayData", dataProviderClass = DataProviderValuesClass.class)
    public void verifyBrowsers(String browse) {

        WebDriver driver = null;
        switch (browse) {
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
        driver.close();
    }
}