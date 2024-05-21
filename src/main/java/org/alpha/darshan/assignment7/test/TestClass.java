package org.alpha.darshan.assignment7.test;

import org.alpha.darshan.assignment7.pages.ProductTitle;
import org.alpha.darshan.assignment7.pages.SearchProductPage;
import org.alpha.darshan.assignment7.pages.VerifyProductDetails;
import org.alpha.darshan.assignment7.pages.iphoneDetails;
import org.alpha.darshan.assignment7.utils.ReadPropertiesFile;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestClass extends  BaseTest{

    @BeforeMethod
    public void init() throws IOException {
        browserInit(ReadPropertiesFile.getPropertyValue("url"),ReadPropertiesFile.getPropertyValue("browser"));

    }

    @Test
    public void iPhoneProductDetails(){

        //for product search
        SearchProductPage searchProductPage= new SearchProductPage(driver);
        searchProductPage.searchProduct();

        //get productPageTitle
        ProductTitle productTitle= new ProductTitle(driver);
        String actualTitle= productTitle.verifyPageTitle();
        String expectedTitle="Apple iPhone 15 (128 GB) - Black";
        Assert.assertEquals(actualTitle,expectedTitle);

        //window handle
        VerifyProductDetails verifyProductDetails= new VerifyProductDetails(driver);
        verifyProductDetails.verifyProductDetails();
        verifyProductDetails.windowHandles();

        //iphone Details
        iphoneDetails iphoneDetails= new iphoneDetails(driver);
        iphoneDetails.verifyIphoneDetails();
    }
}
