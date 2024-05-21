package org.alpha.darshan.assignments.pom2.pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutComplete {
    WebDriver driver;
    public CheckOutComplete(WebDriver driver){
        this.driver= driver;
    }

    public String verifyOrderPlaced(){
      return driver.findElement(By.xpath("//h2[text()=\"Thank you for your order!\"]")).getText();
    }
}
