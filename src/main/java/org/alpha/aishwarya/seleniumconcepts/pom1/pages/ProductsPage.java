package org.alpha.aishwarya.seleniumconcepts.pom1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    public String getProductsPageHeading(WebDriver driver) {  // get method return type = String
        WebElement heading = driver.findElement(By.xpath("//span[@data-test= 'title']"));
        return heading.getText(); // return kraycha karan testLoginpage class access
    }
}
