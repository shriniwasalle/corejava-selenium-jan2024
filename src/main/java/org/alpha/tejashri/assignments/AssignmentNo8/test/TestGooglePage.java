package org.alpha.tejashri.assignments.AssignmentNo8.test;

import org.alpha.tejashri.assignments.AssignmentNo8.pages.GoogleSearchPage;
import org.alpha.tejashri.assignments.AssignmentNo8.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestGooglePage extends BaseTest {

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
    public void verifyTestPage() throws IOException {

        //Created the object of GoogleSearchPage class
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.getSearch(ReadPropertiesFile.getPropertyValues("enter_Search"));

        //Assertions
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title : " + actualTitle);

        Assert.assertEquals(actualTitle, "Google");
    }
}
