package org.alpha.tejashri.assignments.AssignmentNo6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

    private final WebDriver driver;
    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By postalCode = By.id("postal-code");
    private final By bntContinue = By.id("continue");

    //created parametrised constructor
    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void UserInfo(String fName, String lName, String pinCode) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(postalCode).sendKeys(pinCode);
        driver.findElement(bntContinue).click();
    }

}
