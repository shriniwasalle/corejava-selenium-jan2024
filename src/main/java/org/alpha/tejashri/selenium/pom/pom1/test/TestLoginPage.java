package org.alpha.tejashri.selenium.pom.pom1.test;

import org.alpha.tejashri.selenium.pom.pom1.pages.LoginPage;
import org.alpha.tejashri.selenium.pom.pom1.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest {

    @Test
    public void verifyLogin(){
        //Testing Related Actions

        //Called initBrowser method from BaseTest class
        initBrowser("https://www.saucedemo.com/", "chrome");

        //Created the object of LoginPage class
        LoginPage loginPage = new LoginPage();

        //Called loginToApplication method from LoginPage class
        loginPage.loginToApplication(driver);

        //Created the object of ProductsPage class
        ProductsPage productsPage = new ProductsPage();

        //Called getProductsPageHeading method from ProductsPage class & stored in variable of String data type
        String actualHeading = productsPage.getProductsPageHeading(driver);
        System.out.println("Product Page Heading : " +actualHeading);

        String expectedHeading = "Products";

        //Assertion
        Assert.assertEquals(actualHeading,expectedHeading);
    }
}
