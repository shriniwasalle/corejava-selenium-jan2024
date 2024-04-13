package org.alpha.shriniwas.seleniumconcepts.pom3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    private final WebDriver driver;
    private final By headingProducts = By.xpath("//span[@data-test='title']");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductsPageHeading() {
        WebElement heading = driver.findElement(headingProducts);
        return heading.getText();
    }
}
