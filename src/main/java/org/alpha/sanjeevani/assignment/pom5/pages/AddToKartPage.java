package org.alpha.sanjeevani.assignment.pom5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToKartPage {
    WebDriver driver;

    public AddToKartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getAddToKart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("span[data-test=shopping-cart-badge]")).click();
    }
}