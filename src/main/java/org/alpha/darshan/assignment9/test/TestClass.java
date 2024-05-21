package org.alpha.darshan.assignment9.test;

import org.alpha.darshan.assignment9.pages.BookingPage;
import org.alpha.darshan.assignment9.pages.SearchTrain;
import org.alpha.darshan.assignment9.utils.ReadPropertiesFile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestClass extends  BaseTest{

    @BeforeMethod
    public void init() throws IOException {
        browserInit(ReadPropertiesFile.getPropertiesValue("url"),ReadPropertiesFile.getPropertiesValue("browser"));
    }

    @Test
    public void searchTrain() throws InterruptedException {
        SearchTrain searchTrain=new SearchTrain(driver);
        searchTrain.searchTrainDetails();
        BookingPage bookingPage= new BookingPage(driver);
        bookingPage.getTrainDetails();
    }
}
