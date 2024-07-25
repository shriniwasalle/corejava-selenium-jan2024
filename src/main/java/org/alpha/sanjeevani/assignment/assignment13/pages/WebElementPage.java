package org.alpha.sanjeevani.assignment.assignment13.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementPage {
    private final WebDriver driver;
    private final By webElement=By.xpath("//a[text()='WebElement']");
    public WebElementPage(WebDriver driver){
        this.driver=driver;
    }
    public void verifyWebElementPage(){
        driver.findElement(webElement).click();
    }
}
