package org.alpha.sanjeevani.assignment.assignment13.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InterfacesPage {
    private final WebDriver driver;
    private final By clkInterface=By.id("class-summary-tab1");
    public InterfacesPage(WebDriver driver){
        this.driver=driver;
    }
    public void verifyInterfacesPage(){
        driver.findElement(clkInterface).click();
    }
}
