package org.alpha.tejashri.assignments.AssignmentNo13.test;

import org.alpha.tejashri.assignments.AssignmentNo13.pages.SeleniumPage;
import org.alpha.tejashri.assignments.AssignmentNo13.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSeleniumPage extends BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void init() throws IOException {
        driver = initBrowser(ReadPropertiesFile.getPropertyValues("url"), ReadPropertiesFile.getPropertyValues("browser"));
    }

    @AfterMethod
    public void closeBrowser() {
        //driver.close();
    }

    @Test
    public void verifyTestPage() throws InterruptedException {

        //Created the object of GoogleSearchPage class
        SeleniumPage seleniumPage = new SeleniumPage(driver);
        seleniumPage.verifySeleniumPage();

        //Assertions
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "WebElement");
    }
}
