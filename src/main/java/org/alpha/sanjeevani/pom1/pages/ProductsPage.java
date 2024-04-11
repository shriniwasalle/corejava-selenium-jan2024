package org.alpha.sanjeevani.pom1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    public String getProductPageHeading(WebDriver driver) {

        WebElement Heading = driver.findElement(By.xpath("//span[@data-test='title']"));
        return Heading.getText();
    }
}
