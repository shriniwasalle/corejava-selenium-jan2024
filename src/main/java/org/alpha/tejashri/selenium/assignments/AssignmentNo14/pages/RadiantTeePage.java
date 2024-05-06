package org.alpha.tejashri.selenium.assignments.AssignmentNo14.pages;

import org.alpha.tejashri.selenium.assignments.AssignmentNo14.pageactions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadiantTeePage {

    private final WebDriver driver;
    private final By btnSize = By.id("option-label-size-143-item-168");
    private final By btnColor = By.id("option-label-color-93-item-57");
    private final By btnAddToCart = By.id("product-addtocart-button");
    private final By btnCart = By.xpath("//a[@class='action showcart']");
    private  final By productName = By.linkText("Radiant Tee");
    private  final By productPrice =By.xpath("//div[@id='minicart-content-wrapper']/div/div/div/span/span");
    private final By btnCheckout = By.id("top-cart-btn-checkout");

    PageActions actions;

    //created parametrised constructor
    public RadiantTeePage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void verifyRadiantTeePage() throws InterruptedException {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Radiant Tee Page
        actions.clickOnElement(btnSize);
        actions.clickOnElement(btnColor);

        Thread.sleep(2000);
        actions.clickOnElement(btnAddToCart);

        Thread.sleep(5000);
        //To scroll page with JavascriptExecutor
        //WebElement myCart = driver.findElement(btnCart);
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", myCart);
        //myCart.click();

        actions.clickOnElement(btnCart);

        Thread.sleep(5000);
        System.out.println("Product Name : " +driver.findElement(productName).getText());
        System.out.println("Product Price : " +driver.findElement(productPrice).getText());
        actions.clickOnElement(btnCheckout);
    }
}
