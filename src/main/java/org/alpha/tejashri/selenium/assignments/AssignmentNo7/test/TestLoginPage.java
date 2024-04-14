package org.alpha.tejashri.selenium.assignments.AssignmentNo7.test;


import org.alpha.tejashri.selenium.assignments.AssignmentNo7.pages.IphonePage;
import org.alpha.tejashri.selenium.assignments.AssignmentNo7.pages.ProductsPage;
import org.alpha.tejashri.selenium.assignments.AssignmentNo7.pages.ResultsPage;
import org.alpha.tejashri.selenium.assignments.AssignmentNo7.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestLoginPage extends BrowserInitialisation {

    WebDriver driver;

    @BeforeMethod // concept of TestNG
    public void init() throws IOException {

        //Without storing directly passed parameter keys in the initBrowser() method which is taken from config.properties file
        //Called parameterized initBrowser method from BrowserInitialisation class key values taken from ReadPropertiesFile class
        //getPropertyValues() static method directly called with class name

        driver = initBrowser(ReadPropertiesFile.getPropertyValues("url"), ReadPropertiesFile.getPropertyValues("browser"));

    }

    @AfterMethod // concept of TestNG
    public void closeBrowser(){
        //driver.close();
    }

    @Test
    public void verifySearch() throws IOException {
        //Testing Related Actions

        //Created the object of ProductsPage class
        ProductsPage productsPage = new ProductsPage(driver);

        productsPage.getProductsPageSearch();

        ResultsPage resultsPage = new ResultsPage(driver);
        resultsPage.getFirstResult();

        IphonePage iphonePage = new IphonePage(driver);
        iphonePage.getIphoneHeading();

        //Assertion

    }
}
