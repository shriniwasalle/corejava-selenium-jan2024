package org.alpha.sanjeevani.assignment.pom5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {

    WebDriver driver;
    public CheckoutOverviewPage(WebDriver driver){
        this.driver=driver;
    }
    public void getCheckoutOverviewPage(){
        driver.findElement(By.id("finish")).click();

    }
}
