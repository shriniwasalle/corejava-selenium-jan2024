package org.alpha.tejashri.assignments.AssignmentNo15.pages;

import org.alpha.tejashri.assignments.AssignmentNo15.pageactions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductsPage {

    private final WebDriver driver;

    private final By searchBox = By.id("twotabsearchtextbox");
    private final By submitSearch = By.id("nav-search-submit-button");
    private final By btnAnalogue = By.xpath("//span[text()='Analogue']");
    private final By btnLeather = By.xpath("//span[text()='Leather']");
    private final By btnTitan = By.xpath("//span[@class='a-size-base a-color-base' and text()='Titan']");
    private final By btnDiscount = By.xpath("//span[text()='25% Off or more']");

    PageActions actions;
    //created parametrised constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void getProductsPageSearch(String enterProduct) {
        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Product Page Related Actions
        actions.enterText(searchBox, enterProduct);
        actions.clickOnElement(submitSearch);
        actions.clickOnElement(btnAnalogue);
        actions.clickOnElement(btnLeather);
        actions.clickOnElement(btnTitan);
        actions.clickOnElement(btnDiscount);

    }
}
