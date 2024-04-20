package org.alpha.tejashri.selenium.assignments.AssignmentNo7.test;


import org.alpha.tejashri.selenium.assignments.AssignmentNo7.pages.Iphone15BlackPage;
import org.alpha.tejashri.selenium.assignments.AssignmentNo7.pages.ProductsPage;
import org.alpha.tejashri.selenium.assignments.AssignmentNo7.pages.IphoneSearchPage;
import org.alpha.tejashri.selenium.assignments.AssignmentNo7.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestPage extends BrowserInitialisation {

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
    public void verifySearch() {
        //Testing Related Actions

        //Created the object of ProductsPage class
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.getProductsPageSearch();

        //Created the object of IphoneSearchPage class
        IphoneSearchPage iphonePage = new IphoneSearchPage(driver);
        iphonePage.getFirstResult();
        iphonePage.verifyWindowHandle();

        //Created the object of Iphone15BlackPage class
        Iphone15BlackPage iphone15Page = new Iphone15BlackPage(driver);
        iphone15Page.verifyIphone15Details();
    }
}
