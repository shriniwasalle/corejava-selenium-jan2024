package org.alpha.sanjeevani.assignment.Assignment6.test;

import org.alpha.sanjeevani.assignment.Assignment6.pages.LoginPage;
import org.alpha.sanjeevani.assignment.Assignment6.pages.ProductsPage;
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

        String actualTitle = productsPage.getProductPageHeading(driver);
        // System.out.println(actualTitle);//Products
        String expectedTitle = "Products";

        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Test case pass");

        driver.close();
    }

}
