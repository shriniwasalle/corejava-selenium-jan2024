package org.alpha.tejashri.selenium.assignments.AssignmentNo7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    private final WebDriver driver;

    private final By searchBox = By.id("twotabsearchtextbox");
    private final By submitSearch = By.id("nav-search-submit-button");

    //created parametrised constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getProductsPageSearch(String enterProduct) {

        //Product Page Related Actions
        driver.findElement(searchBox).sendKeys(enterProduct);

        driver.findElement(submitSearch).click();
    }
}
