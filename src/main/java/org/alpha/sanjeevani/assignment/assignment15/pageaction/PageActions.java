package org.alpha.sanjeevani.assignment.assignment15.pageaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageActions {
    WebDriver driver;
    public PageActions(WebDriver driver){
        this.driver=driver;
    }

    public void enterText(By locator,String value){
        driver.findElement(locator).sendKeys(value);
    }
    public void enterText(WebElement element, String value){
        element.sendKeys(value);
    }
    public void clickOnElement(By locator){
      driver.findElement(locator).click();
    }
}
