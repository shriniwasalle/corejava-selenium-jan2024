package org.alpha.aishwarya.seleniumconcepts.pom3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
        WebDriver driver;
        private final By headingProducts = By.xpath("//span[@data-test= 'title']");


        public ProductsPage(WebDriver driver){  // Constructor calling
            this.driver = driver;
        }
        // Product Page Related
        public String getProductsPageHeading() {  // get method return type = String
            WebElement heading = driver.findElement(headingProducts);
            return heading.getText(); // return kraycha karan testLoginpage class access
        }
    }

