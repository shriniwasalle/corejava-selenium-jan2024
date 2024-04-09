package org.alpha.shriniwas.seleniumconcepts.pom1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest {

    @Test
    public void verifyLogin() {
        WebDriver driver = initBrowser("https://www.saucedemo.com/", "chrome");

        LoginPage loginPage = new LoginPage();
        loginPage.loginToApplication(driver);

        ProductsPage productsPage = new ProductsPage();
        String actualHeading = productsPage.getProductsPageHeading(driver);
        String expectedHeading = "Products";

        // Assertion
        Assert.assertEquals(actualHeading, expectedHeading);
    }
}
