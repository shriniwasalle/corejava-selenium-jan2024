package org.alpha.sanjeevani.seleniumconcepts.pom2.test;

import org.alpha.sanjeevani.seleniumconcepts.pom2.pages.LoginPage;
import org.alpha.sanjeevani.seleniumconcepts.pom2.pages.ProductsPage;
import org.alpha.sanjeevani.seleniumconcepts.pom2.utils.ReadPropertiesFiles;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestLoginPage extends BaseTest {

//@BeforeMethod---->@Test---->@AfterMethod

    WebDriver driver;
   // final String URL = "https://www.saucedemo.com/";

   // final String browser = "chrome";

    @BeforeMethod
    public void init() throws IOException {
        driver = initBrowser(ReadPropertiesFiles.getPropertyValue("url"), ReadPropertiesFiles.getPropertyValue("browser"));
    }
    @Test
    public void verifyLogin() throws IOException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(ReadPropertiesFiles.getPropertyValue("user.name"), ReadPropertiesFiles.getPropertyValue("password"));

        ProductsPage productsPage = new ProductsPage(driver);
        String actualTitle = productsPage.getProductPageHeading();
        String expectedTitle = "Products";

//Assertion

        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
}

