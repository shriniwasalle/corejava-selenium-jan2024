package org.alpha.tejashri.assignments.AssignmentNo16.test;

import org.alpha.tejashri.assignments.AssignmentNo16.pages.ProductsPage;
import org.alpha.tejashri.assignments.AssignmentNo16.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestFlipkartPage extends BaseTest {

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
    public void verifySearch() throws IOException, InterruptedException {
        //Testing Related Actions

        //Created the object of ProductsPage class
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.getProductsPageSearch(ReadPropertiesFile.getPropertyValues("enter_product"));

        //Assertions
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "Mobile- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
    }
}
