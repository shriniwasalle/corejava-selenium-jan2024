package org.alpha.tejashri.assignments.AssignmentNo11.test;

import org.alpha.tejashri.assignments.AssignmentNo11.pages.*;
import org.alpha.tejashri.assignments.AssignmentNo11.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRailwayPage extends BaseTest {

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
    public void verifyRailwayPage() throws InterruptedException, IOException {

        IndianRailwayPage indianRailwayPage = new IndianRailwayPage(driver);
        indianRailwayPage.verifyIndianRailwayPage();

        CentralRailwayPage centralRailwayPage = new CentralRailwayPage(driver);
        centralRailwayPage.verityCentralRailwayPage();

        HolidayPackagePage holidayPackagePage = new HolidayPackagePage(driver);
        holidayPackagePage.verifyHolidayPackagePage(ReadPropertiesFile.getPropertyValues("destination_city"));

        //Assertions
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "IRCTC Tourism Official Website | Travel & Tour Packages | Bharat Gaurav Tourist Train");
    }
}
