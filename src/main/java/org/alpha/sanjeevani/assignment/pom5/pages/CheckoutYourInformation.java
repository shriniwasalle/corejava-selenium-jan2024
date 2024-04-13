package org.alpha.sanjeevani.assignment.pom5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInformation {
    WebDriver driver;
    public CheckoutYourInformation(WebDriver driver){
        this.driver=driver;
    }

    public void getCheckoutYourInformation(){
        driver.findElement(By.id("first-name")).sendKeys("sanjeevani");
        driver.findElement(By.id("last-name")).sendKeys("sutar");
        driver.findElement(By.id("postal-code")).sendKeys("412207");
        driver.findElement(By.id("continue")).click();

    }

}

         /*driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("finish")).click();
        driver.findElement(By.id("back-to-products")).click();*/
