package org.alpha.tejashri.selenium.assignments.AssignmentNo6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {
    private final WebDriver driver;

    private final By bntCheckOut = By.id("checkout");


    //created parametrised constructor
    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    //
    public void VerifyYourCart() {
    //Your Cart Page  Related Actions
        driver.findElement(bntCheckOut).click();
    }
}

