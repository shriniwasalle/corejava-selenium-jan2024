package org.alpha.tejashri.selenium.assignments.AssignmentNo14.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadiantTeePage {

    private final WebDriver driver;
    private final By btnSize = By.id("option-label-size-143-item-168");
    private final By btnColor = By.id("option-label-color-93-item-57");
    private final By btnAddToCart = By.id("product-addtocart-button");
    private final By btnCart = By.xpath("//a[@class=\"action showcart\"]");
    private final By btnCheckout = By.id("top-cart-btn-checkout");

    //created parametrised constructor
    public RadiantTeePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyRadiantTeePage() throws InterruptedException {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Radiant Tee Page
        driver.findElement(btnSize).click();
        driver.findElement(btnColor).click();

        Thread.sleep(2000);
        driver.findElement(btnAddToCart).click();

        Thread.sleep(5000);
        WebElement myCart = driver.findElement(btnCart);

        //To scroll page with JavascriptExecutor
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", myCart);
        myCart.click();

        driver.findElement(btnCheckout).click();

    }
}
