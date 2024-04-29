package org.alpha.tejashri.selenium.assignments.AssignmentNo10.test;



import org.alpha.tejashri.selenium.assignments.AssignmentNo10.pages.LoanPage;
import org.alpha.tejashri.selenium.assignments.AssignmentNo10.utils.ReadPropertiesFile;
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
        LoanPage loanPage = new LoanPage(driver);
        loanPage.verifyLoanPage();
    }
}
