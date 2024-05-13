package org.alpha.shriniwas.seleniumconcepts.assignments.assignment10.test;

import org.alpha.shriniwas.seleniumconcepts.assignments.assignment10.pages.LoanPage;
import org.alpha.shriniwas.seleniumconcepts.assignments.assignment10.utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestEMIPage extends BaseTest {

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
        LoanPage loanPage = new LoanPage(driver);
        loanPage.verifyLoanPage(ReadPropertiesFile.getPropertyValues("enter_Int_Rate"));

        //Assertions
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "EMI Calculator for Home Loan, Car Loan & Personal Loan in India");
    }
}