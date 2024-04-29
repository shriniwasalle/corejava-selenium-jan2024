package org.alpha.tejashri.selenium.assignments.AssignmentNo8.test;


import org.alpha.tejashri.selenium.assignments.AssignmentNo8.pages.GoogleSearchPage;
import org.alpha.tejashri.selenium.assignments.AssignmentNo8.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestPage extends BrowserInitialisation {

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
        googleSearchPage.getSearch();
    }
}
