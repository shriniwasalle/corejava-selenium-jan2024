package org.alpha.tejashri.assignments.AssignmentNo12.test;

import org.alpha.tejashri.assignments.AssignmentNo12.pages.ToolsQAPage;
import org.alpha.tejashri.assignments.AssignmentNo12.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestToolsQAPage extends BaseTest {

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
    public void verifyTestPage() {

        //Created the object of GoogleSearchPage class
        ToolsQAPage toolsQAPage = new ToolsQAPage(driver);
        toolsQAPage.verifyToolsQAPage();

        //Assertions
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "DEMOQA");
    }
}
