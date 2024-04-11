package org.alpha.tejashri.selenium.concepts.pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    public String getProductsPageHeading(WebDriver driver){

        //Product Page Related Actions
        WebElement heading = driver.findElement(By.xpath("//span[@data-test='title']"));

        return heading.getText();
    }
}