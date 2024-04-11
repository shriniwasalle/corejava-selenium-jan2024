package org.alpha.sanjeevani.pom2.test;

import org.alpha.sanjeevani.pom2.pages.LoginPage;
import org.alpha.sanjeevani.pom2.pages.ProductsPage;
import org.alpha.sanjeevani.pom2.test.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest {

//@BeforeMethod---->@Test---->@AfterMethod

    WebDriver driver;

    final String URL = "https://www.saucedemo.com/";

    final String browser = "chrome";

    @BeforeMethod
    public void init() {
        driver = initBrowser(URL, browser);
    }

    @Test
    public void verifyLogin() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);

        String actualTitle = productsPage.getProductPageHeading();
        // System.out.println(actualTitle);//Products
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

