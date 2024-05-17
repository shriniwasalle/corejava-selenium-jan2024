package org.alpha.tejashri.assignments.AssignmentNo.pages;

import org.alpha.tejashri.assignments.AssignmentNo.pageactions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Product_1_FitnessEquipmentPage {
    private final WebDriver driver;
    private final By btnGearPath = By.xpath("//span[text()='Gear']");
    private final By btnBags = By.xpath("//span[text()='Bags']");
    private final By btnActivity = By.xpath("//div[text()='Activity']");
    private final By btnYoga = By.xpath("//*[@id='narrow-by-list']/div[2]/div[2]/ol/li[1]/a");
    private final By listOfProductPath = By.xpath("//li[@class='item product product-item']");
    private final By bntAddToCart = By.xpath("//span[text()='Add to Cart']");

    PageActions actions;

    public Product_1_FitnessEquipmentPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void selectYogaKits() {
        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement btnGear = driver.findElement(btnGearPath);

        Actions act = new Actions(driver);
        act.moveToElement(btnGear).perform();

        actions.clickOnElement(btnBags);
        actions.clickOnElement(btnActivity);
        actions.clickOnElement(btnYoga);

        List<WebElement> listOfProducts = driver.findElements(listOfProductPath);

        for (WebElement elements : listOfProducts) {
            act.moveToElement(elements).perform();
            actions.clickOnElement(bntAddToCart);
        }
    }

}
