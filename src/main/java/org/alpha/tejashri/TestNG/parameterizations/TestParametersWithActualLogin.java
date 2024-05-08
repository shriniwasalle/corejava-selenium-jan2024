package org.alpha.tejashri.TestNG.parameterizations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersWithActualLogin {

    @Test
    @Parameters({"browser", "username", "password", "type"})
    public void verifyLogin(@Optional("opera") String browser, String userName, String password, String type) {
        WebDriver driver = null;

        //1. With if else conditional statement
        //if (browser.equals("chrome")) {
        //            WebDriverManager.chromedriver().setup();
        //            driver = new ChromeDriver();
        //        } else if (browser.equals("firefox")) {
        //            WebDriverManager.firefoxdriver().setup();
        //            driver = new FirefoxDriver();
        //        } else if (browser.equals("edge")) {
        //            WebDriverManager.edgedriver().setup();
        //            driver = new EdgeDriver();
        //        }

        //2. With Switch case
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

        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        switch (type) {
            case "valid" -> {

                String actualHeading = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
                String expectedHeading = "Products";
                Assert.assertEquals(actualHeading, expectedHeading);
                driver.close();
            }
            case "locked_out" -> {

                String actualErrorMassage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedErrorMassage = "Epic sadface: Sorry, this user has been locked out.";
                Assert.assertEquals(actualErrorMassage, expectedErrorMassage);
                driver.close();
            }
            case "invalid" -> {

                String actualErrorMassage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedErrorMassage = "Epic sadface: Username and password do not match any user in this service";
                Assert.assertEquals(actualErrorMassage, expectedErrorMassage);
                driver.close();
            }
        }
    }
}
