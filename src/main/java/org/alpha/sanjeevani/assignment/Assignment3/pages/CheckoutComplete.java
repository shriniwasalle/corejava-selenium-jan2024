package org.alpha.sanjeevani.assignment.Assignment3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutComplete {
   private final WebDriver driver;
    private final By txtMessage1=By.xpath("//h2[text()='Thank you for your order!']");
    public CheckoutComplete(WebDriver driver){
        this.driver=driver;
    }
    public String getCheckoutComplete(){

        WebElement txtMessage=driver.findElement(txtMessage1);

        return txtMessage.getText();

    }

}
