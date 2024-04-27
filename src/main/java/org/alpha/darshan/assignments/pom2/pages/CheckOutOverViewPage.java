package org.alpha.darshan.assignments.pom2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverViewPage {
    WebDriver driver;
    public CheckOutOverViewPage(WebDriver driver){
     this.driver=driver;
    }

    public String verifyCheckOutOtitle(){
        return driver.findElement(By.xpath("//span[text()=\"Checkout: Overview\"]")).getText();
    }

    public void finishbtn(){
        driver.findElement(By.id("finish")).click();
    }
}
