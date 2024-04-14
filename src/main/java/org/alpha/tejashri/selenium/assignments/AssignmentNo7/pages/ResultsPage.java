package org.alpha.tejashri.selenium.assignments.AssignmentNo7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage {

    private final WebDriver driver;
    private final By firstSearch = By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']");

    //created parametrised constructor
    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }


    public void getFirstResult() {
        WebElement fSearch = driver.findElement(firstSearch);
        fSearch.click();
    }
}
