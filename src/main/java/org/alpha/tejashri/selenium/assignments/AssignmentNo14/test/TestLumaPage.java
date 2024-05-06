package org.alpha.tejashri.selenium.assignments.AssignmentNo14.test;

import org.alpha.tejashri.selenium.assignments.AssignmentNo14.pages.*;
import org.alpha.tejashri.selenium.assignments.AssignmentNo14.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestLumaPage extends BaseTest {

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
    public void verifyCustomerAccountPage() throws IOException {

        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.verityCreateAccountPage(ReadPropertiesFile.getPropertyValues("first_Name"), ReadPropertiesFile.getPropertyValues("last_Name"), ReadPropertiesFile.getPropertyValues("enter_email"), ReadPropertiesFile.getPropertyValues("enter_pass"), ReadPropertiesFile.getPropertyValues("confirm_Password") );
    }

    @Test
    public void verifyLumaPage() throws InterruptedException, IOException {

        SignInPage signInPage = new SignInPage(driver);
        signInPage.verifySignInPage(ReadPropertiesFile.getPropertyValues("enter_email"), ReadPropertiesFile.getPropertyValues("enter_pass"));

        SearchPage searchPage = new SearchPage(driver);
        searchPage.verifySearchPage(ReadPropertiesFile.getPropertyValues("product_Name"));

        RadiantTeePage radiantTeePage = new RadiantTeePage(driver);
        radiantTeePage.verifyRadiantTeePage();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.verifyCheckoutPage(ReadPropertiesFile.getPropertyValues("enter_address"), ReadPropertiesFile.getPropertyValues("city_Name"), ReadPropertiesFile.getPropertyValues("post_Code"), ReadPropertiesFile.getPropertyValues("phone_No"));

        SuccessPage successPage = new SuccessPage(driver);
        successPage.verifySuccessPage();

        //Assertions
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title : " +actualTitle);

        Assert.assertEquals(actualTitle, "Home Page");
    }
}
