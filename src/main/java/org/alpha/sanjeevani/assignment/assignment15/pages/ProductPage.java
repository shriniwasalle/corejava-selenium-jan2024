package org.alpha.sanjeevani.assignment.assignment15.pages;

import org.alpha.sanjeevani.assignment.assignment15.pageaction.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductPage {
    private final WebDriver driver;
    PageActions actions;
    private final By enterProduct=By.id("twotabsearchtextbox");
    private final By clkOnProduct = By.id("nav-search-submit-button");

    private final By btnAnalogue = By.xpath("//span[text()='Analogue']");
    //25% Off or more
    private final By btnLeather = By.xpath("//span[text()='Leather']");
    private final By btnTitan = By.xpath("//span[text()='Titan']");
    private final By btnDiscount = By.xpath("//span[text()='25% Off or more']");

    public ProductPage(WebDriver driver){
        this.driver=driver;
        actions=new PageActions(driver);
    }
    public void verifyWristWatches(String product){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions.enterText(enterProduct,product);
        actions.clickOnElement(clkOnProduct);
        actions.clickOnElement(btnAnalogue);
        actions.clickOnElement(btnLeather);
        actions.clickOnElement(btnTitan);
        actions.clickOnElement(btnDiscount);
        //    private final By fifthElement = By.xpath("//img[@data-image-index='5']");
    }
}
