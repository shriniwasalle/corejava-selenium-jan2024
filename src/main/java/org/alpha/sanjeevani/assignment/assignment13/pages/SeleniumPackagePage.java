package org.alpha.sanjeevani.assignment.assignment13.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumPackagePage {
    private final WebDriver driver;
    private final By selenium=By.xpath("//a[text()='org.openqa.selenium']");
    public SeleniumPackagePage(WebDriver driver){
        this.driver=driver;
    }
    public void verifySeleniumPackagePage(){
        driver.findElement(selenium).click();
    }
}
