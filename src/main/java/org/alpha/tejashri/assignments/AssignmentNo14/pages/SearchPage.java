package org.alpha.tejashri.assignments.AssignmentNo14.pages;

import org.alpha.tejashri.assignments.AssignmentNo14.pageactions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SearchPage {

    private final WebDriver driver;
    private final By btnSearch = By.id("search");
    private final By firstProduct = By.xpath("//div[3]//li[1]/div");

    PageActions actions;

    //created parametrised constructor
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void verifySearchPage(String product) throws InterruptedException {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Search Page
        WebElement search = driver.findElement(btnSearch);
        search.click();
        search.sendKeys(product);
        search.sendKeys(Keys.ENTER);

        //Result Page
        Thread.sleep(2000);
        actions.clickOnElement(firstProduct);
    }
}
