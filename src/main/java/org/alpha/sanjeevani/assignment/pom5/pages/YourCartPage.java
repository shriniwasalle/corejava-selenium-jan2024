package org.alpha.sanjeevani.assignment.pom5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {
WebDriver driver;
    public YourCartPage(WebDriver driver){
        this.driver=driver;
    }
    public void getYourCart(){
        driver.findElement(By.id("checkout")).click();

    }
}

