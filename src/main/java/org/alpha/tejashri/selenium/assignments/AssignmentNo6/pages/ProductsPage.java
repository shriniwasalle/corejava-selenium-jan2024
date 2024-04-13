package org.alpha.tejashri.selenium.assignments.AssignmentNo6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    private final WebDriver driver;

    private final By headingProducts = By.xpath("//span[@data-test='title']");

    private  final By bntItems = By.id("add-to-cart-sauce-labs-backpack");

    private  final By cartBnt = By.xpath("//a[@class='shopping_cart_link']");

    //created parametrised constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductsPageHeading() {

        //Product Page Related Actions
        WebElement heading = driver.findElement(headingProducts);

        return heading.getText();
    }

    public  void addToCart(){
        //Product Page Related Actions
        driver.findElement(bntItems).click();
        driver.findElement(cartBnt).click();
    }
}
