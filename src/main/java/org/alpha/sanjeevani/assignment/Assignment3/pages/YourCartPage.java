package org.alpha.sanjeevani.assignment.Assignment3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {
 private final WebDriver driver;
    private final By btnCheckOut=By.id("checkout");
    public YourCartPage(WebDriver driver){
        this.driver=driver;
    }
    public void getYourCart(){
        driver.findElement(btnCheckOut).click();

    }
}

