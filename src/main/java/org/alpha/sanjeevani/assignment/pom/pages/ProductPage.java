package org.alpha.sanjeevani.assignment.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private final WebDriver driver;
    private final By headingProducts=By.xpath("//span[@data-test='title']");

    public ProductPage(WebDriver driver) {
        this.driver=driver;
    }

    public String getProductPageHeading() {

        WebElement Heading = driver.findElement(headingProducts);
        return Heading.getText();
    }

}
