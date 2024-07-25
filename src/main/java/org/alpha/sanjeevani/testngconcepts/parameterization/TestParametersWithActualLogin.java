package org.alpha.sanjeevani.testngconcepts.parameterization;
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
    @Parameters({"browser","userName","Password","type"})
    @Test
     public void verifyLogin(@Optional ("chrome") String browser, String userName, String Password, String type){

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
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("login-button")).click();

        switch (type){
            case "valid":
                String actualTitle = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
                String expectedTitle = "Products";
                Assert.assertEquals(actualTitle, expectedTitle);
            break;
            case "locked_out_user":
                String error = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedError = "Epic sadface: Sorry, this user has been locked out.";
                Assert.assertEquals(error, expectedError);
                break;
            case "invalid":
                String errorInvalid = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedInvalidError = "Epic sadface: Username and password do not match any user in this service";
                Assert.assertEquals(errorInvalid, expectedInvalidError);
                break;
            case "invalidPass":
                String PassError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String ExpectedPassError = "Epic sadface: Username and password do not match any user in this service";
                Assert.assertEquals(PassError, ExpectedPassError);
                break;
        }
        driver.close();
    }
}

