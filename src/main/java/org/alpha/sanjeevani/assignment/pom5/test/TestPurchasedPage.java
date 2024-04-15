package org.alpha.sanjeevani.assignment.pom5.test;

import org.alpha.sanjeevani.assignment.pom5.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPurchasedPage extends BaseTest {

    final String URL="https://www.saucedemo.com/";
    final String browser="chrome";
    @BeforeMethod
      public void init() {
        WebDriver driver = initBrowser(URL, browser);
    }
    @Test
    public void verifyLogin() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication("standard_user","secret_sauce");

        AddToKartPage addToKartPage = new AddToKartPage(driver);
        addToKartPage.getAddToKart();

        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.getYourCart();

        CheckoutYourInformation checkoutYourInformation = new CheckoutYourInformation(driver);
        checkoutYourInformation.getCheckoutYourInformation("sanjeevani","sutar","412207");

        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.getCheckoutOverviewPage();

        CheckoutComplete checkoutComplete = new CheckoutComplete(driver);
        String actualResult = checkoutComplete.getCheckoutComplete();
        // System.out.println(actualResult);

        String expectedResult = "Thank you for your order!";

        Assert.assertEquals(actualResult, expectedResult);
    }
     @AfterMethod
        public void closeBrowser() {
            driver.close();
        }
}
