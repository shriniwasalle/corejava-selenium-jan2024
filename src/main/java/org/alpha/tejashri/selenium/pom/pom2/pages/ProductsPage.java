package org.alpha.tejashri.selenium.pom.pom2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    private final WebDriver driver;

    private final By headingProducts = By.xpath("//span[@data-test='title']");

    //created parametrised constructor
    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public String getProductsPageHeading(){

        //Product Page Related Actions
        WebElement heading = driver.findElement(headingProducts);

        return heading.getText();
    }
}
