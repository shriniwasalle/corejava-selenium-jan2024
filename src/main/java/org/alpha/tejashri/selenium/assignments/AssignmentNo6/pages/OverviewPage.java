package org.alpha.tejashri.selenium.assignments.AssignmentNo6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {

    private final WebDriver driver;
    private final By btnFinish = By.id("finish");


    //created parametrised constructor
    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyOverviewPage() {
        driver.findElement(btnFinish).click();
    }

}
