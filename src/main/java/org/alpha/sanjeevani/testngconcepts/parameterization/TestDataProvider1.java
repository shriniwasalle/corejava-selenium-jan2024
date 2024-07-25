package org.alpha.sanjeevani.testngconcepts.parameterization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.alpha.sanjeevani.testngconcepts.parameterization.DataProviderValuesClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDataProvider1 {
    @Test(dataProvider = "getObject2DArrayData", dataProviderClass = DataProviderValuesClass.class)
    public void verifyLogin(String userName, String password, String type) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        if (type.equals("valid")) {
            String actualTitle = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
            String expectedTitle = "Products";
            Assert.assertEquals(actualTitle, expectedTitle);
        } else if (type.equals("locked_out")) {
            String error = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
            String expectedError = "Epic sadface: Sorry, this user has been locked out.";
            Assert.assertEquals(error, expectedError);
        } else if (type.equals("invalid")) {
            String errorInvalid = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
            String expectedInvalidError = "Epic sadface: Username and password do not match any user in this service";
            Assert.assertEquals(errorInvalid, expectedInvalidError);
        }
        driver.close();
    }

    @Test(dataProvider = "objectArrayData",dataProviderClass = DataProviderValuesClass.class)
    public void verifyBrowser(String browser) {

        WebDriver driver=null;

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

