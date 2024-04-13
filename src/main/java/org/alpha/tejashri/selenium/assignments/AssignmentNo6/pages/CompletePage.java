package org.alpha.tejashri.selenium.assignments.AssignmentNo6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePage {

    private static WebDriver driver = null;
    private static final By txtMassage = By.xpath("//h2[contains(text(), 'Thank you')]");

    //created parametrised constructor
    public CompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCompleteMassage(){
        WebElement completeMassage = driver.findElement(txtMassage);
       return completeMassage.getText();
    }

}
