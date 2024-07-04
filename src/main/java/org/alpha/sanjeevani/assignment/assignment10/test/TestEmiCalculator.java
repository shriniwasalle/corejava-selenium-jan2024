package org.alpha.sanjeevani.assignment.assignment10.test;

import org.alpha.sanjeevani.assignment.assignment10.pages.HomaLoanPage;
import org.alpha.sanjeevani.assignment.assignment10.util.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestEmiCalculator extends BaseTestAssign10{
    WebDriver driver;
    @BeforeMethod
    public void init() throws IOException {
        driver=initBrowser(ReadPropertiesFile.getPropertyValues("url"),ReadPropertiesFile.getPropertyValues("browser"));
    }
    @Test
    public void LoanDetails() throws IOException {
        HomaLoanPage homaLoanPage=new HomaLoanPage(driver);
        homaLoanPage.VerifyHomeLoan(ReadPropertiesFile.getPropertyValues("enter_Int_Rate"));

        String actualTitle=driver.getTitle();
        //System.out.println(actualTitle);
        String expectedTitle="EMI Calculator for Home Loan, Car Loan & Personal Loan in India";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
