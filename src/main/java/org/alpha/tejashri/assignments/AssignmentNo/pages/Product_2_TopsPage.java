package org.alpha.tejashri.assignments.AssignmentNo.pages;

import org.alpha.tejashri.assignments.AssignmentNo.pageactions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Product_2_TopsPage {

    private final WebDriver driver;
    private final By btnMen = By.linkText("Men");
    private final By bntTops = By.linkText("Tops");
    private final By bntNew = By.xpath("//div[text()='New']");
    private final By bntYes = By.xpath("//div[9]/div[2]/ol/li[1]/a");
    private final By firstProductPath = By.xpath("//div/div/div[3]/ol/li[1]");

    private final By btnSize = By.id("option-label-size-143-item-168");
    private final By btnColor = By.id("option-label-color-93-item-50");
    private final By btnAddToCart = By.xpath("//li[1]/div/div/div/div/div/form/button");
    private final By btnCart = By.xpath("//a[@class='action showcart']");
    private final By btnCheckout = By.id("top-cart-btn-checkout");

    PageActions actions;

    //created parametrised constructor
    public Product_2_TopsPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void verifyTopsPage() throws InterruptedException {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        Thread.sleep(5000);
        //Search Page
        WebElement men = driver.findElement(btnMen);

        Actions act = new Actions(driver);
        act.moveToElement(men).perform();

        WebElement tops = driver.findElement(bntTops);
        act.moveToElement(tops).perform();
        tops.click();

        actions.clickOnElement(bntNew);
        actions.clickOnElement(bntYes);

        WebElement firstProduct = driver.findElement(firstProductPath);
        act.moveToElement(firstProduct).perform();

        //Radiant Tee Page
        actions.clickOnElement(btnSize);
        actions.clickOnElement(btnColor);

        Thread.sleep(2000);
        actions.clickOnElement(btnAddToCart);

        Thread.sleep(5000);
        //To scroll page with JavascriptExecutor
//        WebElement myCart = driver.findElement(btnCart);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", myCart);
//        myCart.click();

        actions.clickOnElement(btnCart);

        Thread.sleep(5000);
        actions.clickOnElement(btnCheckout);
    }
}
