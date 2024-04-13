package org.alpha.sanjeevani.assignment.pom5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutComplete {
    WebDriver driver;
    public CheckoutComplete(WebDriver driver){
        this.driver=driver;
    }
    public String getCheckoutComplete(){

        WebElement txtMessage=driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));

        return txtMessage.getText();

    }

}
