package org.alpha.sanjeevani.assignment.assignment14.test;
import org.alpha.sanjeevani.assignment.assignment14.pages.PlaceOrderPage;
import org.alpha.sanjeevani.assignment.assignment14.util.ReadPropertiesFile;
import org.alpha.sanjeevani.assignment.assignment14.pages.ProductPage;
import org.alpha.sanjeevani.assignment.assignment14.pages.RadiantPage;
import org.alpha.sanjeevani.assignment.assignment14.pages.ShippingAddressPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestPurchase extends BaseTestAssign14 {
    WebDriver driver;
    @BeforeMethod
    public void init() throws IOException {
        driver=initBrowser(ReadPropertiesFile.getPropertyValues("url"),ReadPropertiesFile.getPropertyValues("browser"));
    }
    @Test
    public void verifyTestPurchase() throws InterruptedException, IOException {
        ProductPage productPage=new ProductPage(driver);
        productPage.verifyProductPage(ReadPropertiesFile.getPropertyValues("product_name"));

        RadiantPage radiantPage=new RadiantPage(driver);
        radiantPage.verifyRadiantPage();

        ShippingAddressPage shippingAddressPage=new ShippingAddressPage(driver);
        shippingAddressPage.verifyShippingAddress(ReadPropertiesFile.getPropertyValues("enter_email"),
                ReadPropertiesFile.getPropertyValues("first_name"),
                ReadPropertiesFile.getPropertyValues("last_name"),
                ReadPropertiesFile.getPropertyValues ("company_name"),
                ReadPropertiesFile.getPropertyValues("street_address"),
                ReadPropertiesFile.getPropertyValues("city_name"),
                ReadPropertiesFile.getPropertyValues("zip_code"),
                ReadPropertiesFile.getPropertyValues("country_name"),
                ReadPropertiesFile.getPropertyValues("Contact_no"));

        PlaceOrderPage placeOrderPage=new PlaceOrderPage(driver);
        placeOrderPage.verifyPlaceOrder();

    }
}