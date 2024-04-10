package org.alpha.shriniwas.seleniumconcepts.pom2.test;

import org.alpha.shriniwas.seleniumconcepts.pom2.pages.LoginPage;
import org.alpha.shriniwas.seleniumconcepts.pom2.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

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
        String actualHeading = productsPage.getProductsPageHeading();
        String expectedHeading = "Products";

        // Assertion
        Assert.assertEquals(actualHeading, expectedHeading);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
}
