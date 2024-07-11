package org.alpha.sanjeevani.assignment.Assignment3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInformation {
   private final WebDriver driver;
    private final By txtName=By.id("first-name");
    private final By txtLastName= By.id("last-name");
    private final By code= By.id("postal-code");
    private final By btnContinue= By.id("continue");
    public CheckoutYourInformation(WebDriver driver){
        this.driver=driver;
    }

    public void getCheckoutYourInformation(String fName,String lName,String PostalCode){
        driver.findElement(txtName).sendKeys(fName);
        driver.findElement(txtLastName).sendKeys(lName);
        driver.findElement(code).sendKeys(PostalCode);
        driver.findElement(btnContinue).click();
    }
}

