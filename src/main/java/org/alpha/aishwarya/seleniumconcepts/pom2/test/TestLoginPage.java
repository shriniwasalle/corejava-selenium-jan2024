package org.alpha.aishwarya.seleniumconcepts.pom2.test;

import org.alpha.aishwarya.seleniumconcepts.pom2.pages.LoginPage;
import org.alpha.aishwarya.seleniumconcepts.pom2.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest {

    //Page wise Test Execution
    WebDriver driver;
    // Maked as Final: Do not Change
    final String URL = "https://www.saucedemo.com/";
    final String browser = "chrome";

    @BeforeMethod
    public void initBrowser() {
        driver = initBrowser(URL, browser);
    }

    @Test
    public void verifyLogin() {
        LoginPage loginpage = new LoginPage(driver);  // In object constructor Variable passed
        loginpage.loginToApplication("standard_user", "secret_sauce");  // All Test date should go uisng @Test

        ProductsPage productspage = new ProductsPage(driver);
        String actualHeading = productspage.getProductsPageHeading();
        String expectedHeading = "Products";

        // Assertion
        Assert.assertEquals(actualHeading, expectedHeading);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
}


/**
 * ==== OutPut====
 * SLF4J(W): No SLF4J providers were found.
 * SLF4J(W): Defaulting to no-operation (NOP) logger implementation
 * SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
 * Starting ChromeDriver 123.0.6312.122 (31f8248cdd90acbac59f700b603fed0b5967ca50-refs/branch-heads/6312@{#824}) on port 20846
 * Only local connections are allowed.
 * Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
 * ChromeDriver was started successfully.
 * Apr 14, 2024 11:12:57 PM org.openqa.selenium.remote.ProtocolHandshake createSession
 * INFO: Detected dialect: W3C
 * <p>
 * ===============================================
 * Default Suite
 * Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
 * ===============================================
 * <p>
 * <p>
 * Process finished with exit code 0
 */
