package org.alpha.sanjeevani.assignment.assignment9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrainBooking{
    WebDriver driver;
    By bookingFrom=By.xpath("//*[@id='origin']/span/input");
    By destination=By.xpath("//*[@id='destination']/span/input");
    By classBtn=By.xpath("//html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[2]/p-dropdown/div");
    By SleeperClassBtn=By.xpath("//*[@id='journeyClass']/div/div[4]/div/ul/p-dropdownitem[12]/li/span");
    ////*[@id="divMain"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button
    By SearchBtn=By.xpath("//*[@id='divMain']/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button");
    public TrainBooking(WebDriver driver){
        this.driver=driver;
    }
    public void trainBookingInfo(){
        driver.findElement(bookingFrom).sendKeys("PUNE JN - PUNE (PUNE)");//PUNE JN - PUNE (PUNE)
        driver.findElement(destination).sendKeys("DADAR - DR (MUMBAI))");
        driver.findElement(classBtn).click();
        driver.findElement(SleeperClassBtn).click();
        driver.findElement(SearchBtn).click();

    }
}
