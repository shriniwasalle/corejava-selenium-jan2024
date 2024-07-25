package org.alpha.sanjeevani.assignment.assignment11.test;

import org.alpha.sanjeevani.assignment.assignment11.pages.CentralRailwayPage;
import org.alpha.sanjeevani.assignment.assignment11.pages.HolidayPackagePage;
import org.alpha.sanjeevani.assignment.assignment11.pages.IndianRailwayPage;
import org.alpha.sanjeevani.assignment.assignment11.util.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestJourneyInfo extends BaseTestAssign11{
    WebDriver driver;
@BeforeMethod
    public void init() throws IOException {
    driver=initBrowser(ReadPropertiesFile.getPropertyValues("url"),ReadPropertiesFile.getPropertyValues("browser"));}
    @Test
    public void journeyInfo() throws IOException {
        IndianRailwayPage IndianRailwayPage=new IndianRailwayPage(driver);
        IndianRailwayPage.verifyIndianRailway();

        CentralRailwayPage centralRailwayPage=new CentralRailwayPage(driver);
        centralRailwayPage.verifyCentralRailway();

        HolidayPackagePage holidayPackagePage=new HolidayPackagePage(driver);
        holidayPackagePage.verifyHolidayPackage(ReadPropertiesFile.getPropertyValues("destination_city"));

        String actualTitle=driver.getTitle();
    }
}
