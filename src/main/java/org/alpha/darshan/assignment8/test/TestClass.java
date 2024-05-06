package org.alpha.darshan.assignment8.test;

import org.alpha.darshan.assignment8.pages.GoogleSearchPage;
import org.alpha.darshan.assignment8.utils.ReadPropertiesFile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestClass extends BaseTest {

    @BeforeMethod
    public void init() throws IOException {
        initBrowser(ReadPropertiesFile.getPropertyValue("url"),ReadPropertiesFile.getPropertyValue("browser"));
    }

    @Test
    public void fetchResults() throws InterruptedException {
        GoogleSearchPage googleSearchPage= new GoogleSearchPage(driver);
        googleSearchPage.search();
        
    }
}
