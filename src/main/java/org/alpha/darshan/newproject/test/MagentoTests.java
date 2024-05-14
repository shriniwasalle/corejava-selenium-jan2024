package org.alpha.darshan.newproject.test;

import org.alpha.darshan.newproject.pages.*;
import org.alpha.darshan.newproject.utils.ReadPropertiesFile;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class MagentoTests extends TestBase {

    @BeforeMethod
    public void init() throws IOException {
        browserInit(ReadPropertiesFile.getPropertyValue("url"), ReadPropertiesFile.getPropertyValue("browser"));
    }


    @Test
    public void verifyLogInCredentials() throws InterruptedException {

        //Creating an Account
        CreatAnAccountPage creatAnAccountPage = new CreatAnAccountPage(driver);
        creatAnAccountPage.creatAccount();
        String actualMessage = creatAnAccountPage.verifyMsg();
        String expectedMessage = "Thank you for registering with Main Website Store.";
        Assert.assertEquals(actualMessage, expectedMessage);

        //NewMens Shopping
        NewShoppingPage newShoppingPage = new NewShoppingPage(driver);
        newShoppingPage.newShoppingMens();

        //AddItemToCart
        AddItemToCartAndPlaceOrder addAtomToCart = new AddItemToCartAndPlaceOrder(driver);
        addAtomToCart.addItom();
        Thread.sleep(1000);
        String actualAddMessage = addAtomToCart.verifyItomAddedToCart();
        String expectedAddMessage = "You added Sinbad Fitness Tank to your shopping cart.";
        Assert.assertEquals(actualAddMessage, expectedAddMessage);

        //AddYogKitsToCart
        AddYogaKitsToCartAndPlaceOrder addYogaKits = new AddYogaKitsToCartAndPlaceOrder(driver);
        addYogaKits.selectYogaKits();

        //CheckOutProducts
        Thread.sleep(2000);
        CheckOutProducts checkOutProducts = new CheckOutProducts(driver);
        checkOutProducts.checkout();

        //Shipping Address And Payment
        ShippingAddressAndPayment shippingAddressAndPayment = new ShippingAddressAndPayment(driver);
        shippingAddressAndPayment.shippingAddressDetails();

        //orderSummaryPage

        OrderSummaryPage orderSummaryPage= new OrderSummaryPage(driver);
        orderSummaryPage.orderSummary();

    }

   /* @AfterMethod
    public void tearDown(){
        driver.quit();
    }*/

}
