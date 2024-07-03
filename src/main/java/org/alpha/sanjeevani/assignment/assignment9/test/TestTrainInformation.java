package org.alpha.sanjeevani.assignment.assignment9.test;

import org.alpha.sanjeevani.assignment.assignment9.pages.TrainBooking;
import org.alpha.sanjeevani.assignment.assignment9.pages.TrainDetailsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTrainInformation extends BaseTestAssign9{
    @BeforeMethod
    public void init(){driver=initBrowser("https://www.irctc.co.in/nget/train-search","chrome");}
    @Test
    public void verifyTrainInfo(){
        TrainBooking trainBooking=new TrainBooking(driver);
        trainBooking.trainBookingInfo();

        TrainDetailsPage trainDetailsPage=new TrainDetailsPage(driver);
        trainDetailsPage.NumberOfTrains();
    }
}
