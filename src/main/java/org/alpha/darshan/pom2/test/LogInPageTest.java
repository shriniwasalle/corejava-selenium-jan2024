package org.alpha.darshan.pom2.test;

import org.alpha.darshan.pom2.pages.*;
import org.alpha.darshan.pom2.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


public class LogInPageTest extends BaseTest {

    @BeforeMethod
    public void init() throws IOException {
        WebDriver driver = initBrowser(ReadPropertiesFile.getPropertyValue("url"), ReadPropertiesFile.getPropertyValue("browser"));
    }

    @AfterMethod
    public void browserClose() {
        driver.close();
    }

    @Test
    public void verifyLogIn() throws IOException {

        //1)LogInPage
        LogInPage logInPage = new LogInPage(driver);
        logInPage.logInToApplication(ReadPropertiesFile.getPropertyValue("user.name"), ReadPropertiesFile.getPropertyValue("user.password"));

        //2)ProductPage
        ProductPage productPage = new ProductPage(driver);
        String actualTitle = productPage.verifyTitle();
        String expectedTitle = "Products";
        Assert.assertEquals(actualTitle, expectedTitle);
        productPage.addToCartProduct();

        //3)YourCartPage
        YourCartPage yourCartPage = new YourCartPage(driver);
        String actualTitleYC = yourCartPage.verifyYourCrtTitle();
        String expectedTitleYC = "Your Cart";
        Assert.assertEquals(actualTitleYC, expectedTitleYC);
        System.out.println(yourCartPage.verifyProduct());
        yourCartPage.clickOnCheckOutbtn();

        //4)CheckOutPage
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        String actualTitleCheckOutPage = checkOutPage.verifycheckOutPageTitle();
        System.out.println(actualTitleCheckOutPage);
        String expectedTitleCheckOutPage = "Checkout: Your Information";
        Assert.assertEquals(actualTitleCheckOutPage, expectedTitleCheckOutPage);
        checkOutPage.yourInformaton("darshan", "gaikwad", "413003");

        //5)CheckOutOverViewPage
        CheckOutOverViewPage checkOutOverViewPage = new CheckOutOverViewPage(driver);
        String actualTitleCheckOutOverview = checkOutOverViewPage.verifyCheckOutOtitle();
        System.out.println(checkOutOverViewPage.verifyCheckOutOtitle());
        String expectedTitleCheckOutOverView = "Checkout: Overview";
        Assert.assertEquals(actualTitleCheckOutOverview, expectedTitleCheckOutOverView);
        checkOutOverViewPage.finishbtn();

        //6)CheckOutCompletePage
        CheckOutComplete checkOutComplete = new CheckOutComplete(driver);
        String actualTitleOrderPlace = checkOutComplete.verifyOrderPlaced();
        String expectedTitleOrderPlace = "Thank you for your order!";
        System.out.println(actualTitleOrderPlace);
        Assert.assertEquals(actualTitleOrderPlace, expectedTitleOrderPlace);
    }
}
