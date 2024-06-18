package org.alpha.sanjeevani.assignment.AssignmentNo3RegisterAccount.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToKartPage {
   private final WebDriver driver;
    private final By txtAddToCart= By.xpath("//div[text()='Sauce Labs Backpack']");
    private final By txtAddToCart1=By.id("add-to-cart");
    private final By txtAddToCart2=By.cssSelector("span[data-test=shopping-cart-badge]");

    public AddToKartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void getAddToKart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(txtAddToCart).click();
        Thread.sleep(2000);
        driver.findElement(txtAddToCart1).click();
        Thread.sleep(2000);
        driver.findElement(txtAddToCart2).click();
    }
}