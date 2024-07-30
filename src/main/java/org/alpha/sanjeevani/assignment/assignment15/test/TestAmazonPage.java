package org.alpha.sanjeevani.assignment.assignment15.test;

import org.alpha.sanjeevani.assignment.assignment15.pages.ProductPage;
import org.alpha.sanjeevani.assignment.assignment15.pages.WristWatchesPage;
import org.alpha.sanjeevani.assignment.assignment15.util.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestAmazonPage extends BaseTestAssign15{
    WebDriver driver;
    @BeforeMethod
    public void init() throws IOException {
        driver=initBrowser(ReadPropertiesFile.getPropertyValues("url"),ReadPropertiesFile.getPropertyValues("browser"));
    }
    @Test
    public void verifyAmazonPage() throws IOException {
        ProductPage productPage=new ProductPage(driver);
        productPage.verifyWristWatches(ReadPropertiesFile.getPropertyValues("enter_product"));

        WristWatchesPage wristWatchesPage=new WristWatchesPage(driver);
        wristWatchesPage.getWristWatches();
        wristWatchesPage.verifyWindowHandle();

        String actualTitle=driver.getTitle();
        System.out.println("actualTitle is :"+actualTitle);
        String expectedTitle="TIMEX Men's Analog Watch -Blue, TW00ZR262E : Amazon.in: Fashion";

        Assert.assertEquals(actualTitle,expectedTitle);
    }
}