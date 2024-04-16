package org.alpha.darshan.pom2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {
    WebDriver driver;
    public YourCartPage(WebDriver driver){
        this.driver= driver;
    }

    public String verifyYourCrtTitle(){
      return driver.findElement(By.xpath("//span[text()=\"Your Cart\"]")).getText();

    }

    public String verifyProduct(){
      return  driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]")).getText();
    }

    public void clickOnCheckOutbtn(){
        driver.findElement(By.id("checkout")).click();
    }
}
