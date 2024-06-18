package org.alpha.sanjeevani.assignment.AssignmentNo3RegisterAccount.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {

    WebDriver driver;

   By txtFinish= By.id("finish");
    public CheckoutOverviewPage(WebDriver driver){
        this.driver=driver;
    }
    public void getCheckoutOverviewPage(){
        driver.findElement(txtFinish).click();

    }
}
