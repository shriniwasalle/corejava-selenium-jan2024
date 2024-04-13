package org.alpha.sanjeevani.assignment.pom.test;

import org.alpha.sanjeevani.assignment.pom.pages.LoginPage;
import org.alpha.sanjeevani.assignment.pom.pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    WebDriver driver;
    String URL="https://www.saucedemo.com/";
    String browser="chrome";

    @BeforeMethod
    public void init() {
        driver = initBrowser(URL, browser);
    }

    @Test
    public void verifyLoginPage() {

        LoginPage LoginPage=new LoginPage(driver);
        LoginPage.loginToApplication("standard_user","secret_sauce");

        ProductPage productPage=new ProductPage(driver);

        String actualTitle = productPage.getProductPageHeading();
        String expectedTitle = "Products";
//Assertion
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Test case pass");
    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }


    }

