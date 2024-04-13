package org.alpha.shriniwas.seleniumconcepts.pom3.test;

import org.alpha.shriniwas.seleniumconcepts.pom3.pages.LoginPage;
import org.alpha.shriniwas.seleniumconcepts.pom3.pages.ProductsPage;
import org.alpha.shriniwas.seleniumconcepts.pom3.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void init() throws IOException {
        String url = ReadPropertiesFile.getPropertyValue("url");
        String browser = ReadPropertiesFile.getPropertyValue("browser");
        driver = initBrowser(url, browser);
    }

    @Test
    public void verifyLogin() throws IOException {
        LoginPage loginPage = new LoginPage(driver);

        String userName = ReadPropertiesFile.getPropertyValue("user.name");
        String password = ReadPropertiesFile.getPropertyValue("password");

        loginPage.loginToApplication(userName, password);

        ProductsPage productsPage = new ProductsPage(driver);
        String actualHeading = productsPage.getProductsPageHeading();
        String expectedHeading = "Products";

        // Assertion
        Assert.assertEquals(actualHeading, expectedHeading);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
}
