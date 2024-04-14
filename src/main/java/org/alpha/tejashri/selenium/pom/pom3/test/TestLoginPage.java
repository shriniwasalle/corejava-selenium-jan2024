package org.alpha.tejashri.selenium.pom.pom3.test;

import org.alpha.tejashri.selenium.pom.pom3.pages.LoginPage;
import org.alpha.tejashri.selenium.pom.pom3.pages.ProductsPage;
import org.alpha.tejashri.selenium.pom.pom3.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestLoginPage extends BrowserInitialisation {

    WebDriver driver;

    @BeforeMethod // concept of TestNG
    public void init() throws IOException {
        //with storing in another variable
        //Called parameterized initBrowser method from BrowserInitialisation class key values taken from ReadPropertiesFile class
        //getPropertyValues() static method directly called with class name without creating object of that class

        String url = ReadPropertiesFile.getPropertyValues("url");
        String browser = ReadPropertiesFile.getPropertyValues("browser");
        driver = initBrowser(url, browser);

    }

    @AfterMethod // concept of TestNG
    public void closeBrowser(){
        driver.close();
    }

    @Test
    public void verifyLogin() throws IOException {
        //Testing Related Actions

        //Created the object of LoginPage class
        LoginPage loginPage = new LoginPage(driver);

        //with storing in another variable
        //Called parameterized loginToApplication method from LoginPage class & passed the parameters value
        //As above, the parameters values of loginToApplication() method are called directly with class name
        // bcz getPropertyValues() is static method without creating object of that class

        String userName = ReadPropertiesFile.getPropertyValues("user.name");
        String password = ReadPropertiesFile.getPropertyValues("password");
        loginPage.loginToApplication(userName, password);

        //Created the object of ProductsPage class
        ProductsPage productsPage = new ProductsPage(driver);

        //Called getProductsPageHeading method from ProductsPage class & stored in variable of String data type
        String actualHeading = productsPage.getProductsPageHeading();
        System.out.println("Product Page Heading : " +actualHeading);

        String expectedHeading = "Products";

        //Assertion
        Assert.assertEquals(actualHeading,expectedHeading);
    }
}
