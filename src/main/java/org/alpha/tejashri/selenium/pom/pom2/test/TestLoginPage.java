package org.alpha.tejashri.selenium.pom.pom2.test;

import org.alpha.tejashri.selenium.pom.pom2.pages.LoginPage;
import org.alpha.tejashri.selenium.pom.pom2.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest {

    WebDriver driver;

    final String url = "https://www.saucedemo.com/";
    final  String browser = "chrome";

    @BeforeMethod // concept of TestNG
    public void init(){
        //Called initBrowser method from BaseTest class
        driver = initBrowser(url, browser);
    }

    @AfterMethod // concept of TestNG
    public void closeBrowser(){
        driver.close();
    }

    @Test
    public void verifyLogin(){
        //Testing Related Actions

        //Created the object of LoginPage class
        LoginPage loginPage = new LoginPage(driver);

        //Called parameterized loginToApplication method from LoginPage class & passed the parameters value
        loginPage.loginToApplication("standard_user" , "secret_sauce");

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
