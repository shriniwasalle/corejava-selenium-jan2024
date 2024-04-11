package org.alpha.tejashri.selenium.concepts.pom1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BrowserInitialisation{

    @Test
    public void verifyLogin(){
        //Testing Related Actions

        //Called initBrowser method from BrowserInitialisation class
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
