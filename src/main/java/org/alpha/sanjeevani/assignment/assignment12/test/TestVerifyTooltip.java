package org.alpha.sanjeevani.assignment.assignment12.test;

import org.alpha.sanjeevani.assignment.assignment12.pages.WidgetsPage;
import org.alpha.sanjeevani.assignment.assignment12.util.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestVerifyTooltip extends BaseTestAssign12{
    WebDriver driver;
    @BeforeMethod
    public void init() throws IOException {
        driver=initBrowser(ReadPropertiesFile.getPropertyValues("url"),ReadPropertiesFile.getPropertyValues("browser"));
    }
    @Test
    public void verifyTooltip(){
        WidgetsPage widgetsPage=new WidgetsPage(driver);
        widgetsPage.verifyWidgets();

        String actualTitle=driver.getTitle();
       // System.out.println(actualTitle);

        String expectedTitle="DEMOQA";
        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
