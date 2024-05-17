package org.alpha.tejashri.assignments.AssignmentNo7.test;


import org.alpha.tejashri.assignments.AssignmentNo7.pages.Iphone15BlackPage;
import org.alpha.tejashri.assignments.AssignmentNo7.pages.ProductsPage;
import org.alpha.tejashri.assignments.AssignmentNo7.pages.IphoneSearchPage;
import org.alpha.tejashri.assignments.AssignmentNo7.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestGooglePage extends BaseTest {

    WebDriver driver;

    @BeforeMethod //Concept of TestNG
    public void init() throws IOException {

        driver = initBrowser(ReadPropertiesFile.getPropertyValues("url"), ReadPropertiesFile.getPropertyValues("browser"));
    }

    @AfterMethod // concept of TestNG
    public void closeBrowser() {
        //driver.close();
    }

    @Test
    public void verifySearch() throws IOException {
        //Testing Related Actions

        //Created the object of ProductsPage class
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.getProductsPageSearch(ReadPropertiesFile.getPropertyValues("enter_product"));

        //Created the object of WristWatchPage class
        IphoneSearchPage iphoneSearchPage = new IphoneSearchPage(driver);
        iphoneSearchPage.getFirstResult();
        iphoneSearchPage.verifyWindowHandle();

        //Created the object of Iphone15BlackPage class
        Iphone15BlackPage iphone15BlackPage = new Iphone15BlackPage(driver);
        iphone15BlackPage.verifyIphone15Details();

        //Assertions
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title : " + actualTitle);

        Assert.assertEquals(actualTitle, "Apple iPhone 15 (128 GB) - Black : Amazon.in: Electronics");
    }
}
