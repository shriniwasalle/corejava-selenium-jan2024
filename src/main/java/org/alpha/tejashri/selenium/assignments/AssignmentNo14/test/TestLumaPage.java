package org.alpha.tejashri.selenium.assignments.AssignmentNo14.test;

import org.alpha.tejashri.selenium.assignments.AssignmentNo14.pages.*;
import org.alpha.tejashri.selenium.assignments.AssignmentNo14.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestLumaPage extends BrowserInitialisation {

    WebDriver driver;

    @BeforeMethod
    public void init() throws IOException {
        driver = initBrowser(ReadPropertiesFile.getPropertyValues("url"), ReadPropertiesFile.getPropertyValues("browser"));
    }

    @AfterMethod
    public void closeBrowser() {
        //driver.close();
    }

    @Test
    public void verifyCustomerAccountPage() {

        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.verityCreateAccountPage();
    }

    @Test
    public void verifyLumaPage() throws InterruptedException {

        SignInPage signInPage = new SignInPage(driver);
        signInPage.verifySignInPage();

        SearchPage searchPage = new SearchPage(driver);
        searchPage.verifySearchPage();

        RadiantTeePage radiantTeePage = new RadiantTeePage(driver);
        radiantTeePage.verifyRadiantTeePage();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.verifyCheckoutPage();

        SuccessPage successPage = new SuccessPage(driver);
        successPage.verifySuccessPage();

        //Assertions
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        Assert.assertEquals(actualTitle, "");
    }
}
