package org.alpha.tejashri.assignments.AssignmentNo15.test;


import org.alpha.tejashri.assignments.AssignmentNo15.pages.ProductsPage;
import org.alpha.tejashri.assignments.AssignmentNo15.pages.WristWatchPage;
import org.alpha.tejashri.assignments.AssignmentNo15.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestAmazonPage extends BaseTest {

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
        WristWatchPage wristWatchPage = new WristWatchPage(driver);
        wristWatchPage.getFifthResult();
        wristWatchPage.verifyWindowHandle();

        //Assertions
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "Titan Analog Black Dial Men's Watch-1864SL08 : Amazon.in: Fashion");
    }
}
