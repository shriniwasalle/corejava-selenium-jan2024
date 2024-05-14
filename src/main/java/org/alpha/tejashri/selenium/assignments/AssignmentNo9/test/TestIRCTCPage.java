package org.alpha.tejashri.selenium.assignments.AssignmentNo9.test;


import org.alpha.tejashri.selenium.assignments.AssignmentNo9.pages.LoginPage;
import org.alpha.tejashri.selenium.assignments.AssignmentNo9.pages.ResultPageFromToTimes;
import org.alpha.tejashri.selenium.assignments.AssignmentNo9.pages.ResultPageFromToTimesWithDuration;
import org.alpha.tejashri.selenium.assignments.AssignmentNo9.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestIRCTCPage extends BaseTest {

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
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(ReadPropertiesFile.getPropertyValues("enter_From"), ReadPropertiesFile.getPropertyValues("enter_to"));

        ResultPageFromToTimes resultPageFromToTimes = new ResultPageFromToTimes(driver);
        resultPageFromToTimes.verifyResultPage();

        //Or Use this

        ResultPageFromToTimesWithDuration resultPageFromToTimesWithDuration = new ResultPageFromToTimesWithDuration(driver);
        resultPageFromToTimesWithDuration.verifyResultPage();

        //Assertions
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title : " + actualTitle);

        Assert.assertEquals(actualTitle, "IRCTC Next Generation eTicketing System");
    }
}
