package org.alpha.darshan.assignments.pom1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productsPage {
        WebDriver driver;

    private final By headingProducts= By.xpath("//span[text()=\"Products\"]");
    public productsPage(WebDriver driver){
        this.driver=driver;
    }
    public String verifyTitle(){

        return driver.findElement(headingProducts).getText();
    }
}
