package org.alpha.tejashri.selenium.assignments.AssignmentNo6.test;

import org.alpha.tejashri.selenium.assignments.AssignmentNo6.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSauceLabsPage extends BaseTest {

    WebDriver driver;

    final String url = "https://www.saucedemo.com/";
    final String browser = "chrome";

    @BeforeMethod // concept of TestNG
    public void init() {
        //Called initBrowser method from BaseTest class
        driver = initBrowser(url, browser);
    }

    @AfterMethod // concept of TestNG
    public void closeBrowser() {
       driver.close();
    }

    @Test
    public void verifyLogin() {
        //Testing Related Actions

        //Created the object of LoginPage class
        LoginPage loginPage = new LoginPage(driver);

        //Called parameterized loginToApplication method from LoginPage class & passed the parameters values
        loginPage.loginToApplication("standard_user", "secret_sauce");

        //Created the object of ProductsPage class
        ProductsPage productsPage = new ProductsPage(driver);

        //Called getProductsPageHeading method from ProductsPage class & stored in variable of String data type
        String actualHeading = productsPage.getProductsPageHeading();
        System.out.println("Actual Product Page Heading : " + actualHeading);

        String expectedHeading = "Products";

        //Assertion
        Assert.assertEquals(actualHeading, expectedHeading);

        //Called addToCart method from ProductsPage class
        productsPage.addToCart();

        //Created the object of YourCartPage class
        YourCartPage yourCartPage = new YourCartPage(driver);

        //Called VerifyYourCart method from YourCartPage class
        yourCartPage.VerifyYourCart();

        //Created the object of CheckOutPage class
        CheckOutPage checkOutPage = new CheckOutPage(driver);

        //Called parameterized UserInfo method from CheckOutPage class & passed the parameters values
        checkOutPage.UserInfo("Tejashri", "Boppa", "413001");

        //Created the object of SignInPage class
        OverviewPage overviewPage = new OverviewPage(driver);

        //Called verifyOverviewPage method from SignInPage class
        overviewPage.verifyOverviewPage();

        //Created the object of CompletePage class
        CompletePage completePage = new CompletePage(driver);

        //Called getCompleteMassage method from CompletePage class & stored in variable of String data type
        String actualMassage = completePage.getCompleteMassage();
        System.out.println("Actual Complete Massage :  " + actualMassage);

        String expectedMassage = "Thank you for your order!";

        //Assertion
        Assert.assertEquals(actualMassage, expectedMassage);
    }
}
