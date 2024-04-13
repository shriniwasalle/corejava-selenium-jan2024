package org.alpha.sanjeevani.assignment.pom5.test;

import org.alpha.sanjeevani.assignment.pom5.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPurchasedPage extends BaseTest {

    @Test
    public void verifyLogin() throws InterruptedException {
        WebDriver driver = initBrowser("https://www.saucedemo.com/", "chrome");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication();

        AddToKartPage addToKartPage = new AddToKartPage(driver);
        addToKartPage.getAddToKart();

        YourCartPage yourCartPage=new YourCartPage(driver);
        yourCartPage.getYourCart();

        CheckoutYourInformation checkoutYourInformation=new CheckoutYourInformation(driver);
        checkoutYourInformation.getCheckoutYourInformation();

        CheckoutOverviewPage checkoutOverviewPage=new CheckoutOverviewPage(driver);
        checkoutOverviewPage.getCheckoutOverviewPage();

        CheckoutComplete checkoutComplete=new CheckoutComplete(driver);
        String actualResult=checkoutComplete.getCheckoutComplete();
       // System.out.println(actualResult);

        String expectedResult="Thank you for your order!";

        Assert.assertEquals(actualResult,expectedResult);
        driver.close();
    }

}
