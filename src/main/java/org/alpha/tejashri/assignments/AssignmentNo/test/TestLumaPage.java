package org.alpha.tejashri.assignments.AssignmentNo.test;

import org.alpha.tejashri.assignments.AssignmentNo.pages.*;
import org.alpha.tejashri.assignments.AssignmentNo.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

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
    public void verifyCustomerAccountPage(@Optional("Successful") String type) throws IOException {

        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.verityCreateAccountPage(ReadPropertiesFile.getPropertyValues("first_Name"), ReadPropertiesFile.getPropertyValues("last_Name"), ReadPropertiesFile.getPropertyValues("enter_email"), ReadPropertiesFile.getPropertyValues("enter_pass"), ReadPropertiesFile.getPropertyValues("confirm_Password"), ReadPropertiesFile.getPropertyValues("type"));

        switch (type) {
            case "Successful" -> {

                //Assertions
                String actualSuccessfulTitle = driver.getTitle();
                String expectedSuccessfulTitle = "My Account";

                Assert.assertEquals(actualSuccessfulTitle, expectedSuccessfulTitle);

            }
            case "Unsuccessful" -> {
                //Negative Assertions
                String actualUnsuccessfulTitle = driver.getTitle();
                String expectedUnsuccessfulTitle = "Create New Customer Account";

                Assert.assertEquals(actualUnsuccessfulTitle, expectedUnsuccessfulTitle);
            }
        }
    }

    @Test
    public void verifyLumaPage() throws InterruptedException, IOException {

        SignInPage signInPage = new SignInPage(driver);
        signInPage.verifySignInPage(ReadPropertiesFile.getPropertyValues("enter_email"), ReadPropertiesFile.getPropertyValues("enter_pass"));

        Product_1_FitnessEquipmentPage product_1_FitnessEquipmentPage =new Product_1_FitnessEquipmentPage(driver);
        product_1_FitnessEquipmentPage.selectYogaKits();

        Product_2_TopsPage product_2_TopsPage = new Product_2_TopsPage(driver);
        product_2_TopsPage.verifyTopsPage();

        OrderSummaryPage orderSummaryPage = new OrderSummaryPage(driver);
        orderSummaryPage.orderSummary();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.verifyCheckoutPage(ReadPropertiesFile.getPropertyValues("enter_address"), ReadPropertiesFile.getPropertyValues("city_Name"), ReadPropertiesFile.getPropertyValues("post_Code"), ReadPropertiesFile.getPropertyValues("phone_No"), ReadPropertiesFile.getPropertyValues("address_Type"));

        SignOutPage signOutPage = new SignOutPage(driver);
        signOutPage.verifySignOut();

        //Assertions
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        Assert.assertEquals(actualTitle, "");
    }
}
