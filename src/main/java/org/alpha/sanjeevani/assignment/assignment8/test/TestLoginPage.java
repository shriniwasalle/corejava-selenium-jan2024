package org.alpha.sanjeevani.assignment.assignment8.test;

import org.alpha.sanjeevani.assignment.assignment8.pages.GoogleSearchPage;
import org.alpha.sanjeevani.assignment.assignment8.pages.GoogleSearchPage;
import org.alpha.sanjeevani.assignment.assignment8.util.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestLoginPage extends BaseTest8 {
    WebDriver driver;
    @BeforeMethod
    public void init() throws IOException {
       driver= initBrowser(ReadPropertiesFile.getPropertyValues("url"),ReadPropertiesFile.getPropertyValues("browser"));
    }
    @Test
    public void verify() throws InterruptedException {
        GoogleSearchPage result=new GoogleSearchPage(driver);
        result.googleSearchPage();
    }

}

