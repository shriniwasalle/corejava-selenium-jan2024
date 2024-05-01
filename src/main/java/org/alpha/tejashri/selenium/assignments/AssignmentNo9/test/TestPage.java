package org.alpha.tejashri.selenium.assignments.AssignmentNo9.test;


import org.alpha.tejashri.selenium.assignments.AssignmentNo9.pages.LoginPage;
import org.alpha.tejashri.selenium.assignments.AssignmentNo9.pages.ResultPage;
import org.alpha.tejashri.selenium.assignments.AssignmentNo9.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
    public void verifyTestPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication();

        ResultPage resultPage = new ResultPage(driver);
        resultPage.getResultHeading();

//        ResultPageUsingForLoop resultPageUsingForLoop = new ResultPageUsingForLoop(driver);
//        resultPageUsingForLoop.getResultHeading();
//
//        ResultPageTo_FromTimings resultPageTiming = new ResultPageTo_FromTimings(driver);
//        resultPageTiming.getResultHeading();

        //Assertions
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title : " + actualTitle);

        Assert.assertEquals(actualTitle, "IRCTC Next Generation eTicketing System");
    }
}
